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
public class InformacionPersonalExtranjero extends javax.swing.JInternalFrame {

    /**
     * Creates new form InformacionPersonalNacio
     */
    public InformacionPersonalExtranjero() {
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

        lblPasaporte = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefonoMovil = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblTrabajo = new javax.swing.JLabel();
        lblTipoSangre = new javax.swing.JLabel();
        lblSituacionEconomica = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtFieldCedula = new javax.swing.JTextField();
        txtFieldNombres = new javax.swing.JTextField();
        txtFieldApellidos = new javax.swing.JTextField();
        txtFieldDireccion = new javax.swing.JTextField();
        txtFieldTelefono = new javax.swing.JTextField();
        txtFieldEdad = new javax.swing.JTextField();
        txtFieldSituacion = new javax.swing.JTextField();
        txtFieldTrabajo = new javax.swing.JTextField();
        rdBtnFemenino = new javax.swing.JRadioButton();
        rdBtnMasculino = new javax.swing.JRadioButton();
        txtFieldCorreo = new javax.swing.JTextField();
        cbxTipoSangre = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(820, 640));
        setPreferredSize(new java.awt.Dimension(820, 640));

        lblPasaporte.setText("N° pasaporte: ");

        lblNombres.setText("Nombres: ");

        lblApellidos.setText("Apellidos: ");

        lblDireccion.setText("Dirección domiciliaria: ");

        lblTelefonoMovil.setText("N° teléfono móvil: ");

        lblEdad.setText("Edad: ");

        lblSexo.setText("Sexo: ");

        lblTrabajo.setText("Tipo de trabajo: ");

        lblTipoSangre.setText("Tipo de sangre: ");

        lblSituacionEconomica.setText("Situación económica: ");

        lblCorreoElectronico.setText("Correo electrónico: ");

        txtFieldTelefono.setText("09");

        rdBtnFemenino.setText("Femenino");

        rdBtnMasculino.setText("Masculino");

        cbxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-\t", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel1.setText("Estado Civil: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Divorciado(a)", "Unión libre", "Viudo(a)" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(lblApellidos)
                        .addGap(15, 15, 15)
                        .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblDireccion)
                        .addGap(9, 9, 9)
                        .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblTelefonoMovil)
                        .addGap(10, 10, 10)
                        .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(18, 18, 18)
                                .addComponent(rdBtnFemenino)
                                .addGap(24, 24, 24)
                                .addComponent(rdBtnMasculino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(18, 18, 18)
                                .addComponent(txtFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(lblCorreoElectronico)
                            .addGap(16, 16, 16)
                            .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipoSangre)
                                        .addGap(17, 17, 17)
                                        .addComponent(cbxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTrabajo)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtFieldTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSituacionEconomica)
                                    .addGap(13, 13, 13)
                                    .addComponent(txtFieldSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasaporte)
                            .addComponent(lblNombres))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasaporte))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNombres))
                    .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellidos)
                    .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoMovil)
                    .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEdad)
                    .addComponent(txtFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdBtnFemenino)
                        .addComponent(lblSexo))
                    .addComponent(rdBtnMasculino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrabajo)
                    .addComponent(txtFieldTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoSangre)
                    .addComponent(cbxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSituacionEconomica)
                    .addComponent(txtFieldSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxTipoSangre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPasaporte;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSituacionEconomica;
    private javax.swing.JLabel lblTelefonoMovil;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTrabajo;
    private javax.swing.JRadioButton rdBtnFemenino;
    private javax.swing.JRadioButton rdBtnMasculino;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldCedula;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldDireccion;
    private javax.swing.JTextField txtFieldEdad;
    private javax.swing.JTextField txtFieldNombres;
    private javax.swing.JTextField txtFieldSituacion;
    private javax.swing.JTextField txtFieldTelefono;
    private javax.swing.JTextField txtFieldTrabajo;
    // End of variables declaration//GEN-END:variables
}
