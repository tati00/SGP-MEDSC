/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesAtencion;

import interfacesCitas.*;
import interfacesPrincipales.SGP_MEDSC;
import interfacesPrincipales.SGP_MEDSC_admin;

/**
 *
 * @author Usuario
 */
public class AtencionMedica extends javax.swing.JFrame {

    /**
     * Creates new form CitaMédica
     */
    static String parametro;
    public AtencionMedica() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuREGIS = new javax.swing.JMenu();
        Consultar = new javax.swing.JMenu();
        telefonoPaciente = new javax.swing.JMenuItem();
        nombresCitas = new javax.swing.JMenuItem();
        fechaCitas = new javax.swing.JMenuItem();
        regresarMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pantalla2Layout = new javax.swing.GroupLayout(pantalla2);
        pantalla2.setLayout(pantalla2Layout);
        pantalla2Layout.setHorizontalGroup(
            pantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        pantalla2Layout.setVerticalGroup(
            pantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        menuREGIS.setText("Registrar");
        menuREGIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuREGISMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuREGIS);

        Consultar.setText("Consultar");

        telefonoPaciente.setText("Cedula Paciente");
        telefonoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoPacienteActionPerformed(evt);
            }
        });
        Consultar.add(telefonoPaciente);

        nombresCitas.setText("Fecha de atencion");
        nombresCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresCitasActionPerformed(evt);
            }
        });
        Consultar.add(nombresCitas);

        fechaCitas.setText("Medico Asignado");
        fechaCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCitasActionPerformed(evt);
            }
        });
        Consultar.add(fechaCitas);

        jMenuBar1.add(Consultar);

        regresarMenu.setText("Regresar");
        regresarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(regresarMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMenuMouseClicked
        // TODO add your handling code here:
        SGP_MEDSC_admin sgci = new SGP_MEDSC_admin();
        sgci.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarMenuMouseClicked

    private void fechaCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCitasActionPerformed
        // TODO add your handling code here:
        parametro = "Fecha";
        FormConsultarAtencionMedico formulario = new  FormConsultarAtencionMedico();
        pantalla2.removeAll();
        pantalla2.add(formulario);
        pantalla2.revalidate();
        formulario.setVisible(true);
    }//GEN-LAST:event_fechaCitasActionPerformed

    private void telefonoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoPacienteActionPerformed
        // TODO add your handling code here:
        FormConsultarAtencionPaciente formulario = new  FormConsultarAtencionPaciente();
        pantalla2.removeAll();
        pantalla2.add(formulario);
        pantalla2.revalidate();
        formulario.setVisible(true);
    }//GEN-LAST:event_telefonoPacienteActionPerformed

    private void nombresCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresCitasActionPerformed
        // TODO add your handling code here:
        parametro = "Nombres Paciente";
        FormConsultarAtencionFecha formulario = new  FormConsultarAtencionFecha();
        pantalla2.removeAll();
        pantalla2.add(formulario);
        pantalla2.revalidate();
        formulario.setVisible(true);
    }//GEN-LAST:event_nombresCitasActionPerformed

    private void menuREGISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuREGISMouseClicked
        // TODO add your handling code here:
        FormularioRegistrosAtencionPrev formulario = new FormularioRegistrosAtencionPrev(pantalla2);
        pantalla2.removeAll();
        pantalla2.add(formulario);
        pantalla2.revalidate();
        formulario.setVisible(true);
    }//GEN-LAST:event_menuREGISMouseClicked

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
            java.util.logging.Logger.getLogger(AtencionMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtencionMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtencionMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtencionMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtencionMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consultar;
    private javax.swing.JMenuItem fechaCitas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuREGIS;
    private javax.swing.JMenuItem nombresCitas;
    private javax.swing.JDesktopPane pantalla2;
    private javax.swing.JMenu regresarMenu;
    private javax.swing.JMenuItem telefonoPaciente;
    // End of variables declaration//GEN-END:variables
}
