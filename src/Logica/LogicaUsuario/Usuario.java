/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaUsuario;
import Logica.LogicaPrincipal.Encriptador;
import Logica.LogicaPrincipal.ErrorValidaciones;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombres;
    private String apellidos;
    private String email;
    private String cedula;
    private String usernames;
    private String password;
    private String usetype;
    private Encriptador cryp;
    private String pin;

  
    public Usuario(String nombres, String apellidos, String email, String cedula, String username, String password, String pin)throws SQLException, ErrorValidaciones{
        cryp = new Encriptador();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.usernames = cryp.encriptar(username);
        this.password = cryp.encriptar(password);
        this.cedula = cedula;
        this.pin = pin;
    }
    public Usuario(String nombres, String apellidos, String username, String email) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
        cryp = new Encriptador();
        this.usernames = cryp.desencriptar(username);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;     
    }


    public String getUsetype() {
        return usetype;
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getCedula() {
        return cedula;
    }

    public String getPin() {
        return pin;
    }

    public String getUsernames() {
        return usernames;
    }

    public String getPassword() {
        return password;
    }


    
   

 

  
    
}
