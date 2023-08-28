/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaPrincipal;

import Logica.Database.Conexion;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Usuario
 */
public class ConexiónUsuarios extends Conexion {
    
    
    public void postUsuario(Usuario user) throws SQLException{
        conectar();
        String sql = "INSERT INTO dbo.Usuarios" +
                     " (Id_usuario,Nom_usuario,Ape_usuario,Email_usuario,User_nameU,Passwd_user)" +
                     " VALUES (?, ?, ?, ?, ?, ?)";

        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(sql);
        preparedStatement.setString(1, user.getCedula());
        preparedStatement.setString(2, user.getNombres());
        preparedStatement.setString(3, user.getApellidos());
        preparedStatement.setString(4, user.getEmail());
        preparedStatement.setString(5, user.getUsernames());
        preparedStatement.setString(6, user.getPassword());

            // Ejecutar la inserción
        int filasInsertadas = preparedStatement.executeUpdate();

        if (filasInsertadas > 0) {
            System.out.println("Datos insertados exitosamente.");
        } else {
            System.out.println("No se insertaron datos.");
        }
        cerrarConexión();
        
    }
    public boolean verificarParametro(String parametro, String value) throws SQLException{
        boolean correcto;
        conectar();
        String consulta = "SELECT CASE WHEN EXISTS (SELECT * FROM dbo.Usuarios WHERE " + parametro + " = ?) THEN 1 ELSE 0 END";
            
        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, value); // user_parametro_value
            
        ResultSet resultSet = preparedStatement.executeQuery();  
        resultSet.next();
        correcto = resultSet.getBoolean(1);            
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return correcto;
    }
    public String consultarTipoUsuario(String value) throws SQLException{
        conectar();
        String valor = null;
        String consulta = "SELECT Tipo_usuario FROM dbo.Usuarios WHERE User_nameU = ?";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, value); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();  
        if (resultSet.next()) {
            valor = resultSet.getString("Tipo_usuario"); // Obtén el valor del resultado y asígnalo a la variable
        }
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return valor;
    }
    
    public Usuario consultarInfoUsuario(String id) throws SQLException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
        conectar();
        String consulta = "SELECT Nom_usuario,Ape_usuario,User_nameU, Email_usuario,Tipo_usuario FROM dbo.Usuarios WHERE Id_usuario = ?";
        Usuario user = null;
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, id); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            user = new Usuario(resultSet.getString("Nom_usuario"),resultSet.getString("Ape_usuario"),resultSet.getString("User_nameU")
            ,resultSet.getString("Email_usuario"),resultSet.getString("Tipo_usuario"));
        } else {
            System.out.println("No se encontraron resultados para el ID de usuario proporcionado.");
        }
        return user;
    }
    
    public void actualizarAtributo(String parametro, String id, String nuevo) throws SQLException{
        conectar();
        String updateQuery = "UPDATE dbo.Usuarios SET "+parametro+" = ? WHERE Id_usuario = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setString(1, nuevo);
        preparedStatement.setString(2, id);
                
        int rowsAffected = preparedStatement.executeUpdate();
                
        if (rowsAffected > 0) {
            System.out.println("Nombre de usuario actualizado exitosamente.");
        } else {
            System.out.println("No se encontró el nombre de usuario para actualizar.");
        }  
        cerrarConexión();
    }

    public String consultarParametroPorId(String parametro, String text) throws SQLException {
        conectar();
        String valor = null;
        String consulta = "SELECT "+parametro+" FROM dbo.Usuarios WHERE Id_usuario = ?";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, text); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();  
        if (resultSet.next()) {
            valor = resultSet.getString(parametro); // Obtén el valor del resultado y asígnalo a la variable
        }
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return valor;
    }
    
}
