/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaUsuario;


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
         String sql = "INSERT INTO Usuarios(id_usuario, nombres_user,apellidos_user,email_user,username,contrasena,pin) VALUES (?,?,?,?,?,?,?);";
         
        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(sql);
        preparedStatement.setString(1, user.getCedula());
        preparedStatement.setString(2, user.getNombres());
        preparedStatement.setString(3, user.getApellidos());
        preparedStatement.setString(4, user.getEmail());
         preparedStatement.setString(5, user.getUsernames());
        preparedStatement.setString(6, user.getPassword());
        preparedStatement.setString(7, user.getPin());
            // Ejecutar la inserción
        int filasInsertadas = preparedStatement.executeUpdate();

        cerrarConexión();
        
    }
    public boolean verificarParametro(String parametro, String value) throws SQLException{
        boolean correcto;
        conectar();
        String consulta = "SELECT CASE WHEN EXISTS (SELECT * FROM dbo.usuarios WHERE " + parametro + " = ?) THEN 1 ELSE 0 END";
            
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
    
    public boolean verificarEstaRegistrado(String id) throws SQLException{
        boolean correcto;
        conectar();
        String consulta = "SELECT CASE WHEN EXISTS (SELECT * FROM dbo.usuarios WHERE  id_usuario = ?) THEN 1 ELSE 0 END";
            
        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, id); // user_parametro_value
            
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
        String consulta = "SELECT tipo_usuario FROM dbo.usuarios WHERE username = ?";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, value); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();  
        if (resultSet.next()) {
            valor = resultSet.getString("tipo_usuario"); // Obtén el valor del resultado y asígnalo a la variable
        }
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return valor;
    }
    
 
    public Usuario consultarInfoUsuario(String id) throws SQLException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
        conectar();
        String consulta = "SELECT nombres_user,apellidos_user,username,email_user FROM dbo.usuarios WHERE id_usuario =  ?;";
        Usuario user = null;
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, id); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            user = new Usuario(resultSet.getString("nombres_user"),resultSet.getString("apellidos_user"),resultSet.getString("username")
            ,resultSet.getString("email_user"));
        }
        return user;
    }
    
    public void actualizarAtributo(String parametro, String id, String nuevo) throws SQLException{
        conectar();
        String updateQuery = "UPDATE dbo.usuarios SET "+parametro+" = ? WHERE id_usuario = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setString(1, nuevo);
        preparedStatement.setString(2, id);
                
        int rowsAffected = preparedStatement.executeUpdate();
                
        cerrarConexión();
    }

    public String consultarParametroPorId(String parametro, String text) throws SQLException {
        conectar();
        String valor = null;
        String consulta = "SELECT "+parametro+" FROM dbo.usuarios WHERE id_usuario = ?";
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
    public String consultarEmail() throws SQLException{
        conectar();
        String valor = null;
        String consulta = "SELECT email_user FROM dbo.usuarios WHERE tipo_usuario = 'Medico Principal'";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            valor = resultSet.getString("email"); // Obtén el valor del resultado y asígnalo a la variable
        }
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return valor;
    }

    public void eliminarUsuario(String text) throws SQLException {
        conectar();
        String updateQuery = "DELETE FROM dbo.usuarios WHERE id_usuario = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setString(1, text);

                
        int rowsAffected = preparedStatement.executeUpdate();
                
        cerrarConexión();        
    }

    public String consultarPassword(String text) throws SQLException {
        conectar();
        String valor = null;
        String consulta = "SELECT contrasena FROM dbo.usuarios WHERE id_usuario = ?";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
               preparedStatement.setString(1, text); 
        ResultSet resultSet = preparedStatement.executeQuery();      
        if (resultSet.next()) {
            valor = resultSet.getString("contrasena"); // Obtén el valor del resultado y asígnalo a la variable
        }
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return valor;        
    }
    
}
