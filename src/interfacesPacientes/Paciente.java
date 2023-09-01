/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfacesPacientes;

import Logica.Database.Conexion;
import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JDateChooser;
import interfacesPrincipales.Menu;
import interfacesPrincipales.SGP_MEDSC_admin;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Paciente extends javax.swing.JPanel {

    private SGP_MEDSC_admin sgpMedscAdmin;

    public Paciente(SGP_MEDSC_admin sgpMedscAdmin) {
        this.sgpMedscAdmin = sgpMedscAdmin;
        initComponents();
        cbNacionalidad.setEnabled(false);
        pnActualizarDisponibles1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnRegistrar = new javax.swing.JPanel();
        pnSubRegistrar = new javax.swing.JPanel();
        lblNumeroID = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefonoCelular = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblTrabajo = new javax.swing.JLabel();
        lblTipoSangre = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtFieldNumeroID = new javax.swing.JTextField();
        txtFieldNombres = new javax.swing.JTextField();
        txtFieldApellidos = new javax.swing.JTextField();
        txtFieldDireccion = new javax.swing.JTextField();
        txtFieldTelefono = new javax.swing.JTextField();
        txtFieldTrabajo = new javax.swing.JTextField();
        txtFieldCorreo = new javax.swing.JTextField();
        cbxTipoSangre = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        lblTipoID = new javax.swing.JLabel();
        cbTipoID = new javax.swing.JComboBox<>();
        lblNacionalidad = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lblNacimiento = new javax.swing.JLabel();
        cbNacionalidad = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        pnAbrirHC = new javax.swing.JPanel();
        lblAbrirHC = new javax.swing.JLabel();
        pnActualizar = new javax.swing.JPanel();
        pnSubActualizar = new javax.swing.JPanel();
        pnActualizarDisponibles = new javax.swing.JPanel();
        txtDisponibles = new javax.swing.JComboBox<>();
        lblDisponibles = new javax.swing.JLabel();
        lblIdentificador = new javax.swing.JLabel();
        txtNumHCAct = new javax.swing.JTextField();
        pnActCampo = new javax.swing.JPanel();
        lblNuevo = new javax.swing.JLabel();
        txtActualizarCampo = new javax.swing.JTextField();
        lblNuevoCB = new javax.swing.JLabel();
        cbEstadoCivil1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnActualizarDisponibles1 = new javax.swing.JPanel();
        lblDisponiblePass = new javax.swing.JLabel();
        lblIdentificador1 = new javax.swing.JLabel();
        txtFieldNombresAct = new javax.swing.JTextField();
        txtFieldApellidosAct = new javax.swing.JTextField();
        pnBTNActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JLabel();
        pnConsultar = new javax.swing.JPanel();
        pnSubConsultar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnActualizarDisponibles2 = new javax.swing.JPanel();
        lblIdentificador2 = new javax.swing.JLabel();
        txtNumHCAct1 = new javax.swing.JTextField();
        pnBTNConsultar = new javax.swing.JPanel();
        lblBTNConsultar = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1015, 647));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(802, 780));

        pnSubRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pnSubRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "REGISTRAR PACIENTE"));

        lblNumeroID.setText("N° del documento de identificación: ");

        lblNombres.setText("Nombres: ");

        lblApellidos.setText("Apellidos: ");

        lblDireccion.setText("Dirección domiciliaria: ");

        lblTelefonoCelular.setText("N° teléfono celular: ");

        lblSexo.setText("Sexo: ");

        lblTrabajo.setText("Ocupación: ");

        lblTipoSangre.setText("Tipo de sangre: ");

        lblCorreoElectronico.setText("Correo electrónico: ");

        txtFieldTelefono.setText("09");

        cbxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-\t", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        lblEstadoCivil.setText("Estado Civil: ");

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Divorciado(a)", "Unión libre", "Viudo(a)" }));

        lblTipoID.setText("Tipo de documento de identificación:");

        cbTipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de identidad", "Pasaporte" }));
        cbTipoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoIDActionPerformed(evt);
            }
        });

        lblNacionalidad.setText("Nacionalidad: ");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", " " }));

        lblNacimiento.setText("Fecha de nacimiento:");

        cbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Extranjero" }));

        jDateChooser.setDateFormatString("yyyy-mm-dd");

        pnAbrirHC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblAbrirHC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAbrirHC.setText("                       Abrir Historia Clinica");
        lblAbrirHC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAbrirHC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbrirHCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnAbrirHCLayout = new javax.swing.GroupLayout(pnAbrirHC);
        pnAbrirHC.setLayout(pnAbrirHCLayout);
        pnAbrirHCLayout.setHorizontalGroup(
            pnAbrirHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
            .addGroup(pnAbrirHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAbrirHC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
        );
        pnAbrirHCLayout.setVerticalGroup(
            pnAbrirHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnAbrirHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAbrirHC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnSubRegistrarLayout = new javax.swing.GroupLayout(pnSubRegistrar);
        pnSubRegistrar.setLayout(pnSubRegistrarLayout);
        pnSubRegistrarLayout.setHorizontalGroup(
            pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSubRegistrarLayout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnAbrirHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addComponent(lblDireccion)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(lblNacimiento))
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSubRegistrarLayout.createSequentialGroup()
                                                .addComponent(lblCorreoElectronico)
                                                .addGap(26, 26, 26)
                                                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(49, 49, 49)
                                    .addComponent(lblTelefonoCelular)))
                            .addGap(10, 10, 10)
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 120, Short.MAX_VALUE)
                                .addComponent(txtFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addComponent(lblApellidos)
                                    .addGap(324, 324, 324)
                                    .addComponent(lblSexo))
                                .addComponent(lblNombres)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addComponent(lblTrabajo)
                                    .addGap(66, 66, 66)
                                    .addComponent(txtFieldTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGap(379, 379, 379)
                                    .addComponent(lblTipoSangre))
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                            .addComponent(lblTipoID)
                                            .addGap(12, 12, 12)
                                            .addComponent(cbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(lblNacionalidad))
                                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                            .addComponent(lblNumeroID)
                                            .addGap(15, 15, 15)
                                            .addComponent(txtFieldNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(lblEstadoCivil)))
                                    .addGap(46, 46, 46)
                                    .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbEstadoCivil, 0, 120, Short.MAX_VALUE)
                                        .addComponent(cbNacionalidad, 0, 120, Short.MAX_VALUE))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(64, 64, 64)))
        );
        pnSubRegistrarLayout.setVerticalGroup(
            pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(cbxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(pnAbrirHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTipoID)
                                .addComponent(cbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblNacionalidad))
                                .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumeroID)
                                .addComponent(txtFieldNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstadoCivil))
                            .addGap(12, 12, 12)
                            .addComponent(lblNombres)
                            .addGap(18, 18, 18)
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblApellidos)
                                        .addComponent(lblSexo))))
                            .addGap(12, 12, 12)
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCorreoElectronico)
                                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblTelefonoCelular))
                                .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDireccion)
                                .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNacimiento)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnSubRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblTrabajo))
                                .addComponent(txtFieldTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnSubRegistrarLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(lblTipoSangre)))
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnRegistrarLayout = new javax.swing.GroupLayout(pnRegistrar);
        pnRegistrar.setLayout(pnRegistrarLayout);
        pnRegistrarLayout.setHorizontalGroup(
            pnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistrarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnSubRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        pnRegistrarLayout.setVerticalGroup(
            pnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistrarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pnSubRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar", pnRegistrar);

        pnActualizarDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        pnActualizarDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ACTUALIZAR"));

        txtDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° de teléfono celular", "Dirección Domiciliaria", "Estado Civil" }));
        txtDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisponiblesActionPerformed(evt);
            }
        });

        lblDisponibles.setText("Campos disponibles:");

        lblIdentificador.setText("N° de la historia clínica: ");

        javax.swing.GroupLayout pnActualizarDisponiblesLayout = new javax.swing.GroupLayout(pnActualizarDisponibles);
        pnActualizarDisponibles.setLayout(pnActualizarDisponiblesLayout);
        pnActualizarDisponiblesLayout.setHorizontalGroup(
            pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponiblesLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(lblDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lblIdentificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumHCAct, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnActualizarDisponiblesLayout.setVerticalGroup(
            pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponiblesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisponibles)
                    .addComponent(lblIdentificador)
                    .addComponent(txtNumHCAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnActCampo.setBackground(new java.awt.Color(255, 255, 255));
        pnActCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("ACTUALIZAR CAMPO"));

        lblNuevo.setText("Nuevo: ");

        lblNuevoCB.setText("Nuevo: ");

        cbEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Divorciado(a)", "Unión libre", "Viudo(a)" }));

        javax.swing.GroupLayout pnActCampoLayout = new javax.swing.GroupLayout(pnActCampo);
        pnActCampo.setLayout(pnActCampoLayout);
        pnActCampoLayout.setHorizontalGroup(
            pnActCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnActCampoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnActCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnActCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtActualizarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnActCampoLayout.setVerticalGroup(
            pnActCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActCampoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnActCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnActCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoCB)
                    .addComponent(cbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnActualizarDisponibles1.setBackground(new java.awt.Color(255, 255, 255));
        pnActualizarDisponibles1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ACTUALIZAR PASAPORTE"));

        lblDisponiblePass.setText("Nombres:");

        lblIdentificador1.setText("Apellidos: ");

        javax.swing.GroupLayout pnActualizarDisponibles1Layout = new javax.swing.GroupLayout(pnActualizarDisponibles1);
        pnActualizarDisponibles1.setLayout(pnActualizarDisponibles1Layout);
        pnActualizarDisponibles1Layout.setHorizontalGroup(
            pnActualizarDisponibles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(lblDisponiblePass, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNombresAct, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(lblIdentificador1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldApellidosAct, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnActualizarDisponibles1Layout.setVerticalGroup(
            pnActualizarDisponibles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnActualizarDisponibles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponiblePass)
                    .addComponent(lblIdentificador1)
                    .addComponent(txtFieldNombresAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldApellidosAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("        Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnBTNActualizarLayout = new javax.swing.GroupLayout(pnBTNActualizar);
        pnBTNActualizar.setLayout(pnBTNActualizarLayout);
        pnBTNActualizarLayout.setHorizontalGroup(
            pnBTNActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnBTNActualizarLayout.setVerticalGroup(
            pnBTNActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnSubActualizarLayout = new javax.swing.GroupLayout(pnSubActualizar);
        pnSubActualizar.setLayout(pnSubActualizarLayout);
        pnSubActualizarLayout.setHorizontalGroup(
            pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubActualizarLayout.createSequentialGroup()
                .addGroup(pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSubActualizarLayout.createSequentialGroup()
                        .addGap(984, 984, 984)
                        .addComponent(pnBTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnSubActualizarLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnActualizarDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnActCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnActualizarDisponibles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnSubActualizarLayout.setVerticalGroup(
            pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubActualizarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pnActualizarDisponibles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnActualizarDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnActCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnActualizarLayout = new javax.swing.GroupLayout(pnActualizar);
        pnActualizar.setLayout(pnActualizarLayout);
        pnActualizarLayout.setHorizontalGroup(
            pnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSubActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnActualizarLayout.setVerticalGroup(
            pnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSubActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Actualizar", pnActualizar);

        pnActualizarDisponibles2.setBackground(new java.awt.Color(255, 255, 255));
        pnActualizarDisponibles2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "CONSULTAR"));

        lblIdentificador2.setText("N° de la historia clínica: ");

        lblBTNConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBTNConsultar.setText("        Consultar");
        lblBTNConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBTNConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBTNConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnBTNConsultarLayout = new javax.swing.GroupLayout(pnBTNConsultar);
        pnBTNConsultar.setLayout(pnBTNConsultarLayout);
        pnBTNConsultarLayout.setHorizontalGroup(
            pnBTNConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBTNConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );
        pnBTNConsultarLayout.setVerticalGroup(
            pnBTNConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBTNConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnActualizarDisponibles2Layout = new javax.swing.GroupLayout(pnActualizarDisponibles2);
        pnActualizarDisponibles2.setLayout(pnActualizarDisponibles2Layout);
        pnActualizarDisponibles2Layout.setHorizontalGroup(
            pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles2Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(lblIdentificador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumHCAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnActualizarDisponibles2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnBTNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnActualizarDisponibles2Layout.setVerticalGroup(
            pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificador2)
                    .addComponent(txtNumHCAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(pnBTNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnSubConsultarLayout = new javax.swing.GroupLayout(pnSubConsultar);
        pnSubConsultar.setLayout(pnSubConsultarLayout);
        pnSubConsultarLayout.setHorizontalGroup(
            pnSubConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSubConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSubConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(pnActualizarDisponibles2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnSubConsultarLayout.setVerticalGroup(
            pnSubConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubConsultarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnActualizarDisponibles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnConsultarLayout = new javax.swing.GroupLayout(pnConsultar);
        pnConsultar.setLayout(pnConsultarLayout);
        pnConsultarLayout.setHorizontalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSubConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnConsultarLayout.setVerticalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultarLayout.createSequentialGroup()
                .addComponent(pnSubConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar", pnConsultar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoIDActionPerformed
        String selectedItem = cbTipoID.getSelectedItem().toString();
        if (selectedItem.equals("Cédula de identidad")) {
            cbNacionalidad.setSelectedItem("Nacional");
        }
        if (selectedItem.equals("Pasaporte")) {
            cbNacionalidad.setSelectedItem("Extranjero");
        }
    }//GEN-LAST:event_cbTipoIDActionPerformed

    private void lblAbrirHCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirHCMouseClicked

        String apellidos = txtFieldApellidos.getText();
        String correo = txtFieldCorreo.getText();
        String direccion = txtFieldDireccion.getText();
        String nombres = txtFieldNombres.getText();
        String numeroID = txtFieldNumeroID.getText();
        String telefono = txtFieldTelefono.getText();
        String trabajo = txtFieldTrabajo.getText();
        String date = jDateChooser.getDate().toString();


        if (!validarNombres(nombres)) {
            JOptionPane.showMessageDialog(null, "Ingrese nombres válidos.");
        } else if (cbTipoID.getSelectedItem().equals("Pasaporte") && !validarPasaporte(numeroID)) {
            JOptionPane.showMessageDialog(null, "El número de pasaporte no es válido");
        } else if (cbTipoID.getSelectedItem().equals("Cédula de identidad") && !verificarCedula(numeroID)) {
            JOptionPane.showMessageDialog(null, "El número de cédula no existe");
        } else if (!validarApellidos(apellidos)) {
            JOptionPane.showMessageDialog(null, "Ingrese apellidos válidos.");
        } else if (!validarDireccion(direccion)) {
            JOptionPane.showMessageDialog(null, "Ingrese una dirección domiciliaria válida.");
        } else if (!validarTelefono(telefono)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de teléfono celular válido.");
        } else if (!validarTrabajo(trabajo)) {
            JOptionPane.showMessageDialog(null, "Ingrese una ocupación o tipo de trabajo válida.");
        } else if (!validarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico válido.");
        } else {
            int response = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea abrir la historia clínica del paciente: " + nombres + " " + apellidos + " ?", "ABRIR HISTORIA CLÍNICA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                HistoriaClinica hc = new HistoriaClinica(this); // ES UN JPANEL
                hc.setSize(sgpMedscAdmin.getPnContenido().getWidth(), sgpMedscAdmin.getPnContenido().getHeight());
                hc.setLocation(0, 0);

                sgpMedscAdmin.getPnContenido().removeAll();
                sgpMedscAdmin.getPnContenido().add(hc, BorderLayout.CENTER);
                sgpMedscAdmin.getPnContenido().revalidate();
                sgpMedscAdmin.getPnContenido().repaint();
            }
        }
    }//GEN-LAST:event_lblAbrirHCMouseClicked

    private boolean validarPasaporte(String numeroID) {
        String regex = "^[a-zA-Z0-9]{6,10}$";
        return numeroID.matches(regex);
    }

    private boolean verificarCedula(String numeroID) {
        int total = 0;
        int tamanoLongitudCedula = 10;
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int numeroProviancias = 24;
        int tercerdigito = 6;
        if (numeroID.matches("[0-9]*") && numeroID.length() == tamanoLongitudCedula) {
            int provincia = Integer.parseInt(numeroID.charAt(0) + "" + numeroID.charAt(1));
            int digitoTres = Integer.parseInt(numeroID.charAt(2) + "");
            if ((provincia > 0 && provincia <= numeroProviancias) && digitoTres < tercerdigito) {
                int digitoVerificadorRecibido = Integer.parseInt(numeroID.charAt(9) + "");
                for (int i = 0; i < coeficientes.length; i++) {
                    int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(numeroID.charAt(i) + "");
                    total = valor >= 10 ? total + (valor - 9) : total + valor;
                }
                int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;
                if (digitoVerificadorObtenido == digitoVerificadorRecibido) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean validarNombres(String nombres) {
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ¨`~ ]{1,60}$";
        return nombres.matches(regex);
    }

    public static boolean validarApellidos(String apellidos) {
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ¨`~ ]{1,60}$";
        return apellidos.matches(regex);
    }

    public static boolean validarDireccion(String direccion) {
        String regex = "^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ¨`~ .-]{1,170}$";
        return direccion.matches(regex);
    }

    public static boolean validarTelefono(String telefono) {
        String regex = "^09[0-9]{8}$";
        return telefono.matches(regex);
    }

    public static boolean validarTrabajo(String trabajo) {
        String regex = "^[a-zA-Z ]{0,30}$";
        return trabajo.matches(regex);
    }

    public static boolean validarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,8}$";
        return correo.matches(regex);
    }

    private void txtDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisponiblesActionPerformed

        String selectedItem = txtDisponibles.getSelectedItem().toString();
        if (selectedItem.equals("Estado Civil")) {
            txtActualizarCampo.setEnabled(false);
        } else {
            cbEstadoCivil.setEnabled(false);
        }
    }//GEN-LAST:event_txtDisponiblesActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        String apellidos = txtFieldApellidosAct.getText();
        int numHistoriaClinica = Integer.parseInt(txtFieldCorreo.getText());
        String nuevoCampo = txtActualizarCampo.getText();
        String nombres = txtFieldNombresAct.getText();

        if ((!nombres.isEmpty() && !apellidos.isEmpty()) || (!(numHistoriaClinica == 0 || numHistoriaClinica < 0) && !nuevoCampo.isEmpty())) {
            int response = JOptionPane.showConfirmDialog(this, "¿Desea actualizar el nuevo campo?", "ACTUALIZAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                ///lógica de actualizar en la BD...
            }
        } else {
            // Mostrar un mensaje al usuario indicando que debe llenar los campos de texto
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "CAMPOS VACÍOS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void lblBTNConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTNConsultarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBTNConsultarMouseClicked

    public JComboBox<String> getCbEstadoCivil() {
        return cbEstadoCivil;
    }

    public JComboBox<String> getCbNacionalidad() {
        return cbNacionalidad;
    }

    public JComboBox<String> getCbSexo() {
        return cbSexo;
    }

    public JComboBox<String> getCbTipoID() {
        return cbTipoID;
    }

    public JComboBox<String> getCbxTipoSangre() {
        return cbxTipoSangre;
    }

    public JDateChooser getjDateChooser() {
        return jDateChooser;
    }

    public JTextField getTxtFieldApellidos() {
        return txtFieldApellidos;
    }

    public JTextField getTxtFieldCorreo() {
        return txtFieldCorreo;
    }

    public JTextField getTxtFieldDireccion() {
        return txtFieldDireccion;
    }

    public JTextField getTxtFieldNombres() {
        return txtFieldNombres;
    }

    public JTextField getTxtFieldNumeroID() {
        return txtFieldNumeroID;
    }

    public JTextField getTxtFieldTelefono() {
        return txtFieldTelefono;
    }

    public JTextField getTxtFieldTrabajo() {
        return txtFieldTrabajo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbEstadoCivil1;
    private javax.swing.JComboBox<String> cbNacionalidad;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoID;
    private javax.swing.JComboBox<String> cbxTipoSangre;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAbrirHC;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBTNConsultar;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDisponiblePass;
    private javax.swing.JLabel lblDisponibles;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblIdentificador1;
    private javax.swing.JLabel lblIdentificador2;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblNuevoCB;
    private javax.swing.JLabel lblNumeroID;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefonoCelular;
    private javax.swing.JLabel lblTipoID;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTrabajo;
    private javax.swing.JPanel pnAbrirHC;
    private javax.swing.JPanel pnActCampo;
    private javax.swing.JPanel pnActualizar;
    private javax.swing.JPanel pnActualizarDisponibles;
    private javax.swing.JPanel pnActualizarDisponibles1;
    private javax.swing.JPanel pnActualizarDisponibles2;
    private javax.swing.JPanel pnBTNActualizar;
    private javax.swing.JPanel pnBTNConsultar;
    private javax.swing.JPanel pnConsultar;
    private javax.swing.JPanel pnRegistrar;
    private javax.swing.JPanel pnSubActualizar;
    private javax.swing.JPanel pnSubConsultar;
    private javax.swing.JPanel pnSubRegistrar;
    private javax.swing.JTextField txtActualizarCampo;
    private javax.swing.JComboBox<String> txtDisponibles;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldApellidosAct;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldDireccion;
    private javax.swing.JTextField txtFieldNombres;
    private javax.swing.JTextField txtFieldNombresAct;
    private javax.swing.JTextField txtFieldNumeroID;
    private javax.swing.JTextField txtFieldTelefono;
    private javax.swing.JTextField txtFieldTrabajo;
    private javax.swing.JTextField txtNumHCAct;
    private javax.swing.JTextField txtNumHCAct1;
    // End of variables declaration//GEN-END:variables
}
