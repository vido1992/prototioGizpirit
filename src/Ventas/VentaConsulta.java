/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import Controladores.FacturaJpaController;
import Entidades.Factura;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class VentaConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentaConsulta
     */
        Factura fa = new Factura();
    FacturaJpaController Cfa = new FacturaJpaController();
    public VentaConsulta() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT"); 
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
        jLabel31 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jTextField28 = new javax.swing.JTextField();
        jBotonIniciarSesion1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButtonRegresar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(820, 559));

        jLabel31.setText("Seleccione el elemento de búsqueda");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione metodo de busqueda", "Número Factura", "Apellido Cliente", "Fecha", "C.I Cliente" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jBotonIniciarSesion1.setText("Buscar");
        jBotonIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonIniciarSesion1ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Factura", "Apellido Cliente", "Nombre Cliente", "Fecha", "Total"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jButtonRegresar2.setText("Regresar");
        jButtonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar2ActionPerformed(evt);
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
        jLabel7.setText("CONSULTA VENTA ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBotonIniciarSesion1)
                            .addComponent(jLabel31))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButtonRegresar2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar2)
                    .addComponent(jBotonIniciarSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButtonRegresar2ActionPerformed

    private void jBotonIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIniciarSesion1ActionPerformed
        // CArgamos table
        CargarTabla();
    }//GEN-LAST:event_jBotonIniciarSesion1ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed
public void CargarTabla(){
if(jComboBox9.getSelectedIndex()==0){
     JOptionPane.showMessageDialog(null, "Selecione una opcion a consultar");


}else if(jComboBox9.getSelectedItem().toString().equals("Número Factura")){
    
     //Sección 1 
            List<Factura> listfa = Cfa.findFacturaEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[5];
            //Sección 3
            for (int i = 0; i < listfa.size(); i++) {
                if(listfa.get(i).getNumerofactura().equals(jTextField28.getText())){
                Columna[0] = listfa.get(i).getNumerofactura();
                Columna[1] = listfa.get(i).getApellidos();
                Columna[2] = listfa.get(i).getNombres();
                Columna[3] = listfa.get(i).getFechaventa();
                Columna[4] = listfa.get(i).getTotal();
                
                modelo.addRow(Columna);
                }
            }
            jTable5.setModel(modelo);
            if (listfa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Factura", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }


}else if(jComboBox9.getSelectedItem().toString().equals("Apellido Cliente")){
  //Sección 1 
            List<Factura> listfa = Cfa.findFacturaEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[5];
            //Sección 3
            for (int i = 0; i < listfa.size(); i++) {
                if(listfa.get(i).getApellidos().equals(jTextField28.getText())){
                Columna[0] = listfa.get(i).getNumerofactura();
                Columna[1] = listfa.get(i).getApellidos();
                Columna[2] = listfa.get(i).getNombres();
                Columna[3] = listfa.get(i).getFechaventa();
                Columna[4] = listfa.get(i).getTotal();
                
                modelo.addRow(Columna);
                }
            }
            jTable5.setModel(modelo);
            if (listfa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Factura", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }

}else if(jComboBox9.getSelectedItem().toString().equals("C.I Cliente")){
  //Sección 1 
            List<Factura> listfa = Cfa.findFacturaEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[5];
            //Sección 3
            for (int i = 0; i < listfa.size(); i++) {
                if(listfa.get(i).getCicliente().equals(jTextField28.getText())){
                Columna[0] = listfa.get(i).getNumerofactura();
                Columna[1] = listfa.get(i).getApellidos();
                Columna[2] = listfa.get(i).getNombres();
                Columna[3] = listfa.get(i).getFechaventa();
                Columna[4] = listfa.get(i).getTotal();
                
                modelo.addRow(Columna);
                }
            }
            jTable5.setModel(modelo);
            if (listfa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Factura", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }

}else if(jComboBox9.getSelectedItem().toString().equals("Fecha")){
  //Sección 1 
            List<Factura> listfa = Cfa.findFacturaEntities();
            DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
            modelo.setRowCount(0);
            //Sección 2
            Object[] Columna = new Object[5];
            //Sección 3
            for (int i = 0; i < listfa.size(); i++) {
                if(listfa.get(i).getFechaventa().equals(jTextField28.getText())){
                Columna[0] = listfa.get(i).getNumerofactura();
                Columna[1] = listfa.get(i).getApellidos();
                Columna[2] = listfa.get(i).getNombres();
                Columna[3] = listfa.get(i).getFechaventa();
                Columna[4] = listfa.get(i).getTotal();
                
                modelo.addRow(Columna);
                }
            }
            jTable5.setModel(modelo);
            if (listfa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe Factura", "No se encuentra", JOptionPane.WARNING_MESSAGE);
            }

}



}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonIniciarSesion1;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField28;
    // End of variables declaration//GEN-END:variables
}
