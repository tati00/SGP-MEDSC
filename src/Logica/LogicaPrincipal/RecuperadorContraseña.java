/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaPrincipal;

import com.sun.jdi.connect.Transport;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

/**
 *
 * @author Usuario
 */
public class RecuperadorContraseña {
    public void recuperarContraseña(String correo,String newPassword){
        // Credenciales de la cuenta de correo electrónico que enviará el mensaje
        final String username = "tu_correo@gmail.com"; // Cambiar
        final String password = "tu_contraseña"; // Cambiar

        // Propiedades de configuración para el servidor SMTP de Gmail
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true"); // Habilitar autenticación
        props.put("mail.smtp.starttls.enable", "true"); // Habilitar TLS
        props.put("mail.smtp.host", "smtp.gmail.com"); // Servidor SMTP de Gmail
        props.put("mail.smtp.port", "587"); // Puerto seguro para TLS

        // Crear una sesión de correo electrónico con autenticación
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correo, newPassword);
            }
        });

        try {
            // Crear un mensaje de correo
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); // Remitente
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("correo_destino@example.com")); // Destinatario
            message.setSubject("Recuperación de contraseña"); // Asunto
            message.setText("Para restablecer tu contraseña, haz clic en este enlace: http://tuapp.com/reset?token=token_generado"); // Cuerpo del mensaje

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo electrónico enviado exitosamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
