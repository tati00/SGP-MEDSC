/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaPrincipal;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    private ConexiónUsuarios user;

  
    public Usuario(String nombres, String apellidos, String email, String cedula, String username, String password)throws UsuarioParametrosInvalidos, SQLException {
        if (cedula.isBlank()|| nombres.isBlank() || apellidos.isBlank() || email.isBlank() || username.isBlank() || password.isBlank()){
            throw new UsuarioParametrosInvalidos("¡Ingrese todos los datos solicitados!.");
        }
        cryp = new Encriptador();
        user = new ConexiónUsuarios();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.usernames = cryp.encriptar(username);
        this.password = cryp.encriptar(password);
        this.cedula = cedula;

        validarDatos();
    }
    public Usuario(String nombres, String apellidos, String username, String email) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
        cryp = new Encriptador();
        this.usernames = cryp.desencriptar(username);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getUsernames() {
        return usernames;
    }

    public String getPassword() {
        return password;
    }


    
    private void validarDatos() throws UsuarioParametrosInvalidos, SQLException{
        
        if (!ValidaciónUsuario.verificarCedula(cedula)){
            throw new UsuarioParametrosInvalidos("Ingrese un número de cédula válido.");
        }
        if (user.verificarEstaRegistrado(cedula)){
            throw new UsuarioParametrosInvalidos("El número de cédula ya está registrado.");
        }
        if (!ValidaciónUsuario.validarNombre(nombres)){
            throw new UsuarioParametrosInvalidos("Ingrese nombres válidos.");
        }
        if (!ValidaciónUsuario.validarApellido(apellidos)){
            throw new UsuarioParametrosInvalidos("Ingrese apellidos válidos.");
        }        
        if (!ValidaciónUsuario.validarEmail(email)){
            throw new UsuarioParametrosInvalidos("Ingrese un correo electrónico válido.");
        }
        if (!ValidaciónUsuario.validarPassword(password)){
            throw new UsuarioParametrosInvalidos("Ingrese una contraseña válida."); 
        }
    }
   

 

  
    
}
