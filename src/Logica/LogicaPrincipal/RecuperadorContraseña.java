/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaPrincipal;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.activation.*;
import javax.mail.Authenticator;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RecuperadorContraseña {
    final String password = "qypqkqwnwhjkqovt"; // CAMBIAR: TOKEN generado en Gmail->contraseñas de apliaciones
    public void recuperarContraseña(String emisor,String receptor,String newPassword){
        //final String username = "esteban.45.bd@gmail.com"; // Cambia esto
     
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Cambia esto para tu proveedor de correo
        props.put("mail.smtp.port", "587"); // Cambia esto para el puerto de tu proveedor de correo
        props.put("mail.smtp.ssl.trust","*");

        // Iniciar una nueva sesión con autenticación
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emisor, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emisor));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receptor)); // Cambia esto
            message.setSubject("Recuperación de Contraseña");
            message.setText("Usuario de SGP-MEDSC tu contraseña es : "+newPassword+ "se recomienda que solicites el cambio de contraseña.");

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo electrónico enviado con éxito.");
        } catch (MessagingException e) {
            System.out.print(e.getMessage());
        }
  
    }

}
