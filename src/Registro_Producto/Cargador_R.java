/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Producto;

import Controladores.CargadorJpaController;
import Entidades.Cargador;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class Cargador_R extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cargador
     */
    CargadorJpaController Ccar = new CargadorJpaController();
    Cargador car = new Cargador();
    Validar validar = new Validar();

    public Cargador_R() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT-CARGADOR");        
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
        jLabel29 = new javax.swing.JLabel();
        txtMarcaRegistroCargador = new javax.swing.JTextField();
        txtPreciInicRegistroCargador = new javax.swing.JTextField();
        txtCodigoRegistroCargador = new javax.swing.JTextField();
        jBotonRegistrarInv1 = new javax.swing.JButton();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPrecioPubliRegistroCargador = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtModeloRegistroCargador = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        bxWattRegistroCargador = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        bxTipoRegistroCargador = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAyudaNombre = new javax.swing.JButton();
        btnAyudaSueldo = new javax.swing.JButton();
        btnAyudaSueldo2 = new javax.swing.JButton();

        setClosable(true);

        jLabel29.setText("Precio inicial (USD):");

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

        jLabel33.setText("Precio al público (USD):");

        jLabel34.setText("Marca:");

        jLabel35.setText("Tipo");

        bxWattRegistroCargador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "18 Wtts", "27 Wtts", "30 Wtts" }));

        jLabel37.setText("Watts de carga:");

        bxTipoRegistroCargador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Cubo USB", "Reloj" }));

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("REGISTRO CARGADOR");

        btnAyudaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaNombreActionPerformed(evt);
            }
        });

        btnAyudaSueldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldoActionPerformed(evt);
            }
        });

        btnAyudaSueldo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel35))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bxTipoRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPreciInicRegistroCargador, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecioPubliRegistroCargador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAyudaSueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bxWattRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarcaRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModeloRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBotonRegistrarInv1)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonRegresar3)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(bxTipoRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAyudaSueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigoRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31))
                            .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtModeloRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarcaRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(bxWattRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreciInicRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtPrecioPubliRegistroCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar3)
                    .addComponent(jBotonRegistrarInv1))
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        // TODO add your handling code here:
        txtCodigoRegistroCargador.setText("");
        txtMarcaRegistroCargador.setText("");
        txtModeloRegistroCargador.setText("");
        txtPreciInicRegistroCargador.setText("");
        txtPrecioPubliRegistroCargador.setText("");
        bxWattRegistroCargador.setSelectedIndex(0);
        
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed
        int i = 0;
        
        if (this.txtCodigoRegistroCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CODIGO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (txtModeloRegistroCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MODELO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtMarcaRegistroCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MARCA VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPreciInicRegistroCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO INICIAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioPubliRegistroCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO AL PÚBLICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {
            //RJ-Reloj, AU-Audifonos, CM-Cámara, CA-Cargador, CB-Cable, IN-Interruptor, TO-Tomacorriente, SE-Sensor, CZ-ControladorVoz, La-Llaves Automáticas
            if (validar.validarCodigoTodos(this.txtCodigoRegistroCargador.getText().toString(), "CA")) {
                //{}
                i++;                
            }
            if (validar.validarModelosTodos(this.txtModeloRegistroCargador.getText().toString())) {
                i++;
                
            }
            if (validar.validarMarcaTodos(this.txtMarcaRegistroCargador.getText().toString())) {
                i++;
                
            }
            
            if (validar.validarSueldo(this.txtPreciInicRegistroCargador.getText().toString())) {
                i++;
                
            }
            if (validar.validarSueldo(this.txtPrecioPubliRegistroCargador.getText().toString())) {
                i++;
                
            }
            if (this.bxTipoRegistroCargador.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso tipo");                
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en tipo");
            }
            if (this.bxWattRegistroCargador.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso de watts");                
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en Watts");
            }
            
            JOptionPane.showMessageDialog(null, "contador" + i);            
            
            if (i == 7) {
                System.out.println("REGISTRO");                
                try {
                    car.setCodigo(txtCodigoRegistroCargador.getText());
                    car.setModelo(txtModeloRegistroCargador.getText());
                    car.setMarca(txtMarcaRegistroCargador.getText());
                    car.setWattscarga(bxWattRegistroCargador.getSelectedItem().toString());
                    car.setTipo(bxTipoRegistroCargador.getSelectedItem().toString());
                    car.setPrecioimportacion(txtPreciInicRegistroCargador.getText());
                    car.setPreciopublico(txtPrecioPubliRegistroCargador.getText());
                    car.setCantidad("0");
                    car.setEstado("Activo");
                    car.setFechaimportacion("");
                    JOptionPane.showMessageDialog(null, "Cable Registrados");
                    Ccar.create(car);
                } catch (Exception ex) {
                    Logger.getLogger(Cargador_R.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void btnAyudaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaNombreActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar CA seguido de 3 números ");
    }//GEN-LAST:event_btnAyudaNombreActionPerformed

    private void btnAyudaSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldoActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldoActionPerformed

    private void btnAyudaSueldo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldo2ActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaNombre;
    private javax.swing.JButton btnAyudaSueldo;
    private javax.swing.JButton btnAyudaSueldo2;
    private javax.swing.JComboBox bxTipoRegistroCargador;
    private javax.swing.JComboBox bxWattRegistroCargador;
    private javax.swing.JButton jBotonRegistrarInv1;
    private javax.swing.JButton jButtonRegresar3;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCodigoRegistroCargador;
    private javax.swing.JTextField txtMarcaRegistroCargador;
    private javax.swing.JTextField txtModeloRegistroCargador;
    private javax.swing.JTextField txtPreciInicRegistroCargador;
    private javax.swing.JTextField txtPrecioPubliRegistroCargador;
    // End of variables declaration//GEN-END:variables
}
