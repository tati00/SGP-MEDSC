/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pacientes.nacionales;

/**
 *
 * @author PC
 */
public class EnfermedadPreexistenteNacional extends javax.swing.JInternalFrame {

    /**
     * Creates new form EnfermedadPreexistenteNacional
     */
    public EnfermedadPreexistenteNacional() {
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
        lblMedicamento = new javax.swing.JLabel();
        lblTratamiento = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldTiempo = new javax.swing.JTextField();
        txtFieldMedicamentos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();

        setMinimumSize(new java.awt.Dimension(820, 640));
        setPreferredSize(new java.awt.Dimension(820, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText("Nombre de la enfermedad: ");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblTiempo.setText("Tiempo: ");
        getContentPane().add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        lblMedicamento.setText("Medicamentos: ");
        getContentPane().add(lblMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        lblTratamiento.setText("Tratamiento: ");
        getContentPane().add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));
        getContentPane().add(txtFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 234, -1));
        getContentPane().add(txtFieldTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 42, -1));
        getContentPane().add(txtFieldMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 234, -1));

        txtTratamiento.setColumns(20);
        txtTratamiento.setRows(5);
        jScrollPane1.setViewportView(txtTratamiento);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedicamento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JTextField txtFieldMedicamentos;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldTiempo;
    private javax.swing.JTextArea txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
