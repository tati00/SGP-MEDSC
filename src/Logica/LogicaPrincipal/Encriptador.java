/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaPrincipal;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Usuario
 */
public final class  Encriptador {
    private final String key = "NHLSkl6V+mYanmEeqGrirA==";// Clave fija con 16 bytes (128 bits)
    //todo:Cambiar a protected si se puede los metodos
    //Clave de Encriptación
    public String encriptar(String word) {
        try {
            // Convertir la clave en una instancia SecretKeySpec
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");

            // Inicializar el cifrador en modo de cifrado con la clave
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            // Encriptar el mensaje
            byte[] encryptedBytes = cipher.doFinal(word.getBytes());
            String encryptedMessage = Base64.getEncoder().encodeToString(encryptedBytes);
            //System.out.println(word+" "+encryptedMessage);
            return encryptedMessage;
        } catch (Exception e) {
            System.out.print(" "+e.getMessage());
        }
        return null;
    }
    public String desencriptar(String word) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
        // Convertir la clave en una instancia SecretKeySpec
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");

        // Inicializar el cifrador en modo de descifrado con la clave
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            // Descifrar el mensaje
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(word));
        String decryptedMessage = new String(decryptedBytes);

        System.out.println("Encrypted Message: " + word);
        System.out.println("Decrypted Message: " + decryptedMessage);       
        return decryptedMessage;
    }
}
