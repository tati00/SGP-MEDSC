/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Usuario
 */
public abstract class Conexion {
    
    protected Connection conex;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=MEDSC;integratedSecurity=false;encrypt=false;trustServerCertificate=true;"
            +"loginTimeout = 10;";// define el limite de tiempo de conexión
    String passwd ="grupo1ABC"; //contraseña que maneja el motor de SQL
    String username ="grupo1"; //usuario que maneja el motor de SQL

    
    protected void conectar(){
        try{
            // Cargar el controlador JDBC
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conex = DriverManager.getConnection(url,username, passwd);
            //System.out.println("Conexión Valida");
        } catch(SQLException e){
            System.out.println("Conexión Invalida "+e.getMessage());
        }
    }
    
    protected void cerrarConexión(){
        try{
            conex.close();
            //System.out.println("Conexión Cerrada");
        } catch (SQLException e){
            System.out.println("Conexión No Cerrada");
        }
    }    
}
