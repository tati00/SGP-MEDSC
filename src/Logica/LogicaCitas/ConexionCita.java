/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaCitas;

import Logica.Database.Conexion;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class ConexionCita extends Conexion{
    List<Cita> citas;
    
    public void postCita(Cita cita) throws SQLException{
        conectar();
         String sql = "INSERT INTO cita_medica(id_medico, cedula_paciente, "
                 + "nombre_paciente, Apellido_paciente, fecha, hora) VALUES (?,?,?,?,?,?)";
         
        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(sql);
        preparedStatement.setString(1, cita.getMedico());
        preparedStatement.setString(2, cita.getCedula());
        preparedStatement.setString(3, cita.getNombres());
        preparedStatement.setString(4, cita.getApellidos());
        preparedStatement.setDate(5, (java.sql.Date) cita.getFecha());
        preparedStatement.setString(6, cita.getHora());

            // Ejecutar la inserción
        int filasInsertadas = preparedStatement.executeUpdate();
        cerrarConexión();
        
    }    
    public boolean verificarCita(String cedula) throws SQLException{
        boolean correcto;
        conectar();
        String consulta = "SELECT CASE WHEN EXISTS (SELECT * FROM dbo.cita_medica WHERE  cedula_paciente = ?) THEN 1 ELSE 0 END";
            
        // Crear una sentencia preparada
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, cedula); // user_parametro_value
            
        ResultSet resultSet = preparedStatement.executeQuery();  
        resultSet.next();
        correcto = resultSet.getBoolean(1);            
        resultSet.close();
        preparedStatement.close();
        cerrarConexión();
        return correcto;        
    }
    
    public FechaCita consultarFechayHora(String cedula) throws SQLException{
        conectar();
        String consulta = "SELECT fecha, hora FROM dbo.cita_medica WHERE cedula_paciente =  ?;";
        FechaCita user = null;
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, cedula); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            user = new FechaCita(resultSet.getDate("fecha"),resultSet.getString("hora"));
        }
        return user;      
    }
    
    public void ActualizarFechayHora(Date nuevaFecha,String nuevaHora,String code) throws SQLException{
        conectar();
        String updateQuery = "UPDATE dbo.cita_medica SET fecha = ?, hora = ? WHERE id_cita = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setDate(1, (java.sql.Date) nuevaFecha);
        preparedStatement.setString(2, nuevaHora);
        preparedStatement.setString(3, code);              
        int rowsAffected = preparedStatement.executeUpdate();
                
        if (rowsAffected > 0) {
            System.out.println("Nombre de usuario actualizado exitosamente.");
        }
        cerrarConexión();        
    }
    public List consultarCitasPaciente(String cedula) throws SQLException{  
        conectar();
        citas = new ArrayList<>();
        String consulta = "SELECT id_cita, nombre_paciente, apellido_paciente, "
                + "fecha,hora,LEFT(nombres_medico, CHARINDEX(' ', nombres_medico + ' ') - 1) +' '+ LEFT(apellidos_medico, CHARINDEX(' ', apellidos_medico + ' ') - 1) AS medico "
                + "FROM dbo.cita_medica u JOIN dbo.medicos m ON u.id_medico = m.id_medico WHERE cedula_paciente =  ?;";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setString(1, cedula); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) { 
            citas.add(new Cita(resultSet.getString("id_cita"),resultSet.getString("nombre_paciente"),resultSet.getString("apellido_paciente"),
                    resultSet.getDate("fecha"),resultSet.getString("hora"),resultSet.getString("medico")));
        }
         return citas;
    }
    public List consultarListaDeCitas(java.sql.Date inicio, java.sql.Date fin) throws SQLException{
        conectar();
        citas = new ArrayList<>();
        String consulta = "SELECT id_cita, nombre_paciente,apellido_paciente,fecha,hora,LEFT(nombres_medico, CHARINDEX(' ', nombres_medico + ' ') - 1) +' '+ LEFT(apellidos_medico, CHARINDEX(' ', apellidos_medico + ' ') - 1) AS medico\n" +
"FROM dbo.cita_medica u JOIN dbo.medicos m ON u.id_medico = m.id_medico WHERE u.fecha BETWEEN ? AND ?";
        PreparedStatement preparedStatement = conex.prepareStatement(consulta);
        preparedStatement.setDate(1, inicio); // user_parametro_value
        preparedStatement.setDate(2, fin); // user_parametro_value
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) { 
            citas.add(new Cita(resultSet.getString("id_cita"),resultSet.getString("nombre_paciente"),resultSet.getString("apellido_paciente"),
                    resultSet.getDate("fecha"),resultSet.getString("hora"),resultSet.getString("medico")));
        }
        return citas;
    }
    public void eliminarCita(String code) throws SQLException{
        conectar();
        String updateQuery = "DELETE FROM dbo.cita_medica WHERE id_cita = ?";
            
        PreparedStatement preparedStatement = conex.prepareStatement(updateQuery);
        preparedStatement.setString(1, code);
        int rowsAffected = preparedStatement.executeUpdate();
                
        cerrarConexión();   
    }
   
}
