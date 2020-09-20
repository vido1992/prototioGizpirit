/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar_Producto;

import Controladores.RelojJpaController;
import Entidades.Reloj;
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
public class A_Reloj extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reloj
     */
        RelojJpaController Creloj = new RelojJpaController();
    Reloj r = new Reloj();
        Validar val = new Validar();

    public A_Reloj() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT-RELOJ"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo1 = new javax.swing.JTextField();
        jBotonRegistrarInv1 = new javax.swing.JButton();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jComboBoxGama = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jRadioButtonSiSumer = new javax.swing.JRadioButton();
        jRadioButtonNoSumer = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jRadioButtonSiSis = new javax.swing.JRadioButton();
        jRadioButtonNoSis = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrecioImpo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecioPubl = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setClosable(true);

        jTextFieldModelo1.setEnabled(false);
        jTextFieldModelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModelo1ActionPerformed(evt);
            }
        });

        jBotonRegistrarInv1.setText("Actualizar");
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

        jLabel35.setText("Sumergible: ");

        jComboBoxGama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Alta", "Baja", "Media" }));

        jLabel38.setText("Gama: ");

        buttonGroup1.add(jRadioButtonSiSumer);
        jRadioButtonSiSumer.setText("SI");

        buttonGroup1.add(jRadioButtonNoSumer);
        jRadioButtonNoSumer.setText("NO");

        jLabel39.setText("Sistema Android: ");

        buttonGroup2.add(jRadioButtonSiSis);
        jRadioButtonSiSis.setText("SI");

        buttonGroup2.add(jRadioButtonNoSis);
        jRadioButtonNoSis.setText("NO");

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
        jLabel7.setText("ACTUALIZACIÓN  RELOJ");

        jLabel4.setText("Precio inicial (USD):");

        jLabel5.setText("Precio al público (USD):");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo ", "Marca", "Gama", "Sumergible", "S.O Android", "Precio Inicial", "Precio Público"
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(353, 353, 353))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jBotonRegistrarInv1)
                                .addGap(107, 107, 107)
                                .addComponent(jButtonRegresar3))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel38))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldModelo)
                                        .addComponent(jTextFieldModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonSiSis, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButtonSiSumer, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButtonNoSis)
                                            .addComponent(jRadioButtonNoSumer)))
                                    .addComponent(jTextFieldPrecioImpo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPrecioPubl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jRadioButtonSiSumer)
                    .addComponent(jRadioButtonNoSumer))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jRadioButtonSiSis)
                    .addComponent(jRadioButtonNoSis))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrecioImpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecioPubl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar3)
                    .addComponent(jBotonRegistrarInv1))
                .addGap(49, 49, 49))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed
        try {
            if (jTextFieldModelo1.getText().isEmpty() || jTextFieldModelo.getText().isEmpty() || jTextFieldMarca.getText().isEmpty() || jTextFieldPrecioImpo.getText().isEmpty() || jTextFieldPrecioPubl.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ingrese todos los campos", "Campo obligatorio", JOptionPane.WARNING_MESSAGE);
            } else {
                val.ValidarTextoCodigo(jTextFieldModelo1);
                val.ValidarTextoModelo(jTextFieldModelo);
                val.ValidarTextoMarca(jTextFieldMarca);
                val.ValidarJcombobox(jComboBoxGama);
                
                /*val.ValidarRadioButomsis(jRadioButtonSiSis);
                val.ValidarRadioButomsis(jRadioButtonNoSis);
                
                val.ValidarRadioButomSum(jRadioButtonSiSumer);
                val.ValidarRadioButomSum(jRadioButtonNoSumer);*/
                
                val.ValidarPrecioImportacion(jTextFieldPrecioImpo);
                val.ValidarPrecioPublico(jTextFieldPrecioPubl);
                
            }
            r.setCodigo(jTextFieldModelo1.getText());
            r.setModelo(jTextFieldModelo.getText());
            r.setMarca(jTextFieldMarca.getText());
            r.setGama((String) jComboBoxGama.getSelectedItem());
            if(jRadioButtonSiSumer.isSelected()){
                r.setSumergible(jRadioButtonSiSumer.getText().toString());
            }else{
                r.setSumergible(jRadioButtonNoSumer.getText().toString());
            }
            if(jRadioButtonSiSis.isSelected()){
                r.setSistemaandroid(jRadioButtonSiSis.getText().toString());
            }else{
                r.setSistemaandroid(jRadioButtonNoSis.getText().toString());
            }
            r.setPrecioimportacion(jTextFieldPrecioImpo.getText().toString());
            r.setPreciopublico(jTextFieldPrecioPubl.getText().toString());

            Creloj.edit(r);
            
            JOptionPane.showMessageDialog(null, "Producto Reloj Actualizado\n Correctamente");
            cargartabla();
        } catch (Exception ex) {
            Logger.getLogger(Reloj_R.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void jTextFieldModelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModelo1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:}
        cargartabla();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        jTextFieldModelo1.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 0));
        jTextFieldModelo.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 1));
        jTextFieldMarca.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 2));
       jComboBoxGama.setSelectedItem((String) jTable3.getValueAt(jTable3.getSelectedRow(), 3));
       String sumer = (String) jTable3.getValueAt(jTable3.getSelectedRow(), 4);
           if(sumer.equals("SI")){
             jRadioButtonSiSumer.setSelected(true);
            }else{
               jRadioButtonNoSumer.setSelected(true);
            }
             String sistem = (String) jTable3.getValueAt(jTable3.getSelectedRow(), 5);
            if(sistem.equals("SI")){
                jRadioButtonSiSis.setSelected(true);
            }else{
             jRadioButtonNoSis.setSelected(true);
            }       
                jTextFieldPrecioImpo.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 6));
                
               jTextFieldPrecioPubl.setText((String) jTable3.getValueAt(jTable3.getSelectedRow(), 7)); 
    }//GEN-LAST:event_jTable3MouseClicked
public void cargartabla(){
    List<Reloj> listrej = Creloj.findRelojEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[8];
            //Sección 3
            for (int i = 0; i < listrej.size(); i++) {
                Columna[0] = listrej.get(i).getCodigo();
                Columna[1] = listrej.get(i).getModelo();
                Columna[2] = listrej.get(i).getMarca();
                Columna[3] = listrej.get(i).getGama();
                Columna[4] = listrej.get(i).getSumergible();
                Columna[5] = listrej.get(i).getSistemaandroid();
                Columna[6] = listrej.get(i).getPrecioimportacion();
                Columna[7] = listrej.get(i).getPreciopublico();
 
                modelo.addRow(Columna);
            }
            jTable3.setModel(modelo);
            if (listrej.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Producto", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }


}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBotonRegistrarInv1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonRegresar3;
    private javax.swing.JComboBox jComboBoxGama;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonNoSis;
    private javax.swing.JRadioButton jRadioButtonNoSumer;
    private javax.swing.JRadioButton jRadioButtonSiSis;
    private javax.swing.JRadioButton jRadioButtonSiSumer;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldModelo1;
    private javax.swing.JTextField jTextFieldPrecioImpo;
    private javax.swing.JTextField jTextFieldPrecioPubl;
    // End of variables declaration//GEN-END:variables
}
