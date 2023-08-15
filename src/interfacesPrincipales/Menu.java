/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesPrincipales;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private int intentos;
    public Menu() {
        initComponents();
        this.setTitle("SISTEMA DE GESTIÓN DE PACIENTES PARA LA CLÍNICA MEDSC");
        this.setLocationRelativeTo(null);
        this.intentos = 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClinica = new javax.swing.JLabel();
        lblUsuarioIcon = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtFldUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        lblContraseñaIcon = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(650, 433));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClinica.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblClinica.setText("Clínica Illicachi Manzano");
        getContentPane().add(lblClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        lblUsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user25px.png"))); // NOI18N
        getContentPane().add(lblUsuarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 250, -1));

        txtFldUsuario.setText("Usuario");
        txtFldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFldUsuarioFocusLost(evt);
            }
        });
        getContentPane().add(txtFldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 250, -1));

        jPasswordField.setText("Contraseña");
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, -1));

        lblContraseñaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/password25px-m.png"))); // NOI18N
        getContentPane().add(lblContraseñaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/luxa.org-opacity-changed-pexels-mart-production-7088498.jpg"))); // NOI18N
        lblFondo.setToolTipText("");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));
        lblFondo.getAccessibleContext().setAccessibleName("jLabelFondo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
        String passcode = "Abcd3";//descifrarContraseña();
        System.out.println(passcode + intentos);
        if (!(txtFldUsuario.getText().equals("grupo1")  && passcode.equals("Abcd3"))){
            intentos++;
            if (intentos > 0 && intentos < 3) {
                JOptionPane.showMessageDialog(null, "Revise sus datos proporcionados. Intentos restantes: " + (3 - intentos), "INGRESO FALLIDO", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de intentos. Se bloqueará el acceso.", "INGRESO FALLIDO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            SGP_MEDSC sgci = new SGP_MEDSC();
            sgci.setVisible(true);
            
            //limpiarBoxes();
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void limpiarBoxes(){
        txtFldUsuario.setText("");
        jPasswordField.setText("");
    }
    private void txtFldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldUsuarioFocusGained
        // TODO add your handling code here:
        if (txtFldUsuario.getText().equals("Usuario")) {
            txtFldUsuario.setText("");
            txtFldUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFldUsuarioFocusGained

    private void txtFldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldUsuarioFocusLost
        // TODO add your handling code here:
        if (txtFldUsuario.getText().isEmpty()) {
            txtFldUsuario.setForeground(Color.GRAY);
            txtFldUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txtFldUsuarioFocusLost

    private String descifrarContraseña() {
        String passcode = "";
        char[] password = jPasswordField.getPassword();
        for(int i = 0; i < password.length; i++){
            passcode += password[i];
        }
        return passcode;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel lblClinica;
    private javax.swing.JLabel lblContraseñaIcon;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblUsuarioIcon;
    private javax.swing.JTextField txtFldUsuario;
    // End of variables declaration//GEN-END:variables
}
