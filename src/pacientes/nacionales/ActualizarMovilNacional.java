/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pacientes.nacionales;

/**
 *
 * @author PC
 */
public class ActualizarMovilNacional extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActualizarMovilNacional
     */
    public ActualizarMovilNacional() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroHC = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtFieldNumeroHC = new javax.swing.JTextField();
        txtFieldTelefono = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(820, 640));
        setPreferredSize(new java.awt.Dimension(820, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroHC.setText("N° historia clínica: ");
        getContentPane().add(lblNumeroHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 29, -1, -1));

        lblTelefono.setText("Nuevo número de teléfono móvil: ");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 72, -1, -1));
        getContentPane().add(txtFieldNumeroHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 26, -1, -1));

        txtFieldTelefono.setText("09");
        getContentPane().add(txtFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 69, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNumeroHC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtFieldNumeroHC;
    private javax.swing.JTextField txtFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
