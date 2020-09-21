/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar_Producto;

import Controladores.CargadorJpaController;
import Entidades.Cargador;
import Registro_Producto.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class A_Cargador extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cargador
     */
    CargadorJpaController Ccar = new CargadorJpaController();
    Cargador car = new Cargador();
    Validar validar = new Validar();
    String cantidad;
    String fechaImpor;
    String Estado;

    public A_Cargador() {
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
        txtMarcaActualizarCargador = new javax.swing.JTextField();
        txtPrecioInicialActualizarCargador = new javax.swing.JTextField();
        txtCodigoActualizarCargador = new javax.swing.JTextField();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPrecioPublicoActualizarCargador = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtModeloActualizarCargador = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        boxWattActualizarCargador = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        boxTipoActualizarCargador = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jBotonRegistrarInv1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

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

        boxWattActualizarCargador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "18 Wtts", "27 Wtts", "30 Wtts" }));

        jLabel37.setText("Watts de carga:");

        boxTipoActualizarCargador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Cubo USB", "Reloj" }));

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
        jLabel7.setText("ACTUALIZACIÓN  CARGADOR");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Código", "Modelo ", "Marca", "Watts", "Precio Inicial", "Precio Público"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jBotonRegistrarInv1.setText("Actualizar");
        jBotonRegistrarInv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarInv1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio inicial (USD):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel4))
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTipoActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxWattActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioInicialActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioPublicoActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarcaActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModeloActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jButton6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jBotonRegistrarInv1)
                                .addGap(189, 189, 189)
                                .addComponent(jButtonRegresar3)
                                .addGap(0, 190, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(boxTipoActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtModeloActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(boxWattActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioInicialActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtPrecioPublicoActualizarCargador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrarInv1)
                    .addComponent(jButtonRegresar3))
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed

        int i = 0;

        if (this.txtCodigoActualizarCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CODIGO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (txtModeloActualizarCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MODELO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtMarcaActualizarCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MARCA VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioInicialActualizarCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO INICIAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioPublicoActualizarCargador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO AL PÚBLICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {
            //RJ-Reloj, AU-Audifonos, CM-Cámara, CA-Cargador, CB-Cable, IN-Interruptor, TO-Tomacorriente, SE-Sensor, CZ-ControladorVoz, La-Llaves Automáticas
            if (validar.validarCodigoTodos(this.txtCodigoActualizarCargador.getText().toString(), "CA")) {
                //{}
                i++;
            }
            if (validar.validarModelosTodos(this.txtModeloActualizarCargador.getText().toString())) {
                i++;

            }
            if (validar.validarMarcaTodos(this.txtMarcaActualizarCargador.getText().toString())) {
                i++;

            }

            if (validar.validarSueldo(this.txtPrecioInicialActualizarCargador.getText().toString())) {
                i++;

            }
            if (validar.validarSueldo(this.txtPrecioPublicoActualizarCargador.getText().toString())) {
                i++;

            }
            if (this.boxTipoActualizarCargador.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso tipo");
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion");
            }
            if (this.boxWattActualizarCargador.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso de watts");
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion");
            }

            JOptionPane.showMessageDialog(null, "contador" + i);

            if (i == 7) {
                try {
                    car.setCodigo(txtCodigoActualizarCargador.getText());
                    car.setModelo(txtModeloActualizarCargador.getText());
                    car.setMarca(txtMarcaActualizarCargador.getText());
                    car.setWattscarga(boxWattActualizarCargador.getSelectedItem().toString());
                    car.setTipo(boxTipoActualizarCargador.getSelectedItem().toString());
                    car.setPrecioimportacion(txtPrecioInicialActualizarCargador.getText());
                    car.setPreciopublico(txtPrecioPublicoActualizarCargador.getText());
                    car.setCantidad(cantidad);
                    car.setFechaimportacion(fechaImpor);
                    car.setEstado(Estado);
                    JOptionPane.showMessageDialog(null, "Cargador Actualizado");
                    Ccar.edit(car);
                    cargartabla();
                } catch (Exception ex) {
                    Logger.getLogger(Cargador_R.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cargartabla();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        txtCodigoActualizarCargador.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 1));
        txtModeloActualizarCargador.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 2));
        txtMarcaActualizarCargador.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 3));
        boxWattActualizarCargador.setSelectedItem((String) jTable3.getValueAt(jTable3.getSelectedRow(), 4));
        boxTipoActualizarCargador.setSelectedItem((String) jTable3.getValueAt(jTable3.getSelectedRow(), 0));
        txtPrecioInicialActualizarCargador.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 5));
        txtPrecioPublicoActualizarCargador.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 6));

    }//GEN-LAST:event_jTable3MouseClicked

    public void cargartabla() {
        List<Cargador> listcar = Ccar.findCargadorEntities();
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        modelo.setRowCount(0);
        //Sección 2
        Object[] Columna = new Object[7];
        //Sección 3
        for (int i = 0; i < listcar.size(); i++) {
            Columna[0] = listcar.get(i).getTipo();
            Columna[1] = listcar.get(i).getCodigo();
            Columna[2] = listcar.get(i).getModelo();
            Columna[3] = listcar.get(i).getMarca();
            Columna[4] = listcar.get(i).getWattscarga();
            Columna[5] = listcar.get(i).getPrecioimportacion();
            Columna[6] = listcar.get(i).getPreciopublico();
            cantidad = listcar.get(i).getCantidad();
            fechaImpor = listcar.get(i).getFechaimportacion();
            Estado = listcar.get(i).getEstado();

            modelo.addRow(Columna);
        }
        jTable3.setModel(modelo);
        if (listcar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxTipoActualizarCargador;
    private javax.swing.JComboBox boxWattActualizarCargador;
    private javax.swing.JButton jBotonRegistrarInv1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonRegresar3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtCodigoActualizarCargador;
    private javax.swing.JTextField txtMarcaActualizarCargador;
    private javax.swing.JTextField txtModeloActualizarCargador;
    private javax.swing.JTextField txtPrecioInicialActualizarCargador;
    private javax.swing.JTextField txtPrecioPublicoActualizarCargador;
    // End of variables declaration//GEN-END:variables
}
