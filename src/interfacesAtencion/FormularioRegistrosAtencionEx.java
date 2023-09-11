/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfacesAtencion;

import interfacesMédicos.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class FormularioRegistrosAtencionEx extends javax.swing.JInternalFrame {
    private JDesktopPane desktopPane;
    logicaAtencionMedica atencionMedica;
    /**
     * Creates new form FormularioRegistros
     */
    public FormularioRegistrosAtencionEx(JDesktopPane desktopPane, logicaAtencionMedica atencionMedica) {
        initComponents();
        this.desktopPane = desktopPane;
        this.atencionMedica = atencionMedica;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Subheading", 1, 14))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" Revisión de órganos y sistemas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 50));

        jLabel2.setText("Examen físico regional");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 360, 120));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 360, 120));
        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selección...", "Cabeza", "Cuello", "Tórax", "Abdomen", "Extremidades" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selección...", "Respiratorio", "Digestivo", "Genital" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jButton2.setText("Cancelar");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 560, 380));
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (verificarCamposLlenos()) {
            atencionMedica.setOrganoSistema((String) jComboBox2.getSelectedItem());
            atencionMedica.setDescripcionOS(jTextArea2.getText());
            atencionMedica.setReg((String) jComboBox1.getSelectedItem());
            atencionMedica.setDescripcionR(jTextArea1.getText());
            FormularioRegistrosAtencionDiagnos formulario = new FormularioRegistrosAtencionDiagnos(desktopPane, atencionMedica);
            desktopPane.add(formulario);
            formulario.setVisible(true);
            this.setVisible(false);
        } else{
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los parámetros para continuar.", "Advertencia", JOptionPane.WARNING_MESSAGE);      
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

     public boolean verificarCamposLlenos() {
        JTextArea[] textAreas = new JTextArea[2];

        textAreas[0] = jTextArea1;
        textAreas[1] = jTextArea2;
        
        if (jComboBox1.getSelectedIndex() != 0) {
            if (jComboBox2.getSelectedIndex() != 0) {
            for (JTextArea textArea : textAreas) {
            if (textArea.getText().isEmpty()) {
                return false; // Al menos un campo está vacío
            }
        }
            return true; // Todos los campos están llenos
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un item de Revision de organos y sistemas valido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un item de Examen fisico regional valido");

        }

        return false;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
