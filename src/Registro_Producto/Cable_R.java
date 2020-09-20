/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Producto;

import Controladores.CableJpaController;
import Entidades.Cable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class Cable_R extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cable
     */
     Validar validar = new Validar();
      
      
    CableJpaController Cca = new CableJpaController();
    Cable ca = new Cable();
    public Cable_R() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT-CABLE"); 
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
        txtMarcaRegistro = new javax.swing.JTextField();
        txtCodigoRegistro = new javax.swing.JTextField();
        jBotonRegistrarInv1 = new javax.swing.JButton();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtModeloRegistro = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        cbLongitudRegistro = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioInicialRegistro = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtPrecioPublicaRegistro = new javax.swing.JTextField();
        btnAyudaSueldo = new javax.swing.JButton();
        btnAyudaSueldo1 = new javax.swing.JButton();
        btnAyudaNombre = new javax.swing.JButton();

        setClosable(true);

        jBotonRegistrarInv1.setText("Registrar");
        jBotonRegistrarInv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarInv1ActionPerformed(evt);
            }
        });

        jButtonRegresar3.setText("Regresar");
        jButtonRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar3ActionPerformed(evt);
            }
        });

        jLabel31.setText("Código:");

        jLabel32.setText("Modelo:");

        jLabel34.setText("Marca:");

        jLabel35.setText("Longitud");

        cbLongitudRegistro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "30 cm", "1.2 m" }));
        cbLongitudRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLongitudRegistroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("REGISTRO CABLE");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabelLogo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/GZlogohor3-01_200x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabel4.setText("Precio inicial (USD):");

        jLabel36.setText("Precio al público (USD):");

        btnAyudaSueldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldoActionPerformed(evt);
            }
        });

        btnAyudaSueldo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldo1ActionPerformed(evt);
            }
        });

        btnAyudaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel31)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioInicialRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLongitudRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarcaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtModeloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioPublicaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAyudaSueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonRegistrarInv1)
                .addGap(101, 101, 101)
                .addComponent(jButtonRegresar3)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtModeloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMarcaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbLongitudRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPrecioInicialRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(txtPrecioPublicaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAyudaSueldo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar3)
                    .addComponent(jBotonRegistrarInv1))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLongitudRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLongitudRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLongitudRegistroActionPerformed

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed
        int i=0;
          
        if (this.txtCodigoRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CODIGO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (txtModeloRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MODELO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtMarcaRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MARCA VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioInicialRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO INICIAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioPublicaRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO AL PÚBLICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {
               //RJ-Reloj, AU-Audifonos, CM-Cámara, CA-Cargador, CB-Cable, IN-Interruptor, TO-Tomacorriente, SE-Sensor, CZ-ControladorVoz, La-Llaves Automáticas
            if (validar.validarCodigoTodos(this.txtCodigoRegistro.getText().toString(),"CB")) {
                //{}
                i++; 
            }
            if (validar.validarModelosTodos(this.txtModeloRegistro.getText().toString())) {
                i++;
                
            }
            if (validar.validarMarcaTodos(this.txtMarcaRegistro.getText().toString())) {
                i++;
                
            }

            if (validar.validarSueldo(this.txtPrecioInicialRegistro.getText().toString())) {
                i++;
                
            }
            if (validar.validarSueldo(this.txtPrecioPublicaRegistro.getText().toString())) {
                i++;
                
            }
            if(this.cbLongitudRegistro.getSelectedItem().toString()!="Selección")
            {i++;
            System.out.println( "buen ingreso");  
           
                
            }else{
            JOptionPane.showMessageDialog(null,  "Debe Seleccionar una opcion en longitud");
            }
           
            JOptionPane.showMessageDialog(null,  "contador"+i); 
            
             if (i==6)
            {
                JOptionPane.showMessageDialog(null,  "Cable Registrados");
                  try {
            // TODO add your handling code here:
            ca.setCodigo(txtCodigoRegistro.getText());
            ca.setModelo(txtModeloRegistro.getText());
            ca.setMarca(txtMarcaRegistro.getText());
            ca.setLongitud(cbLongitudRegistro.getSelectedItem().toString());
            ca.setPrecioimportacion(txtPrecioInicialRegistro.getText());
            ca.setPreciopublico(txtPrecioPublicaRegistro.getText());
            ca.setFechaimportacion("");
            ca.setCantidad("0");
            ca.setEstado("Activo");
            Cca.create(ca);
            JOptionPane.showMessageDialog(null, "Producto Cable Registrado\n Correctamente");
        } catch (Exception ex) {
            Logger.getLogger(Cable_R.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        }
        
        
        
        
      

    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void btnAyudaSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldoActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldoActionPerformed

    private void btnAyudaSueldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldo1ActionPerformed
 JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldo1ActionPerformed

    private void btnAyudaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaNombreActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar CB seguido de 3 números ");
    }//GEN-LAST:event_btnAyudaNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaNombre;
    private javax.swing.JButton btnAyudaSueldo;
    private javax.swing.JButton btnAyudaSueldo1;
    private javax.swing.JComboBox cbLongitudRegistro;
    private javax.swing.JButton jBotonRegistrarInv1;
    private javax.swing.JButton jButtonRegresar3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCodigoRegistro;
    private javax.swing.JTextField txtMarcaRegistro;
    private javax.swing.JTextField txtModeloRegistro;
    private javax.swing.JTextField txtPrecioInicialRegistro;
    private javax.swing.JTextField txtPrecioPublicaRegistro;
    // End of variables declaration//GEN-END:variables
}
