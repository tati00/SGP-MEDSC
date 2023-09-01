/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfacesPacientes;

import static interfacesPrincipales.Menu.jtf;
import interfacesPrincipales.SGP_MEDSC_admin;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author PC
 */
public class HistoriaClinica extends javax.swing.JPanel {

    private Paciente p;
    private int numeroHistoriaClinica;

    public HistoriaClinica(Paciente p) {
        initComponents();
        this.p = p;
        //numeroHistoriaClinica = 1;
        //txtNumHC.setText(Integer.toString(numeroHistoriaClinica));
        llenarInformacionPersonal();
    }

    private void llenarInformacionPersonal() {
        cbTipoID.setSelectedItem(p.getCbTipoID().getSelectedItem());
        cbNacionalidad.setSelectedItem(p.getCbNacionalidad().getSelectedItem());
        txtFieldNumeroID.setText(p.getTxtFieldNumeroID().getText());
        txtFieldNombres.setText(p.getTxtFieldNombres().getText());
        txtFieldApellidos.setText(p.getTxtFieldApellidos().getText());
        txtFieldCorreo.setText(p.getTxtFieldCorreo().getText());
        txtFieldDireccion.setText(p.getTxtFieldDireccion().getText());
        txtFieldTelefono.setText(p.getTxtFieldTelefono().getText());
        txtFieldTrabajo.setText(p.getTxtFieldTrabajo().getText());
        cbEstadoCivil.setSelectedItem(p.getCbEstadoCivil().getSelectedItem());
        cbSexo.setSelectedItem(p.getCbSexo().getSelectedItem());
        cbxTipoSangre.setSelectedItem(p.getCbxTipoSangre().getSelectedItem());
        jDateChooser.setDate(p.getjDateChooser().getDate());
        bloquearEdicion();
    }

    private void bloquearEdicion() {
        txtNumHC.setEnabled(false);
        cbTipoID.setEnabled(false);
        cbNacionalidad.setEnabled(false);
        txtFieldNumeroID.setEnabled(false);
        txtFieldNombres.setEnabled(false);
        txtFieldApellidos.setEnabled(false);
        txtFieldCorreo.setEnabled(false);
        txtFieldDireccion.setEnabled(false);
        txtFieldTelefono.setEnabled(false);
        txtFieldTrabajo.setEnabled(false);
        cbEstadoCivil.setEnabled(false);
        cbSexo.setEnabled(false);
        cbxTipoSangre.setEnabled(false);
        jDateChooser.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNumeroHC = new javax.swing.JPanel();
        lblIdentificador = new javax.swing.JLabel();
        txtNumHC = new javax.swing.JTextField();
        movPnHC = new javax.swing.JScrollPane();
        pnMov = new javax.swing.JPanel();
        pnInfoPersonal = new javax.swing.JPanel();
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
        pnContactoReferencia = new javax.swing.JPanel();
        lblNombresContacto = new javax.swing.JLabel();
        lblApellidosContacto = new javax.swing.JLabel();
        txtFieldNombresContacto = new javax.swing.JTextField();
        txtFieldApellidosContacto = new javax.swing.JTextField();
        lblTelefonoCelularContacto = new javax.swing.JLabel();
        txtFieldTelefonoContacto = new javax.swing.JTextField();
        lblParentesco = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnAlergiasAntecedentes = new javax.swing.JPanel();
        lblAlergias = new javax.swing.JLabel();
        lblNombreEnfHereditaria = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblGradoParentesco = new javax.swing.JLabel();
        cbGradoParentesco = new javax.swing.JComboBox<>();
        txtTiempo = new javax.swing.JTextField();
        txtNombreEnfHereditaria = new javax.swing.JTextField();
        txtAlergias = new javax.swing.JTextField();
        pnAtenciones = new javax.swing.JPanel();
        pnAgregarAtención = new javax.swing.JPanel();
        lblAtencionMedica = new javax.swing.JLabel();
        pnGuardar = new javax.swing.JPanel();
        btnGuardarHC = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdentificador.setText("N° de la historia clínica: ");

        javax.swing.GroupLayout pnNumeroHCLayout = new javax.swing.GroupLayout(pnNumeroHC);
        pnNumeroHC.setLayout(pnNumeroHCLayout);
        pnNumeroHCLayout.setHorizontalGroup(
            pnNumeroHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNumeroHCLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(lblIdentificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        pnNumeroHCLayout.setVerticalGroup(
            pnNumeroHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNumeroHCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNumeroHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnNumeroHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 11, -1, -1));

        pnInfoPersonal.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "INFORMACIÓN PERSONAL"));

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

