/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaPrincipal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class ValidaciónUsuario {
    public static boolean validarNombre(String nombres){
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombres);
        return matcher.matches();
    }
    public static boolean validarApellido(String apellidos){
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(apellidos);
        return matcher.matches();
    }
    public static boolean validarEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z]+(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean verificarCedula(String cedula) {  
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
    
    
    public static boolean validarPassword(String username) throws UsuarioParametrosInvalidos {
        if (username.length() < 10){
            throw new UsuarioParametrosInvalidos("La contraseña debe tener 10 caracteres.");
        }
        // Contraseña debe tener letra mayuscula, maniscula, número, caracterEspecial.
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=*]).+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
