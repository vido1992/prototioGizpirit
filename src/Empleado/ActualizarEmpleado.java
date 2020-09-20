/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Controladores.EmpleadoJpaController;
import Entidades.Empleado;
import Inicio.Base;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class ActualizarEmpleado extends javax.swing.JInternalFrame {

    EmpleadoJpaController Cemp = new EmpleadoJpaController();
    Validar validar = new Validar();
    Base base = new Base();
    public String CC, Nombre, Apellido, Direccion, Correo, sueldo, TelefonoCelular, telefonoConvencional;

    public ActualizarEmpleado() {
        initComponents();
        this.setTitle("Actualizo Empleado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelConsultaCli = new javax.swing.JLabel();
        txtCIActualizarEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreActualizarEmpleado = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoActualizarEmpleado = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelCelActualizarEmpleado = new javax.swing.JTextField();
        txtDicDomicActualizarEmpleado = new javax.swing.JTextField();
        txtTelConvenActualizarEmpleado = new javax.swing.JTextField();
        txtCorreoActualizarEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSueldoActualizarEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEstadoActualizarEmpleado = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnAyudaApellido1 = new javax.swing.JButton();
        btnAyudaSueldo2 = new javax.swing.JButton();
        cbRolEmpleadoRegistro = new javax.swing.JComboBox();

        setClosable(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabelConsultaCli.setText("Ingrese la Cédula de Identidad");

        jLabel4.setText("Nombres");

        txtNombreActualizarEmpleado.setEditable(false);
        txtNombreActualizarEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombreActualizarEmpleado.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel5.setText("Apellido");

        txtApellidoActualizarEmpleado.setEditable(false);
        txtApellidoActualizarEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellidoActualizarEmpleado.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel9.setText("Dirección de domicilio");

        jLabel6.setText("Teléfono celular");

        jLabel7.setText("Correo electrónico");

        jButton3.setText("Buscar");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabel8.setText("Teléfono convencional");

        jLabel10.setText("Rol");

        jLabel11.setText("Sueldo");

        jLabel12.setText("Estado");

        txtEstadoActualizarEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabelLogo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/GZlogohor3-01_200x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ACTUALIZACIÓN EMPLEADO");

        jButton4.setText("Actualizar");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAyudaApellido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaApellido1ActionPerformed(evt);
            }
        });

        btnAyudaSueldo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldo2ActionPerformed(evt);
            }
        });

        cbRolEmpleadoRegistro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Vendedor", "Administrador", "Bodeguero" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jButtonRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellidoActualizarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreActualizarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(txtTelConvenActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEstadoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtTelCelActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCorreoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSueldoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbRolEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAyudaSueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDicDomicActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAyudaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabelConsultaCli)
                        .addGap(56, 56, 56)
                        .addComponent(txtCIActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(288, 288, 288))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCIActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtDicDomicActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAyudaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelCelActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelConvenActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbRolEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtSueldoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAyudaSueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEstadoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        List<Empleado> listemp = Cemp.findEmpleadoEntities();
        for (int i = 0; i < listemp.size(); i++) {
            if (txtCIActualizarEmpleado.getText().equals(listemp.get(i).getCedula())) {

                txtNombreActualizarEmpleado.setText(listemp.get(i).getNombres());
                txtApellidoActualizarEmpleado.setText(listemp.get(i).getApellidos());
                txtCorreoActualizarEmpleado.setText(listemp.get(i).getEmail());
                txtDicDomicActualizarEmpleado.setText(listemp.get(i).getDireciondomicilio());
                txtTelCelActualizarEmpleado.setText(listemp.get(i).getTelefonocelular());
                txtTelConvenActualizarEmpleado.setText(listemp.get(i).getTelefonoconvencional());
               // cbRolEmpleadoRegistro.setSelectedIndex(listemp.get(i).getRolempleado());
                txtSueldoActualizarEmpleado.setText(listemp.get(i).getSueldo());
                if(listemp.get(i).getEstado().equals("Activo")){
                txtEstadoActualizarEmpleado.setSelectedIndex(0);
                }else{
                txtEstadoActualizarEmpleado.setSelectedIndex(1);
                }
                

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int i = 0;

        if (this.txtDicDomicActualizarEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO DIRECCION VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtTelCelActualizarEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CELULAR VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtTelConvenActualizarEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CONVENCIONAL VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtSueldoActualizarEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO SUELDO INICIAL VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtCorreoActualizarEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CORREO ELECTRÓNICO VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.cbRolEmpleadoRegistro.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso");
                // System.out.println(this.TelefonoClienteRegistro.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en Rol Empleado");
            }

            JOptionPane.showMessageDialog(null, "contador" + i);

            if (i == 9) {
        
        
        
        
        
            
            try {
                Empleado emp = new Empleado();
                emp.setCedula(txtCIActualizarEmpleado.getText());
                emp.setNombres(txtNombreActualizarEmpleado.getText());
                emp.setApellidos(txtApellidoActualizarEmpleado.getText());
                emp.setDireciondomicilio(txtDicDomicActualizarEmpleado.getText());
                emp.setTelefonocelular(txtTelCelActualizarEmpleado.getText());
                emp.setTelefonoconvencional(txtTelConvenActualizarEmpleado.getText());
                emp.setRolempleado(cbRolEmpleadoRegistro.getSelectedItem().toString());
                emp.setSueldo(txtSueldoActualizarEmpleado.getText());
                emp.setEmail(txtCorreoActualizarEmpleado.getText());
                emp.setEstado((String) txtEstadoActualizarEmpleado.getSelectedItem());
                Cemp.edit(emp);
                JOptionPane.showMessageDialog(null, "Empleado Actualizado");
            } catch (Exception ex) {
                Logger.getLogger(ActualizarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }

        
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAyudaApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaApellido1ActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar según RFC 733");
    }//GEN-LAST:event_btnAyudaApellido1ActionPerformed

    private void btnAyudaSueldo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldo2ActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaApellido1;
    private javax.swing.JButton btnAyudaSueldo2;
    private javax.swing.JComboBox cbRolEmpleadoRegistro;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConsultaCli;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField txtApellidoActualizarEmpleado;
    private javax.swing.JTextField txtCIActualizarEmpleado;
    private javax.swing.JTextField txtCorreoActualizarEmpleado;
    private javax.swing.JTextField txtDicDomicActualizarEmpleado;
    private javax.swing.JComboBox txtEstadoActualizarEmpleado;
    private java.awt.TextField txtNombreActualizarEmpleado;
    private javax.swing.JTextField txtSueldoActualizarEmpleado;
    private javax.swing.JTextField txtTelCelActualizarEmpleado;
    private javax.swing.JTextField txtTelConvenActualizarEmpleado;
    // End of variables declaration//GEN-END:variables
}
