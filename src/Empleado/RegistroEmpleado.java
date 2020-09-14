/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Inicio.Base;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class RegistroEmpleado extends javax.swing.JInternalFrame {

    Validar validar= new Validar();
 Base base=new Base();
 public String CC,Nombre,Apellido,Direccion,Correo, Placa,TelefonoCelular,Cantidad,TipoCliente;
    public RegistroEmpleado() {
        initComponents();
        this.setTitle("Registro Empleado"); 
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
        jLabel2 = new javax.swing.JLabel();
        CCCRegistro = new javax.swing.JTextField();
        NombreClienteRegistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBotonRegistrar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        CorreoElectronico = new javax.swing.JTextField();
        TelefonoClienteRegistro = new javax.swing.JTextField();
        DireccionClienteRegistro = new javax.swing.JTextField();
        ApellidosClienteRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CorreoElectronico2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CorreoElectronico3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        setClosable(true);

        jLabel2.setText("Cédula de Identidad");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Dirección Domicilio");

        jLabel6.setText("Teléfono Celular");

        jLabel8.setText("Teléfono Convencional");

        jBotonRegistrar.setText("Registrar");
        jBotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabel9.setText("Rol Empleado: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("REGISTRO EMPLEADO");

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

        jLabel10.setText("Sueldo inicial:");

        jLabel11.setText("Correo electrónico");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Vendedor", "Administrador", "Bodeguero" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBotonRegistrar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CorreoElectronico2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TelefonoClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(DireccionClienteRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ApellidosClienteRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(NombreClienteRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CCCRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(CorreoElectronico3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jButtonRegresar)))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CCCRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ApellidosClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DireccionClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TelefonoClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CorreoElectronico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CorreoElectronico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrar)
                    .addComponent(jButtonRegresar))
                .addGap(25, 25, 25))
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
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarActionPerformed
        int i=0;
        //{}
        /* if(this.CCCRegistro.getText().equals("") || NombreClienteRegistro.getText().equals("") || this.ApellidosClienteRegistro.getText().equals("") ||
            this.DireccionClienteRegistro.getText().equals("") ||  this.CorreoElectronico.getText().equals("") || this.TelefonoClienteRegistro.equals("")
            || this.PlacaClienteRegistro.getText().equals("") ){
            JOptionPane.showMessageDialog(null,  "No se permite campos vacios","CAMPOS VACIO", JOptionPane.WARNING_MESSAGE);
        } */
        if(this.CCCRegistro.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,  "Campo obligatorio","CAMPO CI VACIO", JOptionPane.WARNING_MESSAGE);
        }else if( NombreClienteRegistro.getText().equals("") ){
            JOptionPane.showMessageDialog(null,  "Campo obligatorio","CAMPO NOMBRES VACIO", JOptionPane.WARNING_MESSAGE);
        }else if(this.ApellidosClienteRegistro.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,  "Campo obligatorio","CAMPO APELLIDOS VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.DireccionClienteRegistro.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,  "Campo obligatorio","CAMPO DIRECCION VACIO", JOptionPane.WARNING_MESSAGE);
        } else if( this.TelefonoClienteRegistro.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null,  "Campo obligatorio","CAMPO PLACA DEL VEHICULO VACIO", JOptionPane.WARNING_MESSAGE);
        }else
        {
            //System.out.println(this.CCCRegistro.getText().toString());
            if (validar.validarCI(this.CCCRegistro.getText().toString()))
            {
                //{}
                i++;
                this.CC=this.CCCRegistro.getText().toString();
                //System.out.println("cc: "+this.CCCRegistro.getText().toString() );
            }
            if(validar.validarTex(this.NombreClienteRegistro.getText().toString()))
            {
                i++;
                this.Nombre= this.NombreClienteRegistro.getText().toString();
                //System.out.println(this.NombreClienteRegistro.getText().toString());

            }

            if(validar.validarTex(this.ApellidosClienteRegistro.getText().toString()))
            {
                i++;
                this.Apellido=this.ApellidosClienteRegistro.getText().toString();
                //System.out.println(this.ApellidosClienteRegistro.getText().toString());
            }

            if(validar.validarDireccion(this.DireccionClienteRegistro.getText().toString()))
            {
                i++;
                this.Direccion=this.DireccionClienteRegistro.getText().toString();
                // System.out.println("aqui "+this.DireccionClienteRegistro.getText().toString());
            }
            if(validar.validarCorreo(this.CorreoElectronico.getText().toString()))
            {i++;
                this.Correo=this.CorreoElectronico.getText().toString();
                //System.out.println(this.CorreoElectronico.getText().toString());
            }
            if(validar.validarTelefonoC(this.TelefonoClienteRegistro.getText()))
            {i++;
                this.TelefonoCelular=this.TelefonoClienteRegistro.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }

        }
    }//GEN-LAST:event_jBotonRegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosClienteRegistro;
    private javax.swing.JTextField CCCRegistro;
    private javax.swing.JTextField CorreoElectronico;
    private javax.swing.JTextField CorreoElectronico2;
    private javax.swing.JTextField CorreoElectronico3;
    private javax.swing.JTextField DireccionClienteRegistro;
    private javax.swing.JTextField NombreClienteRegistro;
    private javax.swing.JTextField TelefonoClienteRegistro;
    private javax.swing.JButton jBotonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
