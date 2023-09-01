/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesPacientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPacientes {
    
    public static Connection getConexion(){
        
    String url = "jdbc:sqlserver://localhost:1433;databaseName=SGP;integratedSecurity=false;encrypt=false;trustServerCertificate=true;"
                + "user=sa;"
                + "password=P@ssw0rd.;"
                + "loginTimeout=10;";
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
