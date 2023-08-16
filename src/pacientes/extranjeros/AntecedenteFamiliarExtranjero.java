/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pacientes.extranjeros;

import pacientes.nacionales.*;

/**
 *
 * @author PC
 */
public class AntecedenteFamiliarExtranjero extends javax.swing.JInternalFrame {

    /**
     * Creates new form AntecedentesFamiliares
     */
    public AntecedenteFamiliarExtranjero() {
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

        lblNombre = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        lblTratamiento = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldTiempo = new javax.swing.JTextField();
        txtFieldGrado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(820, 640));
        setPreferredSize(new java.awt.Dimension(820, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText("Nombre de la enfermedad: ");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        lblTiempo.setText("Tiempo: ");
        getContentPane().add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        lblGrado.setText("Grado de ascendencia: ");
        getContentPane().add(lblGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        lblTratamiento.setText("Tratamiento: ");
        getContentPane().add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));
        getContentPane().add(txtFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 234, -1));
        getContentPane().add(txtFieldTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 234, -1));
        getContentPane().add(txtFieldGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 234, -1));

        txtTratamiento.setColumns(20);
        txtTratamiento.setRows(5);
        jScrollPane1.setViewportView(txtTratamiento);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 610, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JTextField txtFieldGrado;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldTiempo;
    private javax.swing.JTextArea txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
