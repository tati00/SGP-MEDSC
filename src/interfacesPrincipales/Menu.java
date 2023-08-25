/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesPrincipales;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Menu extends javax.swing.JFrame {

    private int intentos;
    public static String jtf;
    private Timer timer;

    public Menu() {
        initComponents();
        timer = new Timer(30 * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableLoginForm();
            }
        });
        timer.setRepeats(false);
        this.setTitle("SISTEMA DE GESTIÓN DE PACIENTES PARA LA CLÍNICA MEDSC");
        this.setLocationRelativeTo(null);
        this.intentos = 0;
        this.jtf = " ";
    }

    private void enableLoginForm() {
        txtFldUsuario.setEnabled(true);
        jPasswordField.setEnabled(true);
        btnIniciarSesion.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuarioIcon = new javax.swing.JLabel();
        cbTipoDeUsuarios = new javax.swing.JComboBox<>();
        btnIniciarSesion = new javax.swing.JButton();
        txtFldUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        lblContraseñaIcon = new javax.swing.JLabel();
        lblClinica = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnReseatPass = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(650, 433));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user25px.png"))); // NOI18N
        getContentPane().add(lblUsuarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        cbTipoDeUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principal", "General" }));
        getContentPane().add(cbTipoDeUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(102, 163, 229));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 250, -1));

        txtFldUsuario.setText("Usuario");
        txtFldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtFldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 250, -1));

        jPasswordField.setText("Contraseña");
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 250, -1));

        lblContraseñaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/password25px-m.png"))); // NOI18N
        getContentPane().add(lblContraseñaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        lblClinica.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblClinica.setText("Clínica MEDSC");
        getContentPane().add(lblClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 40));

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 255));
        btnRegistrar.setText("Registrarse");
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 100, 30));

        btnReseatPass.setBackground(new java.awt.Color(153, 255, 255));
        btnReseatPass.setText("Resetear Contraseña");
        getContentPane().add(btnReseatPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 150, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/luxa.org-opacity-changed-pexels-mart-production-7088498.jpg"))); // NOI18N
        lblFondo.setToolTipText("");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));
        lblFondo.getAccessibleContext().setAccessibleName("jLabelFondo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String passcode = descifrarContraseña();

        switch (cbTipoDeUsuarios.getSelectedIndex()) {
            case 0:
                if (!(txtFldUsuario.getText().equals("grupo1admin") && passcode.equals("Abcd3.0"))) {
                    intentos++;
                    if (intentos > 0 && intentos < 3) {
                        JOptionPane.showMessageDialog(null, "Revise sus datos proporcionados. Intentos restantes: " + (3 - intentos), "INGRESO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        disableEnter();
                        JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de intentos. Se bloqueará el acceso por 30 segundos.", "INGRESO FALLIDO", JOptionPane.ERROR_MESSAGE);

                    }
                } else {
                    SGP_MEDSC_admin sgp = new SGP_MEDSC_admin();
                    sgp.setVisible(true);
                    jtf = txtFldUsuario.getText();
                    System.out.println(jtf + "    ");
                    this.dispose();
                }
                break;
            case 1:
                if (!(txtFldUsuario.getText().equals("grupo1") && passcode.equals("Abcd3"))) {
                    intentos++;
                    if (intentos > 0 && intentos < 3) {
                        JOptionPane.showMessageDialog(null, "Revise sus datos proporcionados. Intentos restantes: " + (3 - intentos), "INGRESO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        disableEnter();
                        JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de intentos. Se bloqueará el acceso por 30 segundos.", "INGRESO FALLIDO", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    SGP_MEDSC sgp = new SGP_MEDSC();
                    sgp.setVisible(true);
                    jtf = txtFldUsuario.getText();
                    System.out.println(jtf + "    ");
                    this.dispose();
                }
                break;
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private String descifrarContraseña() {
        String passcode = "";
        char[] password = jPasswordField.getPassword();
        for (int i = 0; i < password.length; i++) {
            passcode += password[i];
        }
        return passcode;
    }

    public JLabel getLblUsuarioIcon() {
        return lblUsuarioIcon;
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReseatPass;
    private javax.swing.JComboBox<String> cbTipoDeUsuarios;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel lblClinica;
    private javax.swing.JLabel lblContraseñaIcon;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblUsuarioIcon;
    private javax.swing.JTextField txtFldUsuario;
    // End of variables declaration//GEN-END:variables

    private void disableEnter() {
        txtFldUsuario.setEnabled(false);
        jPasswordField.setEnabled(false);
        btnIniciarSesion.setEnabled(false);
        timer.start();
    } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

}
