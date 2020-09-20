/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Controladores.AudifonosJpaController;
import Controladores.CableJpaController;
import Controladores.CamaraJpaController;
import Controladores.exceptions.NonexistentEntityException;
import Entidades.Audifonos;
import Entidades.Cable;
import Entidades.Camara;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class ProductoEliminar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProductoActualizar
     */
    CableJpaController Cca = new CableJpaController();
    Cable ca = new Cable();
    AudifonosJpaController Cau = new AudifonosJpaController();
    Audifonos au = new Audifonos();
    CamaraJpaController Ccam = new CamaraJpaController();
    Camara cam = new Camara();

    public ProductoEliminar() {
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
        jLabel1 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jBotonEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        cbxProductoEliminar = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProductoEliminar = new javax.swing.JTable();

        jLabel1.setText("Seleccione producto a actualizar:");

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ELIMINACIÓN DE PRODUCTO");

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

        cbxProductoEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un producto a eliminar", "RJ-Reloj", "AU-Audifonos", "CM-Cámara", "CA-Cargador", "CB-Cable", "IN-Interruptor", "TO-Tomacorriente", "SE-Sensor", "CZ-ControladorVoz", "La-Llaves Automáticas" }));
        cbxProductoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductoEliminarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableProductoEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo ", "Marca", "Longitud", "Resolución", "Tipo", "Angulo de Abertura", "Precio Importación", "Precio Público", "Cantidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableProductoEliminar);
        if (jTableProductoEliminar.getColumnModel().getColumnCount() > 0) {
            jTableProductoEliminar.getColumnModel().getColumn(0).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(1).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(2).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(3).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(4).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(5).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(6).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(7).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(8).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(9).setResizable(false);
            jTableProductoEliminar.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonEliminar)
                .addGap(66, 66, 66)
                .addComponent(jButtonRegresar)
                .addGap(261, 261, 261))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbxProductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxProductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonEliminar)
                    .addComponent(jButtonRegresar))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        try {
            String CodigoProducto = (String) jTableProductoEliminar.getValueAt(jTableProductoEliminar.getSelectedRow(), 0);
            if (CodigoProducto == null) {
                JOptionPane.showMessageDialog(null, "Selecione un producto de la tabla");

            } else if (this.cbxProductoEliminar.getSelectedItem().equals("CB-Cable")) {
                Cca.destroy(CodigoProducto);
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                CargarTabla();
            } else if (this.cbxProductoEliminar.getSelectedItem().equals("AU-Audifonos")) {
                Cau.destroy(CodigoProducto);
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                CargarTabla();
            } else if (this.cbxProductoEliminar.getSelectedItem().equals("CM-Cámara")) {
                Ccam.destroy(CodigoProducto);
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                CargarTabla();
            }

        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ProductoEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void cbxProductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProductoEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        CargarTabla();

    }//GEN-LAST:event_jButtonBuscarActionPerformed
    public void CargarTabla() {

        if (this.cbxProductoEliminar.getSelectedItem().equals("Selecione un producto a eliminar")) {
            JOptionPane.showMessageDialog(null, "Selecione un producto", "CAMPO No selecionado", JOptionPane.WARNING_MESSAGE);
        } else if (this.cbxProductoEliminar.getSelectedItem().equals("CB-Cable")) {
            //Sección 1 
            List<Cable> listC = Cca.findCableEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTableProductoEliminar.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[15];
            //Sección 3
            for (int i = 0; i < listC.size(); i++) {
                Columna[0] = listC.get(i).getCodigo();
                Columna[1] = listC.get(i).getModelo();
                Columna[2] = listC.get(i).getMarca();
                Columna[3] = listC.get(i).getLongitud();
                Columna[7] = listC.get(i).getPrecioimportacion();
                Columna[8] = listC.get(i).getPreciopublico();
                Columna[9] = listC.get(i).getCantidad();
                Columna[10] = listC.get(i).getEstado();
                modelo.addRow(Columna);
            }
            jTableProductoEliminar.setModel(modelo);
            if (listC.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }
        } else if (this.cbxProductoEliminar.getSelectedItem().equals("AU-Audifonos")) {

            //Sección 1 
            List<Audifonos> listAu = Cau.findAudifonosEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTableProductoEliminar.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[15];
            //Sección 3
            for (int i = 0; i < listAu.size(); i++) {
                Columna[0] = listAu.get(i).getCodigo();
                Columna[1] = listAu.get(i).getModelo();
                Columna[2] = listAu.get(i).getMarca();
                Columna[5] = listAu.get(i).getTipo();
                Columna[7] = listAu.get(i).getPrecioimportacion();
                Columna[8] = listAu.get(i).getPreciopublico();
                Columna[9] = listAu.get(i).getCantidad();
                Columna[10] = listAu.get(i).getEstado();
                modelo.addRow(Columna);
            }
            jTableProductoEliminar.setModel(modelo);
            if (listAu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }
        } else if (this.cbxProductoEliminar.getSelectedItem().equals("CM-Cámara")) {
            //Sección 1 
            List<Camara> listcam = Ccam.findCamaraEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTableProductoEliminar.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[15];
            //Sección 3
            for (int i = 0; i < listcam.size(); i++) {
                Columna[0] = listcam.get(i).getCodigo();
                Columna[1] = listcam.get(i).getModelo();
                Columna[2] = listcam.get(i).getMarca();
                Columna[4] = listcam.get(i).getResolucion();
                Columna[5] = listcam.get(i).getTipo();
                Columna[6] = listcam.get(i).getAnguloavertura();
                Columna[7] = listcam.get(i).getPrecioimportacion();
                Columna[8] = listcam.get(i).getPreciopublico();
                Columna[9] = listcam.get(i).getCantidad();
                Columna[10] = listcam.get(i).getEstado();
                modelo.addRow(Columna);
            }
            jTableProductoEliminar.setModel(modelo);
            if (listcam.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxProductoEliminar;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProductoEliminar;
    // End of variables declaration//GEN-END:variables
}
