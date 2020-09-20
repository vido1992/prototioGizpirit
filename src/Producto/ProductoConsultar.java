/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Controladores.AudifonosJpaController;
import Controladores.CableJpaController;
import Controladores.CamaraJpaController;
import Entidades.Audifonos;
import Entidades.Cable;
import Entidades.Camara;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class ProductoConsultar extends javax.swing.JInternalFrame {

    /**
     * Creates new form InventarioConsulta
     */
    CableJpaController Cca = new CableJpaController();
    Cable ca = new Cable();
    AudifonosJpaController Cau = new AudifonosJpaController();
    Audifonos au = new Audifonos();
    CamaraJpaController Ccam = new CamaraJpaController();
    Camara cam = new Camara();

    public ProductoConsultar() {
        initComponents();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsultaProducto = new javax.swing.JTable();
        jButtonRegresar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cbxCodigoConsulta = new javax.swing.JComboBox<>();
        jLabelBusqInv = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();

        jTableConsultaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo ", "Precio Público", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(jTableConsultaProducto);

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cbxCodigoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un producto", "RJ-Reloj", "AU-Audifonos", "CM-Cámara", "CA-Cargador", "CB-Cable", "IN-Interruptor", "TO-Tomacorriente", "SE-Sensor", "CZ-ControladorVoz", "La-Llaves Automáticas" }));
        cbxCodigoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCodigoConsultaActionPerformed(evt);
            }
        });

        jLabelBusqInv.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("CONSULTAR PRODUCTO");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabelLogo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/GZlogohor3-01_200x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jLabelBusqInv))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cbxCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jButtonRegresar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBusqInv)
                    .addComponent(cbxCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegresar)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed

        /*this.setVisible(false);
        Menu m=new Menu();
        m.setEnabled(true);*/
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void cbxCodigoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCodigoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCodigoConsultaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        if (this.cbxCodigoConsulta.getSelectedItem().equals("Selecione un producto")) {
            JOptionPane.showMessageDialog(null, "Selecione un producto", "CAMPO No selecionado", JOptionPane.WARNING_MESSAGE);
        } else if (this.cbxCodigoConsulta.getSelectedItem().equals("CB-Cable")) {
            //Sección 1 
            List<Cable> listC = Cca.findCableEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaProducto.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[6];
            //Sección 3

            for (int i = 0; i < listC.size(); i++) {
                Columna[0] = listC.get(i).getCodigo();
                Columna[1] = listC.get(i).getModelo();
                Columna[2] = listC.get(i).getPreciopublico();
                Columna[3] = listC.get(i).getCantidad();
                modelo.addRow(Columna);
            }
            jTableConsultaProducto.setModel(modelo);
            if (listC.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }
        } else if (this.cbxCodigoConsulta.getSelectedItem().equals("AU-Audifonos")) {

            //Sección 1 
            List<Audifonos> listAu = Cau.findAudifonosEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaProducto.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[6];
            //Sección 3
            for (int i = 0; i < listAu.size(); i++) {
                Columna[0] = listAu.get(i).getCodigo();
                Columna[1] = listAu.get(i).getModelo();
                Columna[2] = listAu.get(i).getPreciopublico();
                Columna[3] = listAu.get(i).getCantidad();
                modelo.addRow(Columna);
            }
            jTableConsultaProducto.setModel(modelo);
            if (listAu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }
        } else if (this.cbxCodigoConsulta.getSelectedItem().equals("CM-Cámara")) {
            //Sección 1 
            List<Camara> listcam = Ccam.findCamaraEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaProducto.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[6];
            //Sección 3
            for (int i = 0; i < listcam.size(); i++) {
                Columna[0] = listcam.get(i).getCodigo();
                Columna[1] = listcam.get(i).getModelo();
                Columna[2] = listcam.get(i).getPreciopublico();
                Columna[3] = listcam.get(i).getCantidad();
                modelo.addRow(Columna);
            }
            jTableConsultaProducto.setModel(modelo);
            if (listcam.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCodigoConsulta;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBusqInv;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsultaProducto;
    // End of variables declaration//GEN-END:variables
}