        jDateChooser.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout pnInfoPersonalLayout = new javax.swing.GroupLayout(pnInfoPersonal);
        pnInfoPersonal.setLayout(pnInfoPersonalLayout);
        pnInfoPersonalLayout.setHorizontalGroup(
            pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblDireccion)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblCorreoElectronico)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(29, 29, 29)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefonoCelular)
                                .addComponent(lblNacimiento, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(10, 10, 10)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 120, Short.MAX_VALUE)
                                .addComponent(txtFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblApellidos)
                                    .addGap(324, 324, 324)
                                    .addComponent(lblSexo))
                                .addComponent(lblNombres)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblTrabajo)
                                    .addGap(66, 66, 66)
                                    .addComponent(txtFieldTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addGap(112, 112, 112))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(379, 379, 379)
                                    .addComponent(lblTipoSangre)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblTipoID)
                                    .addGap(12, 12, 12)
                                    .addComponent(cbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(lblNumeroID)
                                    .addGap(15, 15, 15)
                                    .addComponent(txtFieldNumeroID, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                            .addGap(30, 30, 30)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNacionalidad)
                                .addComponent(lblEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(46, 46, 46)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbNacionalidad, 0, 138, Short.MAX_VALUE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGap(64, 64, 64)))
        );
        pnInfoPersonalLayout.setVerticalGroup(
            pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(cbxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTipoID)
                                .addComponent(cbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblNacionalidad))
                                .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumeroID)
                                .addComponent(txtFieldNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstadoCivil))
                            .addGap(12, 12, 12)
                            .addComponent(lblNombres)
                            .addGap(18, 18, 18)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblApellidos)
                                        .addComponent(lblSexo))))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCorreoElectronico)
                                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblTelefonoCelular))
                                .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDireccion)
                                .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNacimiento)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lblTrabajo))
                                .addComponent(txtFieldTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnInfoPersonalLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(lblTipoSangre)))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnContactoReferencia.setBackground(new java.awt.Color(255, 255, 255));
        pnContactoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "CONTACTO DE REFERENCIA"));

        lblNombresContacto.setText("Nombres: ");

        lblApellidosContacto.setText("Apellidos: ");

        lblTelefonoCelularContacto.setText("N° teléfono celular: ");

        txtFieldTelefonoContacto.setText("09");

        lblParentesco.setText("Parentesco por: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consanguinidad", "Afinidad", "Adopción" }));

        javax.swing.GroupLayout pnContactoReferenciaLayout = new javax.swing.GroupLayout(pnContactoReferencia);
        pnContactoReferencia.setLayout(pnContactoReferenciaLayout);
        pnContactoReferenciaLayout.setHorizontalGroup(
            pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addComponent(lblNombresContacto)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldNombresContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addComponent(lblApellidosContacto)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldApellidosContacto)))
                .addGap(33, 33, 33)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoCelularContacto)
                    .addComponent(lblParentesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldTelefonoContacto)
                    .addComponent(jComboBox1, 0, 139, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContactoReferenciaLayout.setVerticalGroup(
            pnContactoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
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
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParentesco))
                    .addGroup(pnContactoReferenciaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblApellidosContacto)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnAlergiasAntecedentes.setBackground(new java.awt.Color(255, 255, 255));
        pnAlergiasAntecedentes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ALERGIAS Y ANTECEDENTES FAMILIARES"));

        lblAlergias.setText("Alergias: ");

        lblNombreEnfHereditaria.setText("Nombre de la enfermedad hereditaria: ");

        lblTiempo.setText("Tiempo (años): ");

        lblGradoParentesco.setText("Grado de parentesco: ");

        cbGradoParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout pnAlergiasAntecedentesLayout = new javax.swing.GroupLayout(pnAlergiasAntecedentes);
        pnAlergiasAntecedentes.setLayout(pnAlergiasAntecedentesLayout);
        pnAlergiasAntecedentesLayout.setHorizontalGroup(
            pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlergias)
                    .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                        .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEnfHereditaria)
                            .addComponent(lblGradoParentesco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEnfHereditaria)
                            .addComponent(cbGradoParentesco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblTiempo)
                .addGap(34, 34, 34)
                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        pnAlergiasAntecedentesLayout.setVerticalGroup(
            pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlergiasAntecedentesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergias)
                    .addComponent(txtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTiempo)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreEnfHereditaria)
                        .addComponent(txtNombreEnfHereditaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAlergiasAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGradoParentesco)
                    .addComponent(cbGradoParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addGap(254, 254, 254)
                .addComponent(pnAgregarAtención, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnAtencionesLayout.setVerticalGroup(
            pnAtencionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAtencionesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pnAgregarAtención, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMovLayout = new javax.swing.GroupLayout(pnMov);
        pnMov.setLayout(pnMovLayout);
        pnMovLayout.setHorizontalGroup(
            pnMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMovLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnContactoReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnInfoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAlergiasAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAtenciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnAtenciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        movPnHC.setViewportView(pnMov);

        add(movPnHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 54, 890, 810));

        btnGuardarHC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarHC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardarHC.setText("Guardar");
        btnGuardarHC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarHC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarHC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarHCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnGuardarLayout = new javax.swing.GroupLayout(pnGuardar);
        pnGuardar.setLayout(pnGuardarLayout);
        pnGuardarLayout.setHorizontalGroup(
            pnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(pnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGuardarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnGuardarHC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnGuardarLayout.setVerticalGroup(
            pnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnGuardarHC, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        add(pnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 110, -1));
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

    private void btnGuardarHCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarHCMouseClicked
        String apellidosContacto = txtFieldApellidosContacto.getText();
        String nombresContacto = txtFieldNombresContacto.getText();
        String telefonoContacto = txtFieldTelefonoContacto.getText();
        // Obtener los valores de los campos
        String alergias = txtAlergias.getText();
        String nbEnfH = txtNombreEnfHereditaria.getText();
        String tiempo = txtTiempo.getText();

        if (nombresContacto.isEmpty() || apellidosContacto.isEmpty() || telefonoContacto.isEmpty()) {
            // Mostrar un mensaje al usuario indicando que debe llenar los campos de texto
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "CAMPOS VACÍOS", JOptionPane.WARNING_MESSAGE);
        } else {
            // Validar campos uno por uno
            if (!validarNombres(nombresContacto)) {
                JOptionPane.showMessageDialog(null, "Ingrese nombres de contacto válidos.");
            } else if (!validarApellidos(apellidosContacto)) {
                JOptionPane.showMessageDialog(null, "Ingrese apellidos de contacto válidos.");
            } else if (!validarTelefono(telefonoContacto)) {
                JOptionPane.showMessageDialog(null, "Ingrese un número de contacto válido.");
            } else if (!validarAlergias(alergias)) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre de la(s) alergia(s) adecuadamente.");
            } else if (!validarNombreEnfermedad(nbEnfH)) {
                JOptionPane.showMessageDialog(null, "Ingrese nombre de la enfermedad hereditaria adecuadamente.");
            } else if (!validarTiempo(tiempo)) {
                JOptionPane.showMessageDialog(null, "Ingrese el tiempo en años válido.");
            } else {
                int response = JOptionPane.showConfirmDialog(this, "¿Desea guardar la historia clínica del paciente: " + txtFieldNombres.getText() + " " + txtFieldApellidos.getText() + " ?", "GUARDAR HISTORIA CLÍNICA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    //numeroHistoriaClinica++;
                    txtNumHC.setText(Integer.toString(numeroHistoriaClinica)); // Actualiza el campo de texto
                    SGP_MEDSC_admin sgp = new SGP_MEDSC_admin();
                    sgp.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarHCMouseClicked

    public static boolean validarNombres(String nombres) {
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ¨`~ ]{1,60}$";
        return nombres.matches(regex);
    }

    public static boolean validarApellidos(String apellidos) {
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ¨`~ ]{1,60}$";
        return apellidos.matches(regex);
    }

    public static boolean validarTelefono(String telefono) {
        String regex = "^09[0-9]{8}$";
        return telefono.matches(regex);
    }

    public static boolean validarAlergias(String alergias) {
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ¨`~ ]{0,80}$";
        return alergias.matches(regex);
    }

    public static boolean validarNombreEnfermedad(String nombreEnfermedad) {
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ¨`~0-9 ]{1,60}$";
        return nombreEnfermedad.matches(regex);
    }

    public static boolean validarTiempo(String tiempo) {
        String regex = "^[0-9]{1,2}$";
        return tiempo.matches(regex);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGuardarHC;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbGradoParentesco;
    private javax.swing.JComboBox<String> cbNacionalidad;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoID;
    private javax.swing.JComboBox<String> cbxTipoSangre;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidosContacto;
    private javax.swing.JLabel lblAtencionMedica;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblGradoParentesco;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombreEnfHereditaria;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombresContacto;
    private javax.swing.JLabel lblNumeroID;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefonoCelular;
    private javax.swing.JLabel lblTelefonoCelularContacto;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipoID;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTrabajo;
    private javax.swing.JScrollPane movPnHC;
    private javax.swing.JPanel pnAgregarAtención;
    private javax.swing.JPanel pnAlergiasAntecedentes;
    private javax.swing.JPanel pnAtenciones;
    private javax.swing.JPanel pnContactoReferencia;
    private javax.swing.JPanel pnGuardar;
    private javax.swing.JPanel pnInfoPersonal;
    private javax.swing.JPanel pnMov;
    private javax.swing.JPanel pnNumeroHC;
    private javax.swing.JTextField txtAlergias;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldApellidosContacto;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldDireccion;
    private javax.swing.JTextField txtFieldNombres;
    private javax.swing.JTextField txtFieldNombresContacto;
    private javax.swing.JTextField txtFieldNumeroID;
    private javax.swing.JTextField txtFieldTelefono;
    private javax.swing.JTextField txtFieldTelefonoContacto;
    private javax.swing.JTextField txtFieldTrabajo;
    private javax.swing.JTextField txtNombreEnfHereditaria;
    private javax.swing.JTextField txtNumHC;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
