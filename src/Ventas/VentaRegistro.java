/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import Cliente.ConsultaCliente;
import Controladores.FacturaJpaController;
import Entidades.Cable;
import Entidades.Empleado;
import Entidades.Factura;
import Inicio.Login;
import Inicio.Menu;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class VentaRegistro extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentaRegistro
     */
    Empleado em = new Empleado();
    Factura fa = new Factura();
    FacturaJpaController Cfa = new FacturaJpaController();

    AgregarProducto CP = new AgregarProducto();
    ConsultaCliente CCL = new ConsultaCliente();

    String NumFactura;
    String CodigoVendedor, Fechaventa, Cliente, producto, subtotal, iva, total, nombres, apellidos;

    // 
    public VentaRegistro() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT-FACTURACIÓN");
        generarNumeroFactura();

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
        jButtonRegresar2 = new javax.swing.JButton();
        jBotonAñadirProducto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButtonRegresar3 = new javax.swing.JButton();
        txtNom = new java.awt.TextField();
        jTextFieldIDVendedorFactura = new javax.swing.JTextField();
        txtNom1 = new java.awt.TextField();
        txtNom2 = new java.awt.TextField();
        jBotonAñadirProducto1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setEnabled(false);
        setFocusable(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jButtonRegresar2.setText("Regresar");
        jButtonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar2ActionPerformed(evt);
            }
        });

        jBotonAñadirProducto.setText("Añadir producto");
        jBotonAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAñadirProductoActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "Marca", "Precio unitario", "Cantidad", "Precio total"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel41.setText("Productos:");

        jLabel40.setText("Cliente:");

        jLabel39.setText("Fecha de venta:");

        jTextField1.setEnabled(false);

        jLabel2.setText("Número Factura:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabelLogo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/GZlogohor3-01_200x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
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
        jLabel3.setText("FACTURA");

        jLabel42.setText("Código de vendedor");

        jLabel43.setText("Sub-Total:");

        jLabel44.setText("IVA");

        jLabel45.setText("TOTAL:");

        jButtonRegresar3.setText("Facturar");
        jButtonRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar3ActionPerformed(evt);
            }
        });

        txtNom.setEditable(false);
        txtNom.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNom.setPreferredSize(new java.awt.Dimension(250, 28));

        jTextFieldIDVendedorFactura.setEnabled(false);
        //jTextFieldIDVendedorFactura.setText(CodigoVendedor);

        txtNom1.setEditable(false);
        txtNom1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNom1.setPreferredSize(new java.awt.Dimension(250, 28));
        txtNom1.setText("12%");

        txtNom2.setEditable(false);
        txtNom2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNom2.setPreferredSize(new java.awt.Dimension(250, 28));

        jBotonAñadirProducto1.setText("Buscar");
        jBotonAñadirProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAñadirProducto1ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI", "Nombres", "Apellidos", "Teléfono", "Dirección"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jButton1.setText("Quitar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBotonAñadirProducto)
                                .addGap(54, 54, 54)
                                .addComponent(jButton1))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel43))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonRegresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(116, 116, 116)
                                    .addComponent(jButtonRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNom2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel39)
                                                        .addComponent(jLabel2))
                                                    .addGap(28, 28, 28)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(53, 53, 53)
                                                            .addComponent(jLabel42)))))
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldIDVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel40)
                                            .addGap(26, 26, 26)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBotonAñadirProducto1))
                                .addComponent(jLabel41)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel42)
                    .addComponent(jTextFieldIDVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBotonAñadirProducto1)
                            .addComponent(jLabel40))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotonAñadirProducto)
                            .addComponent(jButton1))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNom2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(txtNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRegresar2)
                            .addComponent(jButtonRegresar3))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresar2ActionPerformed

    private void jBotonAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAñadirProductoActionPerformed
        Menu.escritorio.add(CP);
        CP.setVisible(true);
        CP.toFront();

        //IC1.show();
        //IC1.setVisible(true);
        //    IC1.toFront();
        //  this.toBack();
    }//GEN-LAST:event_jBotonAñadirProductoActionPerformed

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        try {
            // TODO add your handling code here:
            obtenerdatosDatos();
            fa.setCicliente(Cliente);
            fa.setNumerofactura(NumFactura);
            fa.setCodigovendedor(CodigoVendedor);
            fa.setNombres(nombres);
            fa.setApellidos(apellidos);
            fa.setProducto(producto);
            fa.setSubtutal(subtotal);
            Date fecha = jDateChooser1.getDate();
            DateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            String fecha2 = f.format(fecha);
            fa.setFechaventa(fecha2);
            fa.setIva(iva);
            fa.setTotal(total);
            Cfa.create(fa);
            JOptionPane.showMessageDialog(null, "Factura registrada Corectamente");
        } catch (Exception ex) {
            Logger.getLogger(VentaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonRegresar3ActionPerformed
    public void obtenerdatosDatos() {
        NumFactura = jTextField1.getText();
        CodigoVendedor = jTextFieldIDVendedorFactura.getText();
        Cliente = obtenerClinete();
        nombres = obtenernombre();
        apellidos = obtenerapellidos();
        producto = obtenerproductos();
        subtotal = txtNom2.getText();
        iva = txtNom1.getText();
        total = txtNom.getText();

    }

    public String obtenerClinete() {
        String Cliente1 = null;
        for (int i = 0; i < jTable5.getRowCount(); i++) {

            Cliente1 = (String) jTable5.getValueAt(i, 0);

        }
        return Cliente1;
    }

    public String obtenernombre() {
        String Cliente1 = null;
        for (int i = 0; i < jTable5.getRowCount(); i++) {

            Cliente1 = (String) jTable5.getValueAt(i, 1);

        }
        return Cliente1;
    }

    public String obtenerapellidos() {
        String Cliente1 = null;
        for (int i = 0; i < jTable5.getRowCount(); i++) {

            Cliente1 = (String) jTable5.getValueAt(i, 2);

        }
        return Cliente1;
    }

    public String obtenerproductos() {
        String Producto = null;
        for (int i = 0; i < 1; i++) {

            Producto = (String) jTable4.getValueAt(i, 0);

        }
        return Producto;
    }

    public void generarNumeroFactura() {
        List<Factura> listfa = Cfa.findFacturaEntities();

        if (listfa.isEmpty()) {
            NumFactura = "1";
            jTextField1.setText(NumFactura);
        } else {
            for (int i = 0; i < listfa.size(); i++) {
                listfa.get(i).setNumerofactura(String.valueOf(i));
                jTextField1.setText(String.valueOf(i));
            }

        }

    }


    private void jBotonAñadirProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAñadirProducto1ActionPerformed
        ConsultaClienteVenta CCV = new ConsultaClienteVenta();
        Menu.escritorio.add(CCV);
        CCV.setVisible(true);
        CCV.toFront();


    }//GEN-LAST:event_jBotonAñadirProducto1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        calcularTotal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable4.getModel(); //TableProducto es el nombre de mi tabla ;)
        dtm.removeRow(jTable4.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    public void calcularTotal() {
        float suma = 0;
        for (int i = 0; i < jTable4.getRowCount(); i++) {
            suma += Float.parseFloat((String) jTable4.getValueAt(i, 5));
        }
        txtNom.setText(Float.toString(suma));
        suma = (float) (suma * 0.88);
        txtNom2.setText(Float.toString(suma));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonAñadirProducto;
    private javax.swing.JButton jBotonAñadirProducto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JButton jButtonRegresar3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTable jTable4;
    public static javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextFieldIDVendedorFactura;
    private java.awt.TextField txtNom;
    private java.awt.TextField txtNom1;
    private java.awt.TextField txtNom2;
    // End of variables declaration//GEN-END:variables
}
