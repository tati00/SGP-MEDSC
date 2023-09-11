/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaMedicos;

import Logica.Database.Conexion;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Usuario
 */
public class ConexionMedicos extends Conexion {
    public void postMedico(Medico medico) throws SQLException{
        conectar();
         String sql = "INSERT INTO medicos(id_medico,nombres_medico,apellidos_medico,celular_medico,email_medico,especialidad_medico,direccion_medico) VALUES (?,?,?,?,?,?,?)";
         
        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(sql);
        preparedStatement.setString(1, medico.getCedula());
        preparedStatement.setString(2, medico.getNombres());
        preparedStatement.setString(3, medico.getApellidos());
        preparedStatement.setString(4, medico.getNumeroCelular());
         preparedStatement.setString(5, medico.getEmail());
        preparedStatement.setString(6, medico.getEspecialidad());
        preparedStatement.setString(7, medico.getDireccion());
            // Ejecutar la inserción
        int filasInsertadas = preparedStatement.executeUpdate();
        cerrarConexión();      
    }    
    
    public boolean verificarEstaRegistrado(String id) throws SQLException{
        boolean correcto;
        conectar();
        String consulta = "SELECT CASE WHEN EXISTS (SELECT * FROM dbo.medicos WHERE  id_medico = ?) THEN 1 ELSE 0 END";
            
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
    
    public Medico consultarInfoMedico(String id) throws SQLException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
        conectar();
        String consulta = "SELECT nombres_medico,apellidos_medico,celular_medico,email_medico,especialidad_medico,direccion_medico FROM dbo.medicos WHERE id_medico =  ?;";
        Medico medico = null;
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, id); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            medico = new Medico(resultSet.getString("nombres_medico"),resultSet.getString("apellidos_medico"),resultSet.getString("celular_medico")
            ,resultSet.getString("email_medico"),resultSet.getString("especialidad_medico"),resultSet.getString("direccion_medico"));
        }
        return medico;
    }
    public String consultarParametroPorId(String parametro, String text) throws SQLException {
        conectar();
        String valor = null;
        String consulta = "SELECT "+parametro+" FROM dbo.medicos WHERE id_medico = ?";
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
    public void actualizarAtributo(String parametro, String id, String nuevo) throws SQLException{
        conectar();
        String updateQuery = "UPDATE dbo.medicos SET "+parametro+" = ? WHERE id_medico = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setString(1, nuevo);
        preparedStatement.setString(2, id);
                
        int rowsAffected = preparedStatement.executeUpdate();
        cerrarConexión();
    }    
    public void eliminarUsuario(String text) throws SQLException {
        conectar();
        String updateQuery = "DELETE FROM dbo.medicos WHERE id_medico = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setString(1, text);

                
        int rowsAffected = preparedStatement.executeUpdate();
                
        cerrarConexión();        
    }   
    public Map consultarMedicos() throws SQLException{  
        conectar();    
        Map<String, String> medicos = new HashMap<>();
        String consulta = "SELECT LEFT(nombres_medico, CHARINDEX(' ', nombres_medico + ' ') - 1) +' '+ LEFT(apellidos_medico, CHARINDEX(' ', apellidos_medico + ' ') - 1) AS medico, id_medico  FROM medicos";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) { 
           medicos.put(resultSet.getString("medico"), resultSet.getString("id_medico"));
        }
        return medicos;
    }      
    
    public Map consultarEspecialidades() throws SQLException{  
        conectar();    
        Map<String, String> medicos = new HashMap<>();
        String consulta = "SELECT especialidad_medico,LEFT(nombres_medico, CHARINDEX(' ', nombres_medico + ' ') - 1) +' '+ LEFT(apellidos_medico, CHARINDEX(' ', apellidos_medico + ' ') - 1) AS medico  FROM medicos";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) { 
           medicos.put(resultSet.getString("medico"),resultSet.getString("especialidad_medico"));
        }
        return medicos;
    }
}
