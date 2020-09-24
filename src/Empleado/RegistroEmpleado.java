/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Controladores.EmpleadoJpaController;
import Entidades.Empleado;
import Inicio.Base;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class RegistroEmpleado extends javax.swing.JInternalFrame {

    Validar validar = new Validar();
    Base base = new Base();
    EmpleadoJpaController Cemp = new EmpleadoJpaController();
    public String CC, Nombre, Apellido, Direccion, Correo, sueldo, TelefonoCelular, telefonoConvencional;

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
        CIRegistroEmpleado = new javax.swing.JTextField();
        nombreRegistroEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBotonRegistrar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        telefonoConvencionaEmpleadoRegistro = new javax.swing.JTextField();
        telefonocelularEmpleadoRegistro = new javax.swing.JTextField();
        DireccionClienteEmpleado = new javax.swing.JTextField();
        ApellidosEmpleadoRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sueldoRegistroEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CorreoElectronicoRegistroEmpleado = new javax.swing.JTextField();
        cbRolEmpleadoRegistro = new javax.swing.JComboBox();
        btnAyudaSueldo = new javax.swing.JButton();
        btnAyudaNombre = new javax.swing.JButton();
        btnAyudaApellido = new javax.swing.JButton();

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

        telefonocelularEmpleadoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonocelularEmpleadoRegistroActionPerformed(evt);
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

        cbRolEmpleadoRegistro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Vendedor", "Administrador", "Bodeguero" }));

        btnAyudaSueldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaSueldoActionPerformed(evt);
            }
        });

        btnAyudaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaNombreActionPerformed(evt);
            }
        });

        btnAyudaApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/2.png"))); // NOI18N
        btnAyudaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DireccionClienteEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ApellidosEmpleadoRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreRegistroEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CIRegistroEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAyudaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sueldoRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(telefonocelularEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonoConvencionaEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbRolEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CorreoElectronicoRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jBotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButtonRegresar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(CIRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombreRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(btnAyudaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ApellidosEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAyudaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DireccionClienteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefonocelularEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telefonoConvencionaEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbRolEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(sueldoRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAyudaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CorreoElectronicoRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        int i = 0;

        if (this.CIRegistroEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CI VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (nombreRegistroEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO NOMBRES VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.ApellidosEmpleadoRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO APELLIDOS VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.DireccionClienteEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO DIRECCION VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.telefonocelularEmpleadoRegistro.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CELULAR VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.telefonoConvencionaEmpleadoRegistro.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CONVENCIONAL VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.sueldoRegistroEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO SUELDO INICIAL VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.CorreoElectronicoRegistroEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CORREO ELECTRÓNICO VACÍO", JOptionPane.WARNING_MESSAGE);
        } else {
            //System.out.println(this.CCCRegistro.getText().toString());
            if (validar.validarCI(this.CIRegistroEmpleado.getText().toString())) {
                i++;
                this.CC = this.CIRegistroEmpleado.getText().toString();
                //System.out.println("cc: "+this.CCCRegistro.getText().toString() );
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar la cédula del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.CIRegistroEmpleado.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }
            if (validar.validarTex(this.nombreRegistroEmpleado.getText().toString())) {
                i++;
                this.Nombre = this.nombreRegistroEmpleado.getText().toString();
                //System.out.println(this.NombreClienteRegistro.getText().toString());

            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar los nombres del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.nombreRegistroEmpleado.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }

            if (validar.validarTex(this.ApellidosEmpleadoRegistro.getText().toString())) {
                i++;
                this.Apellido = this.ApellidosEmpleadoRegistro.getText().toString();
                //System.out.println(this.ApellidosClienteRegistro.getText().toString());
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar los apellidos del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.ApellidosEmpleadoRegistro.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }

            if (validar.validarDireccion(this.DireccionClienteEmpleado.getText().toString())) {
                i++;
                this.Direccion = this.DireccionClienteEmpleado.getText().toString();
                // System.out.println("aqui "+this.DireccionClienteRegistro.getText().toString());
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar la Dirección de Domicilio del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.DireccionClienteEmpleado.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }
            if (validar.validarCorreo(this.CorreoElectronicoRegistroEmpleado.getText().toString())) {
                i++;
                this.Correo = this.CorreoElectronicoRegistroEmpleado.getText().toString();
                //System.out.println(this.CorreoElectronico.getText().toString());
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el correo electrónico del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.CorreoElectronicoRegistroEmpleado.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }
            if (validar.validarTelefonoC(this.telefonocelularEmpleadoRegistro.getText().toString())) {
                i++;
                this.TelefonoCelular = this.telefonocelularEmpleadoRegistro.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el teléfono celular del empleado ?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.telefonocelularEmpleadoRegistro.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }
            if (validar.validarTelefonoConvencional(this.telefonoConvencionaEmpleadoRegistro.getText().toString())) {
                i++;
                this.telefonoConvencional = this.telefonoConvencionaEmpleadoRegistro.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar  el teléfono convencional del empleado ?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.telefonoConvencionaEmpleadoRegistro.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }
            if (validar.validarSueldo(this.sueldoRegistroEmpleado.getText().toString())) {
                i++;
                this.sueldo = this.sueldoRegistroEmpleado.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }else {
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el sueldo inicial del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION) {
                    this.sueldoRegistroEmpleado.setText(""); 
                    }else {
                        JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);    
                            dispose(); 
                    }
               
            }
            if (this.cbRolEmpleadoRegistro.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso");
                // System.out.println(this.TelefonoClienteRegistro.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en Rol Empleado");
            }

            JOptionPane.showMessageDialog(null, "contador" + i);

            if (i == 9) {

                try {
                    Empleado emp = new Empleado();

                    emp.setCedula(CC);
                    emp.setNombres(Nombre);
                    emp.setApellidos(Apellido);
                    emp.setDireciondomicilio(Direccion);
                    emp.setTelefonocelular(TelefonoCelular);
                    emp.setTelefonoconvencional(telefonoConvencional);
                    emp.setRolempleado((String) cbRolEmpleadoRegistro.getSelectedItem());
                    emp.setSueldo(sueldo);
                    emp.setEmail(Correo);
                    emp.setEstado("Activo");
                    if (cbRolEmpleadoRegistro.getSelectedItem().toString().equals("Vendedor")) {
                        emp.setContraseña("123");
                    } else if (cbRolEmpleadoRegistro.getSelectedItem().toString().equals("Administrador")) {
                        emp.setContraseña("1234");
                    } else if (cbRolEmpleadoRegistro.getSelectedItem().toString().equals("Bodeguero")) {
                        emp.setContraseña("123");
                    }
                    Cemp.create(emp);
                    JOptionPane.showMessageDialog(null, "Empleado Registrado");
                } catch (Exception ex) {
                    Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }//GEN-LAST:event_jBotonRegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void telefonocelularEmpleadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonocelularEmpleadoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonocelularEmpleadoRegistroActionPerformed

    private void btnAyudaSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaSueldoActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");

    }//GEN-LAST:event_btnAyudaSueldoActionPerformed

    private void btnAyudaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaNombreActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar Dos Nombres en MAYUSCULAS");
    }//GEN-LAST:event_btnAyudaNombreActionPerformed

    private void btnAyudaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaApellidoActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar Dos Apellidos en MAYUSCULAS");
    }//GEN-LAST:event_btnAyudaApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosEmpleadoRegistro;
    private javax.swing.JTextField CIRegistroEmpleado;
    private javax.swing.JTextField CorreoElectronicoRegistroEmpleado;
    private javax.swing.JTextField DireccionClienteEmpleado;
    private javax.swing.JButton btnAyudaApellido;
    private javax.swing.JButton btnAyudaNombre;
    private javax.swing.JButton btnAyudaSueldo;
    private javax.swing.JComboBox cbRolEmpleadoRegistro;
    private javax.swing.JButton jBotonRegistrar;
    private javax.swing.JButton jButtonRegresar;
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
    private javax.swing.JTextField nombreRegistroEmpleado;
    private javax.swing.JTextField sueldoRegistroEmpleado;
    private javax.swing.JTextField telefonoConvencionaEmpleadoRegistro;
    private javax.swing.JTextField telefonocelularEmpleadoRegistro;
    // End of variables declaration//GEN-END:variables
}
