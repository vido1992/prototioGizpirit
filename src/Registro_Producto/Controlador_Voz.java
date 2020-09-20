/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Producto;

import Controladores.ControladorvozJpaController;
import Entidades.Controladorvoz;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class Controlador_Voz extends javax.swing.JInternalFrame {

    /**
     * Creates new form Controlador_Voz
     */
    ControladorvozJpaController Ccv = new ControladorvozJpaController();
    Controladorvoz cv = new Controladorvoz();
    Validar validar = new Validar();

    public Controlador_Voz() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT-CONTROLADOR DE VOZ");
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
        txtPrecioInicialRegistroControlador = new javax.swing.JTextField();
        txtCodigoRegistroControlador = new javax.swing.JTextField();
        jBotonRegistrarInv1 = new javax.swing.JButton();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtModeloRegistroControlador = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        boxMarcaRegistroControlador = new javax.swing.JComboBox();
        boxTamañoRegistroControlador = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioPublicoRegistroControlador = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnAyudaNombre = new javax.swing.JButton();
        btnAyudaSueldo = new javax.swing.JButton();
        btnAyudaSueldo1 = new javax.swing.JButton();

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

        jLabel35.setText("Tamaño:");

        boxMarcaRegistroControlador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Google", "Alexa" }));
        boxMarcaRegistroControlador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMarcaRegistroControladorActionPerformed(evt);
            }
        });

        boxTamañoRegistroControlador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Pequeño", "Grande" }));
        boxTamañoRegistroControlador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTamañoRegistroControladorActionPerformed(evt);
            }
        });

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
        jLabel7.setText("PRODUCTO CONTROLADOR VOZ");

        jLabel4.setText("Precio inicial (USD):");

        jLabel36.setText("Precio al público (USD):");

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

        btnAyudaSueldo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel4))
                                    .addGap(40, 40, 40))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtModeloRegistroControlador, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(boxMarcaRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxTamañoRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioInicialRegistroControlador)
                                .addComponent(txtPrecioPublicoRegistroControlador)
                                .addComponent(txtCodigoRegistroControlador)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jBotonRegistrarInv1)
                            .addGap(92, 92, 92)
                            .addComponent(jButtonRegresar3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAyudaSueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModeloRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxMarcaRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxTamañoRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtPrecioInicialRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAyudaSueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioPublicoRegistroControlador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar3)
                    .addComponent(jBotonRegistrarInv1))
                .addGap(182, 182, 182))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void boxMarcaRegistroControladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMarcaRegistroControladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMarcaRegistroControladorActionPerformed

    private void boxTamañoRegistroControladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTamañoRegistroControladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTamañoRegistroControladorActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed
        int i = 0;

        if (this.txtCodigoRegistroControlador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CODIGO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (txtModeloRegistroControlador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MODELO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioInicialRegistroControlador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO INICIAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioPublicoRegistroControlador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO AL PÚBLICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {
            //RJ-Reloj, AU-Audifonos, CM-Cámara, CA-Cargador, CB-Cable, IN-Interruptor, TO-Tomacorriente, SE-Sensor, CZ-ControladorVoz, La-Llaves Automáticas
            if (validar.validarCodigoTodos(this.txtCodigoRegistroControlador.getText().toString(), "CZ")) {
                //{}
                i++;
            }
            if (validar.validarModelosTodos(this.txtModeloRegistroControlador.getText().toString())) {
                i++;

            }

            if (validar.validarSueldo(this.txtPrecioInicialRegistroControlador.getText().toString())) {
                i++;

            }
            if (validar.validarSueldo(this.txtPrecioPublicoRegistroControlador.getText().toString())) {
                i++;

            }
            if (this.boxMarcaRegistroControlador.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso marca");
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en marca");
            }
            if (this.boxTamañoRegistroControlador.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso de Tamaño");
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en tamaño");
            }

            JOptionPane.showMessageDialog(null, "contador" + i);

            if (i == 6) {
                System.out.println( "REGISTRO");  
                try {
                    cv.setCodigo(txtCodigoRegistroControlador.getText());
                    cv.setModelo(txtModeloRegistroControlador.getText());
                    cv.setMarca(boxMarcaRegistroControlador.getSelectedItem().toString());
                    cv.setTamaño(boxTamañoRegistroControlador.getSelectedItem().toString());
                    cv.setPrecioimportacion(txtPrecioInicialRegistroControlador.getText());
                    cv.setPreciopublico(txtPrecioPublicoRegistroControlador.getText());
                    cv.setCantidad("0");
                    cv.setEstado("Activo");
                    Ccv.create(cv);
                    JOptionPane.showMessageDialog(null, "Cable Registrados");
                } catch (Exception ex) {
                    Logger.getLogger(Controlador_Voz.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }


    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void btnAyudaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaNombreActionPerformed
 JOptionPane.showMessageDialog(this, "Debe Ingresar CZ seguido de 3 números ");
    }//GEN-LAST:event_btnAyudaNombreActionPerformed

    private void btnAyudaSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldoActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldoActionPerformed

    private void btnAyudaSueldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldo1ActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaSueldo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxMarcaRegistroControlador;
    private javax.swing.JComboBox boxTamañoRegistroControlador;
    private javax.swing.JButton btnAyudaNombre;
    private javax.swing.JButton btnAyudaSueldo;
    private javax.swing.JButton btnAyudaSueldo1;
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
    private javax.swing.JTextField txtCodigoRegistroControlador;
    private javax.swing.JTextField txtModeloRegistroControlador;
    private javax.swing.JTextField txtPrecioInicialRegistroControlador;
    private javax.swing.JTextField txtPrecioPublicoRegistroControlador;
    // End of variables declaration//GEN-END:variables
}
