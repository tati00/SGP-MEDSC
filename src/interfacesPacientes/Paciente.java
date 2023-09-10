/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfacesPacientes;

import Logica.Database.Conexion;
import Logica.LogicaPrincipal.LogUser;
import com.toedter.calendar.JDateChooser;
import interfacesPrincipales.Menu;
import interfacesPrincipales.SGP_MEDSC_admin;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente extends javax.swing.JPanel {

    public SGP_MEDSC_admin sgpMedscAdmin;

    public Paciente(SGP_MEDSC_admin sgpMedscAdmin, LogUser user) {
        this.sgpMedscAdmin = sgpMedscAdmin;
        initComponents();
        cbNacionalidad.setEnabled(false);
        if (!sgpMedscAdmin.obtenerUser().getUserType().equals("Medico Principal")) {
            pnActualizarDisponibles1.setVisible(false);
        }
        //pnActualizarDisponibles1.setVisible(false);
        //if (!user.getUserType().equals("Medico Principal")) {
        //pnActualizarDisponibles1.setVisible(false);
        //}
        //pnActualizarDisponibles1.setVisible(false);
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
        txtActualizarCampo = new javax.swing.JTextField();
        cbEstadoCivil1 = new javax.swing.JComboBox<>();
        lblNuevo = new javax.swing.JLabel();
        lblNuevoCB = new javax.swing.JLabel();
        pnActualizarDisponibles1 = new javax.swing.JPanel();
        lblDisponiblePass = new javax.swing.JLabel();
        lblIdentificador1 = new javax.swing.JLabel();
        txtFieldNombresAct = new javax.swing.JTextField();
        txtFieldApellidosAct = new javax.swing.JTextField();
        txtActualizarCampo1 = new javax.swing.JTextField();
        lblNuevo1 = new javax.swing.JLabel();
        pnBTNActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JLabel();
        pnConsultar = new javax.swing.JPanel();
        pnSubConsultar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnMov = new javax.swing.JPanel();
        pnInfoPersonal = new javax.swing.JPanel();
        lblNumeroID1 = new javax.swing.JLabel();
        lblNombres1 = new javax.swing.JLabel();
        lblApellidos1 = new javax.swing.JLabel();
        lblDireccion1 = new javax.swing.JLabel();
        lblTelefonoCelular1 = new javax.swing.JLabel();
        lblSexo1 = new javax.swing.JLabel();
        lblTrabajo1 = new javax.swing.JLabel();
        lblTipoSangre1 = new javax.swing.JLabel();
        lblCorreoElectronico1 = new javax.swing.JLabel();
        txtFieldNumeroID1 = new javax.swing.JTextField();
        txtFieldNombres1 = new javax.swing.JTextField();
        txtFieldApellidos1 = new javax.swing.JTextField();
        txtFieldDireccion1 = new javax.swing.JTextField();
        txtFieldTelefono1 = new javax.swing.JTextField();
        txtFieldTrabajo1 = new javax.swing.JTextField();
        txtFieldCorreo1 = new javax.swing.JTextField();
        cbxTipoSangre1 = new javax.swing.JComboBox<>();
        lblEstadoCivil1 = new javax.swing.JLabel();
        cbEstadoCivil2 = new javax.swing.JComboBox<>();
        lblTipoID1 = new javax.swing.JLabel();
        cbTipoID1 = new javax.swing.JComboBox<>();
        lblNacionalidad1 = new javax.swing.JLabel();
        cbSexo1 = new javax.swing.JComboBox<>();
        lblNacimiento1 = new javax.swing.JLabel();
        cbNacionalidad1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        pnContactoReferencia = new javax.swing.JPanel();
        lblNombresContacto = new javax.swing.JLabel();
        lblApellidosContacto = new javax.swing.JLabel();
        txtFieldNombresContacto = new javax.swing.JTextField();
        txtFieldApellidosContacto = new javax.swing.JTextField();
        lblTelefonoCelularContacto = new javax.swing.JLabel();
        txtFieldTelefonoContacto = new javax.swing.JTextField();
        lblParentesco = new javax.swing.JLabel();
        cbParentesco = new javax.swing.JComboBox<>();
        pnAlergiasAntecedentes = new javax.swing.JPanel();
        lblAlergias = new javax.swing.JLabel();
        lblAntecedenteFamiliar = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblGradoParentesco = new javax.swing.JLabel();
        cbGradoParentesco = new javax.swing.JComboBox<>();
        txtTiempo = new javax.swing.JTextField();
        txtNombreEnfHereditaria = new javax.swing.JTextField();
        txtAlergias = new javax.swing.JTextField();
        lblAntecedenteFamiliar1 = new javax.swing.JLabel();
        txtNombreEnfHereditaria1 = new javax.swing.JTextField();
        lblTiempo1 = new javax.swing.JLabel();
        txtTiempo1 = new javax.swing.JTextField();
        lblGradoParentesco1 = new javax.swing.JLabel();
        cbGradoParentesco1 = new javax.swing.JComboBox<>();
        lblAntecedenteFamiliar2 = new javax.swing.JLabel();
        txtNombreEnfHereditaria2 = new javax.swing.JTextField();
        lblTiempo2 = new javax.swing.JLabel();
        txtTiempo2 = new javax.swing.JTextField();
        lblGradoParentesco2 = new javax.swing.JLabel();
        cbGradoParentesco2 = new javax.swing.JComboBox<>();
        pnAtenciones = new javax.swing.JPanel();
        pnAgregarAtención = new javax.swing.JPanel();
        lblAtencionMedica = new javax.swing.JLabel();
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

        cbxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A+", "A-\t", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        lblEstadoCivil.setText("Estado Civil: ");

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero(a)", "Divorciado(a)", "Unión libre", "Viudo(a)" }));

        lblTipoID.setText("Tipo de documento de identificación:");

        cbTipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de identidad", "Pasaporte" }));
        cbTipoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoIDActionPerformed(evt);
            }
        });

        lblNacionalidad.setText("Nacionalidad: ");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Femenino", "Masculino", " " }));

        lblNacimiento.setText("Fecha de nacimiento:");

        cbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nacional", "Extranjero" }));

        jDateChooser.setDateFormatString("dd-MM-yyyy");

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
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnRegistrarLayout.setVerticalGroup(
            pnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistrarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pnSubRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
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

        cbEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Divorciado(a)", "Unión libre", "Viudo(a)" }));

        lblNuevo.setText("Nuevo: ");

        lblNuevoCB.setText("Nuevo: ");

        javax.swing.GroupLayout pnActualizarDisponiblesLayout = new javax.swing.GroupLayout(pnActualizarDisponibles);
        pnActualizarDisponibles.setLayout(pnActualizarDisponiblesLayout);
        pnActualizarDisponiblesLayout.setHorizontalGroup(
            pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponiblesLayout.createSequentialGroup()
                .addGroup(pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnActualizarDisponiblesLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lblIdentificador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumHCAct, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnActualizarDisponiblesLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuevoCB))
                        .addGap(23, 23, 23)
                        .addGroup(pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActualizarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(18, 18, 18)
                .addGroup(pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnActualizarDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoCB))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnActualizarDisponibles1.setBackground(new java.awt.Color(255, 255, 255));
        pnActualizarDisponibles1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ACTUALIZAR PASAPORTE"));

        lblDisponiblePass.setText("Nombres:");

        lblIdentificador1.setText("Apellidos: ");

        lblNuevo1.setText("Nuevo: ");

        javax.swing.GroupLayout pnActualizarDisponibles1Layout = new javax.swing.GroupLayout(pnActualizarDisponibles1);
        pnActualizarDisponibles1.setLayout(pnActualizarDisponibles1Layout);
        pnActualizarDisponibles1Layout.setHorizontalGroup(
            pnActualizarDisponibles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles1Layout.createSequentialGroup()
                .addGroup(pnActualizarDisponibles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnActualizarDisponibles1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblDisponiblePass, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldNombresAct, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdentificador1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldApellidosAct, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnActualizarDisponibles1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtActualizarCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnActualizarDisponibles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizarCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevo1))
                .addContainerGap())
        );

        pnBTNActualizar.setBackground(new java.awt.Color(204, 204, 255));

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
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(pnBTNActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );
        pnBTNActualizarLayout.setVerticalGroup(
            pnBTNActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(pnBTNActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnBTNActualizarLayout.createSequentialGroup()
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout pnSubActualizarLayout = new javax.swing.GroupLayout(pnSubActualizar);
        pnSubActualizar.setLayout(pnSubActualizarLayout);
        pnSubActualizarLayout.setHorizontalGroup(
            pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubActualizarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSubActualizarLayout.createSequentialGroup()
                        .addComponent(pnBTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnSubActualizarLayout.createSequentialGroup()
                        .addGroup(pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnActualizarDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnActualizarDisponibles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnSubActualizarLayout.setVerticalGroup(
            pnSubActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubActualizarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pnActualizarDisponibles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnActualizarDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnActualizarLayout = new javax.swing.GroupLayout(pnActualizar);
        pnActualizar.setLayout(pnActualizarLayout);
        pnActualizarLayout.setHorizontalGroup(
            pnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSubActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnActualizarLayout.setVerticalGroup(
            pnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarLayout.createSequentialGroup()
                .addComponent(pnSubActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar", pnActualizar);

        pnInfoPersonal.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "INFORMACIÓN PERSONAL"));

        lblNumeroID1.setText("N° del documento de identificación: ");

        lblNombres1.setText("Nombres: ");

        lblApellidos1.setText("Apellidos: ");

        lblDireccion1.setText("Dirección domiciliaria: ");

        lblTelefonoCelular1.setText("N° teléfono celular: ");

        lblSexo1.setText("Sexo: ");

        lblTrabajo1.setText("Ocupación: ");

        lblTipoSangre1.setText("Tipo de sangre: ");

        lblCorreoElectronico1.setText("Correo electrónico: ");

        txtFieldTelefono1.setText("09");

        cbxTipoSangre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-\t", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        lblEstadoCivil1.setText("Estado Civil: ");

        cbEstadoCivil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Divorciado(a)", "Unión libre", "Viudo(a)" }));

        lblTipoID1.setText("Tipo de documento de identificación:");

        cbTipoID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de identidad", "Pasaporte" }));
        cbTipoID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoID1ActionPerformed(evt);
            }
        });

        lblNacionalidad1.setText("Nacionalidad: ");

        cbSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", " " }));

        lblNacimiento1.setText("Fecha de nacimiento:");

        cbNacionalidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Extranjero" }));

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout pnInfoPersonalLayout = new javax.swing.GroupLayout(pnInfoPersonal);
        pnInfoPersonal.setLayout(pnInfoPersonalLayout);
        pnInfoPersonalLayout.setHorizontalGroup(
            pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxTipoSangre1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblDireccion1)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtFieldDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblCorreoElectronico1)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtFieldCorreo1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFieldApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFieldNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(29, 29, 29)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefonoCelular1)
                                .addComponent(lblNacimiento1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(10, 10, 10)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(cbSexo1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 120, Short.MAX_VALUE)
                                .addComponent(txtFieldTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblApellidos1)
                                    .addGap(324, 324, 324)
                                    .addComponent(lblSexo1))
                                .addComponent(lblNombres1)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblTrabajo1)
                                    .addGap(66, 66, 66)
                                    .addComponent(txtFieldTrabajo1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addGap(112, 112, 112))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(379, 379, 379)
                                    .addComponent(lblTipoSangre1)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblTipoID1)
                                    .addGap(12, 12, 12)
                                    .addComponent(cbTipoID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblNumeroID1)
                                    .addGap(15, 15, 15)
                                    .addComponent(txtFieldNumeroID1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                            .addGap(30, 30, 30)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNacionalidad1)
                                .addComponent(lblEstadoCivil1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(46, 46, 46)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbNacionalidad1, 0, 138, Short.MAX_VALUE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(cbEstadoCivil2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGap(64, 64, 64)))
        );
        pnInfoPersonalLayout.setVerticalGroup(
            pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(cbxTipoSangre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTipoID1)
                                .addComponent(cbTipoID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblNacionalidad1))
                                .addComponent(cbNacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumeroID1)
                                .addComponent(txtFieldNumeroID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstadoCivil1))
                            .addGap(12, 12, 12)
                            .addComponent(lblNombres1)
                            .addGap(18, 18, 18)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblApellidos1)
                                        .addComponent(lblSexo1))))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCorreoElectronico1)
                                .addComponent(txtFieldCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblTelefonoCelular1))
                                .addComponent(txtFieldTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDireccion1)
                                .addComponent(txtFieldDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNacimiento1)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblTrabajo1))
                                .addComponent(txtFieldTrabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(txtFieldNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(cbEstadoCivil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(lblTipoSangre1)))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        pnContactoReferencia.setBackground(new java.awt.Color(255, 255, 255));
        pnContactoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "CONTACTO DE REFERENCIA"));

        lblNombresContacto.setText("Nombres: ");

        lblApellidosContacto.setText("Apellidos: ");

        lblTelefonoCelularContacto.setText("N° teléfono celular: ");

        txtFieldTelefonoContacto.setText("09");

        lblParentesco.setText("Parentesco por: ");

        cbParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consanguinidad", "Afinidad", "Adopción", "Sin parentesco" }));

        javax.swing.GroupLayout pnContactoReferenciaLayout = new javax.swing.GroupLayout(pnContactoReferencia);
        pnContactoReferencia.setLayout(pnContactoReferenciaLayout);
        pnContactoReferenciaLayout.setHorizontalGroup(
            pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addComponent(lblNombresContacto)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldNombresContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addComponent(lblApellidosContacto)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldApellidosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoCelularContacto)
                    .addComponent(lblParentesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldTelefonoContacto)
                    .addComponent(cbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContactoReferenciaLayout.setVerticalGroup(
            pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNombresContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombresContacto)
                            .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefonoCelularContacto)
                                .addComponent(txtFieldTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldApellidosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParentesco))
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblApellidosContacto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnAlergiasAntecedentes.setBackground(new java.awt.Color(255, 255, 255));
        pnAlergiasAntecedentes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ALERGIAS Y ANTECEDENTES FAMILIARES"));

        lblAlergias.setText("Alergias: ");

        lblAntecedenteFamiliar.setText("Antecedente Familiar (1)");

        lblTiempo.setText("Tiempo (años): ");

        lblGradoParentesco.setText("Grado de parentesco: ");

        cbGradoParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        lblAntecedenteFamiliar1.setText("Antecedente Familiar (2)");

        lblTiempo1.setText("Tiempo (años): ");

        lblGradoParentesco1.setText("Grado de parentesco: ");

        cbGradoParentesco1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        lblAntecedenteFamiliar2.setText("Antecedente Familiar (3)");

        lblTiempo2.setText("Tiempo (años): ");

        lblGradoParentesco2.setText("Grado de parentesco: ");

        cbGradoParentesco2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout pnAlergiasAntecedentesLayout = new javax.swing.GroupLayout(pnAlergiasAntecedentes);
        pnAlergiasAntecedentes.setLayout(pnAlergiasAntecedentesLayout);
        pnAlergiasAntecedentesLayout.setHorizontalGroup(
            pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                        .addComponent(lblAntecedenteFamiliar2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEnfHereditaria2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTiempo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTiempo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGradoParentesco2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGradoParentesco2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                        .addComponent(lblAntecedenteFamiliar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEnfHereditaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTiempo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGradoParentesco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGradoParentesco1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnAlergiasAntecedentesLayout.createSequentialGroup()
                        .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlergias)
                            .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlergiasAntecedentesLayout.createSequentialGroup()
                                .addComponent(lblAntecedenteFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreEnfHereditaria, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGradoParentesco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGradoParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnAlergiasAntecedentesLayout.setVerticalGroup(
            pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergias)
                    .addComponent(txtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntecedenteFamiliar)
                    .addComponent(txtNombreEnfHereditaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempo)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGradoParentesco)
                    .addComponent(cbGradoParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntecedenteFamiliar1)
                    .addComponent(txtNombreEnfHereditaria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempo1)
                    .addComponent(txtTiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGradoParentesco1)
                    .addComponent(cbGradoParentesco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntecedenteFamiliar2)
                    .addComponent(txtNombreEnfHereditaria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempo2)
                    .addComponent(txtTiempo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGradoParentesco2)
                    .addComponent(cbGradoParentesco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnAtenciones.setBackground(new java.awt.Color(255, 255, 255));
        pnAtenciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ATENCIONES MÉDICAS RECIBIDAS"));

        lblAtencionMedica.setText("APARTADO PARA ATENCIÓN MÉDICA");

        javax.swing.GroupLayout pnAgregarAtenciónLayout = new javax.swing.GroupLayout(pnAgregarAtención);
        pnAgregarAtención.setLayout(pnAgregarAtenciónLayout);
        pnAgregarAtenciónLayout.setHorizontalGroup(
            pnAgregarAtenciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(pnAgregarAtenciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnAgregarAtenciónLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lblAtencionMedica)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        pnAgregarAtenciónLayout.setVerticalGroup(
            pnAgregarAtenciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pnAgregarAtenciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnAgregarAtenciónLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(lblAtencionMedica)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnAtencionesLayout = new javax.swing.GroupLayout(pnAtenciones);
        pnAtenciones.setLayout(pnAtencionesLayout);
        pnAtencionesLayout.setHorizontalGroup(
            pnAtencionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAtencionesLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(pnAgregarAtención, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnAtencionesLayout.setVerticalGroup(
            pnAtencionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAtencionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnAgregarAtención, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMovLayout = new javax.swing.GroupLayout(pnMov);
        pnMov.setLayout(pnMovLayout);
        pnMovLayout.setHorizontalGroup(
            pnMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMovLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnContactoReferencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnInfoPersonal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAlergiasAntecedentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAtenciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        pnMovLayout.setVerticalGroup(
            pnMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnInfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnContactoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnAlergiasAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(pnAtenciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(pnMov);

        pnActualizarDisponibles2.setBackground(new java.awt.Color(255, 255, 255));
        pnActualizarDisponibles2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "CONSULTAR"));

        lblIdentificador2.setText("N° de la historia clínica: ");

        lblBTNConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBTNConsultar.setText("                            Consultar");
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
            .addGap(0, 223, Short.MAX_VALUE)
            .addGroup(pnBTNConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBTNConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );
        pnBTNConsultarLayout.setVerticalGroup(
            pnBTNConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(pnBTNConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBTNConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnActualizarDisponibles2Layout = new javax.swing.GroupLayout(pnActualizarDisponibles2);
        pnActualizarDisponibles2.setLayout(pnActualizarDisponibles2Layout);
        pnActualizarDisponibles2Layout.setHorizontalGroup(
            pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnActualizarDisponibles2Layout.createSequentialGroup()
                        .addComponent(lblIdentificador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumHCAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBTNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        pnActualizarDisponibles2Layout.setVerticalGroup(
            pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActualizarDisponibles2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnActualizarDisponibles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificador2)
                    .addComponent(txtNumHCAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBTNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnSubConsultarLayout = new javax.swing.GroupLayout(pnSubConsultar);
        pnSubConsultar.setLayout(pnSubConsultarLayout);
        pnSubConsultarLayout.setHorizontalGroup(
            pnSubConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSubConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSubConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnActualizarDisponibles2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnSubConsultarLayout.setVerticalGroup(
            pnSubConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSubConsultarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnActualizarDisponibles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pnSubConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
        String num_DocumentoID = txtFieldNumeroID.getText();
        String celular = txtFieldTelefono.getText();
        String ocupacion = txtFieldTrabajo.getText();
        Date fechaNacimientoDate = jDateChooser.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fecha_nacimiento = dateFormat.format(fechaNacimientoDate);
        String tipoID = cbTipoID.getSelectedItem().toString();
        String nacionalidad = cbNacionalidad.getSelectedItem().toString();
        String estado_civil = cbEstadoCivil.getSelectedItem().toString();
        String sexo = cbSexo.getSelectedItem().toString();
        String tipo_sangre = cbxTipoSangre.getSelectedItem().toString();

        if (!validarNombres(nombres)) {
            JOptionPane.showMessageDialog(null, "Ingrese nombres válidos.");
        } else if (cbTipoID.getSelectedItem().equals("Pasaporte") && !validarPasaporte(num_DocumentoID)) {
            JOptionPane.showMessageDialog(null, "El número de pasaporte no es válido");
        } else if (cbTipoID.getSelectedItem().equals("Cédula de identidad") && !verificarCedula(num_DocumentoID)) {
            JOptionPane.showMessageDialog(null, "El número de cédula no existe");
        } else if (!validarApellidos(apellidos)) {
            JOptionPane.showMessageDialog(null, "Ingrese apellidos válidos.");
        } else if (!validarDireccion(direccion)) {
            JOptionPane.showMessageDialog(null, "Ingrese una dirección domiciliaria válida.");
        } else if (!validarTelefono(celular)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de teléfono celular válido.");
        } else if (!validarTrabajo(ocupacion)) {
            JOptionPane.showMessageDialog(null, "Ingrese una ocupación o tipo de trabajo válida.");
        } else if (!validarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico válido.");
        } else {
            int response = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea abrir la historia clínica del paciente: " + nombres + " " + apellidos + " ?", "ABRIR HISTORIA CLÍNICA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                //CONEXION A LA BD
                try {
                    Connection con = ConexionPacientes.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO paciente (tipo_DocumentoID, num_DocumentoID, nacionalidad, nombres, apellidos, direccion, celular, fecha_nacimiento, sexo, estado_civil, ocupacion, tipo_sangre, correo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
                    //ps.setInt(1, codEdificio);
                    ps.setString(1, tipoID);
                    ps.setString(2, num_DocumentoID);
                    ps.setString(3, nacionalidad);
                    ps.setString(4, nombres);
                    ps.setString(5, apellidos);
                    ps.setString(6, direccion);
                    ps.setString(7, celular);
                    ps.setString(8, fecha_nacimiento);
                    ps.setString(9, sexo);
                    ps.setString(10, estado_civil);
                    ps.setString(11, ocupacion);
                    ps.setString(12, tipo_sangre);
                    ps.setString(13, correo);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro de datos personales guardado con éxito");
                } catch (SQLException e) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(null, e.toString());
                }

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
        String nombres = txtFieldNombresAct.getText();
        String nomb = "", apell = "", numID = "";

        //Actualizar el número de pasaporte
        /*
        try {
            Connection con = ConexionPacientes.getConexion();
            PreparedStatement ps = con.prepareStatement("SELECT  nombres, apellidos FROM paciente;");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nomb = rs.getString("nombres");
                apell = rs.getString("apellidos");
            }
            if (nomb.isEmpty() && apell.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA REGISTRADO EL PACIENTE");
            } else {
                PreparedStatement ps1 = con.prepareStatement("SELECT  num_DocumentoID FROM paciente WHERE nombres=? and apellidos=?");
                ps1.setString(1, nombres);
                ps1.setString(2, apellidos);

                ResultSet rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    numID = rs1.getString("num_DocumentoID");
                }
                cambiarNumeroPasaporte();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FALLA SIGNIFICATIVA: conexión con la base de datos inválida");
        }*/
        int id_historia = Integer.parseInt(txtNumHCAct.getText());
        String num_DocumentoID = null;
        try {

            Connection con = ConexionPacientes.getConexion();
            PreparedStatement ps = con.prepareStatement("SELECT  num_DocumentoID FROM historia_clinica WHERE id_historia=?");
            ps.setInt(1, id_historia);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                num_DocumentoID = rs.getString("num_DocumentoID");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO EXISTE LA HISTORIA CLÍNICA CON ESE NÚMERO");
        }

        String eleccion = txtDisponibles.getSelectedItem().toString();
        if (eleccion == "N° de teléfono celular") {
            cbEstadoCivil1.setEnabled(false);
            String nuevoNC = txtActualizarCampo.getText();
            if (!nuevoNC.isEmpty()) {
                try {

                    Connection con = ConexionPacientes.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE paciente SET celular=? WHERE num_DocumentoID=?");
                    ps.setString(1, nuevoNC);
                    ps.setString(2, num_DocumentoID);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "NÚMERO DE TELÉFONO CELULAR ACTUALIZADO");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese datos al campo.");
            }

        } else if (eleccion == "Dirección Domiciliaria") {
            String nuevoDD = txtActualizarCampo.getText();
            if (!nuevoDD.isEmpty()) {
                try {

                    Connection con = ConexionPacientes.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE paciente SET direccion=? WHERE num_DocumentoID=?");

                    ps.setString(1, nuevoDD);
                    ps.setString(2, num_DocumentoID);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "DIRECCIÓN DOMICILIARIA ACTUALIZADA");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese datos al campo.");
            }
        } else {
            cbEstadoCivil1.setEnabled(true);
            String nuevoEC = txtDisponibles.getSelectedItem().toString();
            try {

                Connection con = ConexionPacientes.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE paciente SET estado_civil=? WHERE num_DocumentoID=?");

                ps.setString(1, nuevoEC);
                ps.setString(2, num_DocumentoID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "ESTADO CIVIL ACTUALIZADO");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void cambiarNumeroPasaporte() {
        String apellidos = txtFieldApellidosAct.getText();
        String nombres = txtFieldNombresAct.getText();
        String nuevoNP = txtActualizarCampo1.getText();
        if (!nuevoNP.isEmpty()) {
            try {
                txtNumHCAct.setVisible(false);
                cbEstadoCivil.setVisible(false);
                String ID = " ";
                Connection con = ConexionPacientes.getConexion();

                // Actualiza el campo 'num_DocumentoID' en la tabla 'paciente'
                String updatePacienteSQL = "UPDATE paciente SET num_DocumentoID=? WHERE nombres=? AND apellidos=?";
                PreparedStatement ps = con.prepareStatement(updatePacienteSQL);
                ps.setString(1, nuevoNP);
                ps.setString(2, nombres);
                ps.setString(3, apellidos);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "NÚMERO DE PASAPORTE ACTUALIZADO");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos al campo.");
        }
    }


    private void lblBTNConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTNConsultarMouseClicked
        String id_historia = txtNumHCAct1.getText();
        String num_DocumentoID = " ";
        String tipoDocumento = " ", nacionalidad = " ", sexo = " ", tipoSangre = "", estadoCivil = " ";
        String fechaNacimiento = " ", parentesco = " ", grado = " ", grado1 = " ", grado2 = "";
        bloquearEdicion();
        try {
            Connection con = ConexionPacientes.getConexion();
            String consulta = "SELECT tipo_DocumentoID, p.num_DocumentoID, nacionalidad, nombres, apellidos, direccion, celular, fecha_nacimiento, sexo, estado_civil, ocupacion, tipo_sangre, correo, contacto_emergencia_nombre, contacto_emergencia_apellido, contacto_emergencia_celular, contacto_emergencia_parentesco, alergia, enfermedad_hereditaria, enfermedad_hereditaria_1, enfermedad_hereditaria_2, tiempo, tiempo_1, tiempo_2, grado, grado_1, grado_2 FROM historia_clinica hc join paciente p ON hc.num_DocumentoID = p.num_DocumentoID where id_historia=?;";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, id_historia);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tipoDocumento = rs.getString("tipo_DocumentoID");
                txtFieldNumeroID1.setText(rs.getString("num_DocumentoID"));
                nacionalidad = rs.getString("nacionalidad");
                txtFieldNombres1.setText(rs.getString("nombres"));
                txtFieldApellidos1.setText(rs.getString("apellidos"));
                txtFieldDireccion1.setText(rs.getString("direccion"));
                txtFieldTelefono1.setText(rs.getString("celular"));
                fechaNacimiento = rs.getString("fecha_nacimiento");
                sexo = rs.getString("sexo");
                estadoCivil = rs.getString("estado_civil");
                txtFieldTrabajo1.setText(rs.getString("ocupacion"));
                tipoSangre = rs.getString("tipo_sangre");
                txtFieldCorreo1.setText(rs.getString("correo"));
                txtFieldNombresContacto.setText(rs.getString("contacto_emergencia_nombre"));
                txtFieldApellidosContacto.setText(rs.getString("contacto_emergencia_apellido"));
                txtFieldTelefonoContacto.setText(rs.getString("contacto_emergencia_celular"));
                parentesco = rs.getString("contacto_emergencia_parentesco");
                txtAlergias.setText(rs.getString("alergias"));
                txtNombreEnfHereditaria.setText(rs.getString("enfermedad_hereditaria"));
                txtNombreEnfHereditaria1.setText(rs.getString("enfermedad_hereditaria_1"));
                txtNombreEnfHereditaria2.setText(rs.getString("enfermedad_hereditaria_2"));
                txtTiempo.setText(rs.getString("tiempo"));
                txtTiempo1.setText(rs.getString("tiempo_1"));
                txtTiempo2.setText(rs.getString("tiempo_2"));
                grado = rs.getString("grado");
                grado1 = rs.getString("grado_1");
                grado2 = rs.getString("grado_2");
            }

            modificarComboBox(cbTipoID1, tipoDocumento);
            modificarComboBox(cbNacionalidad1, nacionalidad);
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-yyyy"); // Ajusta el formato según la representación de la fecha en tu base de datos
                java.util.Date fechaNacimientoN = dateFormat.parse(fechaNacimiento);

                jDateChooser1.setDate(fechaNacimientoN);
            } catch (ParseException e) {
                // Maneja la excepción en caso de un formato de fecha incorrecto
                e.printStackTrace(); // Aquí puedes imprimir un mensaje de error o realizar otra acción
            }
            modificarComboBox(cbSexo1, sexo);
            modificarComboBox(cbEstadoCivil2, estadoCivil);
            modificarComboBox(cbxTipoSangre1, tipoSangre);
            modificarComboBox(cbParentesco, parentesco);
            modificarComboBox(cbGradoParentesco, grado);
            modificarComboBox(cbGradoParentesco, grado1);
            modificarComboBox(cbGradoParentesco, grado2);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FALLA SIGNIFICATIVA: problemas con la base de datos");
        }
    }//GEN-LAST:event_lblBTNConsultarMouseClicked

    private void modificarComboBox(JComboBox cb, String select) {
        for (int i = 0; i < cb.getItemCount(); i++) {
            if (cb.getItemAt(i).equals(select)) {
                cb.setSelectedItem(select);
                break; // Termina el bucle cuando se encuentra el elemento
            }
        }
    }

    private void bloquearEdicion() {
        cbTipoID1.setEnabled(false);
        cbNacionalidad1.setEnabled(false);
        txtFieldNumeroID1.setEnabled(false);
        txtFieldNombres1.setEnabled(false);
        txtFieldApellidos1.setEnabled(false);
        txtFieldCorreo1.setEnabled(false);
        txtFieldDireccion1.setEnabled(false);
        txtFieldTelefono1.setEnabled(false);
        txtFieldTrabajo1.setEnabled(false);
        cbEstadoCivil2.setEnabled(false);
        cbSexo1.setEnabled(false);
        cbxTipoSangre1.setEnabled(false);
        jDateChooser1.setEnabled(false);
        txtFieldNombresContacto.setEnabled(false);
        txtFieldApellidosContacto.setEnabled(false);
        txtFieldTelefonoContacto.setEnabled(false);
        txtAlergias.setEnabled(false);
        txtNombreEnfHereditaria.setEnabled(false);
        txtNombreEnfHereditaria1.setEnabled(false);
        txtNombreEnfHereditaria2.setEnabled(false);
        txtTiempo.setEnabled(false);
        txtTiempo1.setEnabled(false);
        txtTiempo2.setEnabled(false);
        cbGradoParentesco.setEnabled(false);
        cbGradoParentesco1.setEnabled(false);
        cbGradoParentesco2.setEnabled(false);
    }

    private void cbTipoID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoID1ActionPerformed
        String selectedItem = cbTipoID.getSelectedItem().toString();
        if (selectedItem.equals("Cédula de identidad")) {
            cbNacionalidad.setSelectedItem("Nacional");
        }
        if (selectedItem.equals("Pasaporte")) {
            cbNacionalidad.setSelectedItem("Extranjero");
        }
    }//GEN-LAST:event_cbTipoID1ActionPerformed

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
    private javax.swing.JComboBox<String> cbEstadoCivil2;
    private javax.swing.JComboBox<String> cbGradoParentesco;
    private javax.swing.JComboBox<String> cbGradoParentesco1;
    private javax.swing.JComboBox<String> cbGradoParentesco2;
    private javax.swing.JComboBox<String> cbNacionalidad;
    private javax.swing.JComboBox<String> cbNacionalidad1;
    private javax.swing.JComboBox<String> cbParentesco;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbSexo1;
    private javax.swing.JComboBox<String> cbTipoID;
    private javax.swing.JComboBox<String> cbTipoID1;
    private javax.swing.JComboBox<String> cbxTipoSangre;
    private javax.swing.JComboBox<String> cbxTipoSangre1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAbrirHC;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblAntecedenteFamiliar;
    private javax.swing.JLabel lblAntecedenteFamiliar1;
    private javax.swing.JLabel lblAntecedenteFamiliar2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidos1;
    private javax.swing.JLabel lblApellidosContacto;
    private javax.swing.JLabel lblAtencionMedica;
    private javax.swing.JLabel lblBTNConsultar;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblCorreoElectronico1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblDisponiblePass;
    private javax.swing.JLabel lblDisponibles;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEstadoCivil1;
    private javax.swing.JLabel lblGradoParentesco;
    private javax.swing.JLabel lblGradoParentesco1;
    private javax.swing.JLabel lblGradoParentesco2;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblIdentificador1;
    private javax.swing.JLabel lblIdentificador2;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacimiento1;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNacionalidad1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblNombresContacto;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblNuevo1;
    private javax.swing.JLabel lblNuevoCB;
    private javax.swing.JLabel lblNumeroID;
    private javax.swing.JLabel lblNumeroID1;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblTelefonoCelular;
    private javax.swing.JLabel lblTelefonoCelular1;
    private javax.swing.JLabel lblTelefonoCelularContacto;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTiempo1;
    private javax.swing.JLabel lblTiempo2;
    private javax.swing.JLabel lblTipoID;
    private javax.swing.JLabel lblTipoID1;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTipoSangre1;
    private javax.swing.JLabel lblTrabajo;
    private javax.swing.JLabel lblTrabajo1;
    private javax.swing.JPanel pnAbrirHC;
    private javax.swing.JPanel pnActualizar;
    private javax.swing.JPanel pnActualizarDisponibles;
    private javax.swing.JPanel pnActualizarDisponibles1;
    private javax.swing.JPanel pnActualizarDisponibles2;
    private javax.swing.JPanel pnAgregarAtención;
    private javax.swing.JPanel pnAlergiasAntecedentes;
    private javax.swing.JPanel pnAtenciones;
    private javax.swing.JPanel pnBTNActualizar;
    private javax.swing.JPanel pnBTNConsultar;
    private javax.swing.JPanel pnConsultar;
    private javax.swing.JPanel pnContactoReferencia;
    private javax.swing.JPanel pnInfoPersonal;
    private javax.swing.JPanel pnMov;
    private javax.swing.JPanel pnRegistrar;
    private javax.swing.JPanel pnSubActualizar;
    private javax.swing.JPanel pnSubConsultar;
    private javax.swing.JPanel pnSubRegistrar;
    private javax.swing.JTextField txtActualizarCampo;
    private javax.swing.JTextField txtActualizarCampo1;
    private javax.swing.JTextField txtAlergias;
    private javax.swing.JComboBox<String> txtDisponibles;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldApellidos1;
    private javax.swing.JTextField txtFieldApellidosAct;
    private javax.swing.JTextField txtFieldApellidosContacto;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldCorreo1;
    private javax.swing.JTextField txtFieldDireccion;
    private javax.swing.JTextField txtFieldDireccion1;
    private javax.swing.JTextField txtFieldNombres;
    private javax.swing.JTextField txtFieldNombres1;
    private javax.swing.JTextField txtFieldNombresAct;
    private javax.swing.JTextField txtFieldNombresContacto;
    private javax.swing.JTextField txtFieldNumeroID;
    private javax.swing.JTextField txtFieldNumeroID1;
    private javax.swing.JTextField txtFieldTelefono;
    private javax.swing.JTextField txtFieldTelefono1;
    private javax.swing.JTextField txtFieldTelefonoContacto;
    private javax.swing.JTextField txtFieldTrabajo;
    private javax.swing.JTextField txtFieldTrabajo1;
    private javax.swing.JTextField txtNombreEnfHereditaria;
    private javax.swing.JTextField txtNombreEnfHereditaria1;
    private javax.swing.JTextField txtNombreEnfHereditaria2;
    private javax.swing.JTextField txtNumHCAct;
    private javax.swing.JTextField txtNumHCAct1;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTiempo1;
    private javax.swing.JTextField txtTiempo2;
    // End of variables declaration//GEN-END:variables
}
