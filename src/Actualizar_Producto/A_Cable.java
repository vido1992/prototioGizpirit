/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar_Producto;

import Controladores.CableJpaController;
import Entidades.Cable;
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
public class A_Cable extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cable
     */
    CableJpaController Cca = new CableJpaController();
    Cable ca = new Cable();
Validar validar = new Validar();
    public A_Cable() {
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
        txtMarcaActualizacion = new javax.swing.JTextField();
        txtPrecioImportacionActualizacion = new javax.swing.JTextField();
        txtCodigoActualizacion = new javax.swing.JTextField();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPrecioPublico = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtModeloActualizacion = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        cbxLongitudActualizacion = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCableConsulta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jBotonRegistrarInv1 = new javax.swing.JButton();

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

        jLabel35.setText("Longitud");

        cbxLongitudActualizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "30 cm", "1.2 m" }));
        cbxLongitudActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLongitudActualizacionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ACTUALIZACIÓN  CABLE");

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

        jLabel4.setText("Precio inicial(USD):");

        jTableCableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo ", "Marca", "Longitud", "Precio Importación", "Precio Público"
            }
        ));
        jTableCableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCableConsultaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCableConsulta);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBotonRegistrarInv1.setText("Actualizar");
        jBotonRegistrarInv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarInv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecioPublico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxLongitudActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecioImportacionActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMarcaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigoActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtModeloActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonRegresar3)
                                    .addGap(55, 55, 55)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jBotonRegistrarInv1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtModeloActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxLongitudActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioImportacionActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioPublico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrarInv1)
                    .addComponent(jButtonRegresar3))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLongitudActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLongitudActualizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLongitudActualizacionActionPerformed

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      CargarDatosTabla();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed

        int i=0;
          
        if (this.txtCodigoActualizacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CODIGO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (txtModeloActualizacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MODELO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtMarcaActualizacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MARCA VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioImportacionActualizacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO INICIAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioPublico.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO AL PÚBLICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {
               //RJ-Reloj, AU-Audifonos, CM-Cámara, CA-Cargador, CB-Cable, IN-Interruptor, TO-Tomacorriente, SE-Sensor, CZ-ControladorVoz, La-Llaves Automáticas
            if (validar.validarCodigoTodos(this.txtCodigoActualizacion.getText().toString(),"CB")) {
                //{}
                i++; 
            }
            if (validar.validarModelosTodos(this.txtModeloActualizacion.getText().toString())) {
                i++;
                
            }
            if (validar.validarMarcaTodos(this.txtMarcaActualizacion.getText().toString())) {
                i++;
                
            }

            if (validar.validarSueldo(this.txtPrecioImportacionActualizacion.getText().toString())) {
                i++;
                
            }
            if (validar.validarSueldo(this.txtPrecioPublico.getText().toString())) {
                i++;
                
            }
            if(this.cbxLongitudActualizacion.getSelectedItem().toString()!="Selección")
            {i++;
            System.out.println( "buen ingreso");  
           
                
            }else{
            JOptionPane.showMessageDialog(null,  "Debe Seleccionar una opcion");
            }
           
            JOptionPane.showMessageDialog(null,  "contador"+i); 
            
             if (i==6)
            {
                
                 
        try {
            ca.setCodigo(txtCodigoActualizacion.getText());
            ca.setModelo(txtModeloActualizacion.getText());
            ca.setMarca(txtMarcaActualizacion.getText());
            ca.setLongitud((String) cbxLongitudActualizacion.getSelectedItem());
            ca.setPrecioimportacion(txtPrecioImportacionActualizacion.getText());
            ca.setPreciopublico(txtPrecioPublico.getText());
            Cca.edit(ca);
            JOptionPane.showMessageDialog(null, "Producto Cable Actualizado\n Correctamente");
            CargarDatosTabla();
        } catch (Exception ex) {
            Logger.getLogger(A_Cable.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        }
        
        
        
        
      

        
        
        
        
      
    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void jTableCableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCableConsultaMouseClicked
        // TODO add your handling code here:
        txtCodigoActualizacion.setText((String) jTableCableConsulta.getValueAt(jTableCableConsulta.getSelectedRow(), 0));
        txtModeloActualizacion.setText((String) jTableCableConsulta.getValueAt(jTableCableConsulta.getSelectedRow(), 1));
        txtMarcaActualizacion.setText((String) jTableCableConsulta.getValueAt(jTableCableConsulta.getSelectedRow(), 2));
        cbxLongitudActualizacion.setSelectedItem((String) jTableCableConsulta.getValueAt(jTableCableConsulta.getSelectedRow(), 3));
        txtPrecioImportacionActualizacion.setText((String) jTableCableConsulta.getValueAt(jTableCableConsulta.getSelectedRow(), 4));
        txtPrecioPublico.setText((String) jTableCableConsulta.getValueAt(jTableCableConsulta.getSelectedRow(), 5));
    }//GEN-LAST:event_jTableCableConsultaMouseClicked
public void CargarDatosTabla(){
  List<Cable> listC = Cca.findCableEntities();
        if (listC.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
        } else {

            //Sección 1 
            DefaultTableModel modelo = (DefaultTableModel) jTableCableConsulta.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[6];
            //Sección 3
            for (int i = 0; i < listC.size(); i++) {
                Columna[0] = listC.get(i).getCodigo();
                Columna[1] = listC.get(i).getModelo();
                Columna[2] = listC.get(i).getMarca();
                Columna[3] = listC.get(i).getLongitud();
                Columna[4] = listC.get(i).getPrecioimportacion();
                Columna[5] = listC.get(i).getPreciopublico();
                modelo.addRow(Columna);
            }
            jTableCableConsulta.setModel(modelo);
        }

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxLongitudActualizacion;
    private javax.swing.JButton jBotonRegistrarInv1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegresar3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCableConsulta;
    private javax.swing.JTextField txtCodigoActualizacion;
    private javax.swing.JTextField txtMarcaActualizacion;
    private javax.swing.JTextField txtModeloActualizacion;
    private javax.swing.JTextField txtPrecioImportacionActualizacion;
    private javax.swing.JTextField txtPrecioPublico;
    // End of variables declaration//GEN-END:variables
}
