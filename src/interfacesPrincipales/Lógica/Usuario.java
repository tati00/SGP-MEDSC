/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesPrincipales.Lógica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombres;
    private String apellidos;
    private String email;
    private String cedula;
    private String tipoUsuario;
    private String usernames;
    private String password;

    public Usuario(String nombres, String apellidos, String email, String cedula, String tipoUsuario, String username, String password)throws UsuarioParametrosInvalidos {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.cedula = cedula;
        this.tipoUsuario = tipoUsuario;
        this.usernames = username;
                System.out.println("Uname:  "+usernames);
        this.password = password;
        validarDatos();
    }
    
    private void validarDatos() throws UsuarioParametrosInvalidos{
        
        if (!validarNombre()){
            throw new UsuarioParametrosInvalidos("El nombre es Invalido");
        }
        if (!validarApellido()){
            throw new UsuarioParametrosInvalidos("El Apellido es Invalido");
        }        
        if (!validarEmail()){
            throw new UsuarioParametrosInvalidos("El correo electrónico es incorrecto");
        }
        if (!verificarCedula()){
            throw new UsuarioParametrosInvalidos("El Número de cédula es Invalido");
        }
        if (usernames.isBlank()){
            throw new UsuarioParametrosInvalidos("Username Obligatorio");
        }
        if (!validarPassword(password)){
            throw new UsuarioParametrosInvalidos("Contraseña Debil"); 
        }
    }
    private boolean validarNombre(){
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombres);
        return matcher.matches();
    }
    private boolean validarApellido(){
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(apellidos);
        return matcher.matches();
    }
    private boolean validarEmail(){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z]+(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private boolean verificarCedula() {  
     int total = 0;  
     int tamanoLongitudCedula = 10;  
     int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};  
     int numeroProviancias = 24;  
     int tercerdigito = 6;  
     if (cedula.matches("[0-9]*") && cedula.length() == tamanoLongitudCedula) {  
       int provincia = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));  
       int digitoTres = Integer.parseInt(cedula.charAt(2) + "");  
       if ((provincia > 0 && provincia <= numeroProviancias) && digitoTres < tercerdigito) {  
         int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9) + "");  
         for (int i = 0; i < coeficientes.length; i++) {  
           int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i) + "");  
           total = valor >= 10 ? total + (valor - 9) : total + valor;  
         }  
         int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;  
         if (digitoVerificadorObtenido == digitoVerificadorRecibido) {  
           return true;  
         }  
       }  
       return false;  
     }  
     return false;  
   } 
    
    public static boolean validarPassword(String username) {
        // Contraseña debe tener letra mayuscula, maniscula, número, caracterEspecial.
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=*]).+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

  
    
}
