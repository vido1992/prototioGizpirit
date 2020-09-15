/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Controladores.ClienteJpaController;
import Entidades.Cliente;
import Inicio.Base;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Validar;

/**
 *
 * @author David
 */
public class ActualizarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActualizarCliente
     */
    Validar validar = new Validar();
    String datos[] = new String[9];
    LinkedList<String[]> clientes = new LinkedList<>();
    String nuevo[] = new String[9];
    Base base = new Base();
    ClienteJpaController Ccliente = new ClienteJpaController();
    Cliente cAct = new Cliente();
    
    public ActualizarCliente() {
        initComponents();
        this.setTitle("Actualizo Cliente");
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
        jPanelActualizarCli = new javax.swing.JPanel();
        txtactualizarClienteCi = new javax.swing.JTextField();
        txtCorreoActualizarCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDireccionDomicilioActualizarCliente = new javax.swing.JTextField();
        txtTelefonoCeluActualizarCliente = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTelefonoConvencionalActualizarCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtActualizarClienteActivo = new javax.swing.JRadioButton();
        txtActualizarClienteInactivo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ApellidosActualizarCliente = new javax.swing.JTextField();
        nombreActualizarCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CIActualizarCliente = new javax.swing.JTextField();

        setClosable(true);

        txtactualizarClienteCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactualizarClienteCiActionPerformed(evt);
            }
        });

        jLabel13.setText("Correo electrónico");

        jLabel14.setText("Dirección de Domicilio");

        jLabel15.setText("Teléfono celular");

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de cédula de identidad: ");

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ACTUALIZACIÓN CLIENTE");

        jLabel16.setText("Teléfono convencional");

        txtTelefonoConvencionalActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoConvencionalActualizarClienteActionPerformed(evt);
            }
        });

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

        jLabel17.setText("Estado Cliente");

        buttonGroup1.add(txtActualizarClienteActivo);
        txtActualizarClienteActivo.setText("Activo");
        txtActualizarClienteActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarClienteActivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(txtActualizarClienteInactivo);
        txtActualizarClienteInactivo.setText("Inactivo");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        ApellidosActualizarCliente.setEnabled(false);

        nombreActualizarCliente.setEnabled(false);

        jLabel5.setText("Cédula de Identidad");

        CIActualizarCliente.setEnabled(false);

        javax.swing.GroupLayout jPanelActualizarCliLayout = new javax.swing.GroupLayout(jPanelActualizarCli);
        jPanelActualizarCli.setLayout(jPanelActualizarCliLayout);
        jPanelActualizarCliLayout.setHorizontalGroup(
            jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(txtactualizarClienteCi)
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4))
                        .addGap(57, 57, 57)
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreActualizarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(CIActualizarCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApellidosActualizarCliente)))
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(txtActualizarClienteActivo)
                                .addGap(26, 26, 26)
                                .addComponent(txtActualizarClienteInactivo))
                            .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefonoCeluActualizarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtDireccionDomicilioActualizarCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreoActualizarCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoConvencionalActualizarCliente))))))
                .addGap(108, 108, 108))
            .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton4)
                        .addGap(100, 100, 100)
                        .addComponent(jButtonRegresar))
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jButton5)))
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelActualizarCliLayout.setVerticalGroup(
            jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtactualizarClienteCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CIActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ApellidosActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCorreoActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDireccionDomicilioActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefonoCeluActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTelefonoConvencionalActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtActualizarClienteActivo)
                    .addComponent(txtActualizarClienteInactivo))
                .addGap(27, 27, 27)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButtonRegresar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelActualizarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelActualizarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private String[] buscar(String cedula, String tipoCliente) throws FileNotFoundException, IOException {
        int contador;
        File archivo = new File("Clientes.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String contenido = br.readLine();
        do {
            clientes.add(generarVector(contenido));
            contenido = br.readLine();
        } while (contenido != null);
        String[] actual = new String[10];
        for (int i = 0; i < clientes.size(); i++) {
            actual = clientes.get(i);
            System.out.println(actual[0] + " " + actual[1]);
            if (actual[0].equals(cedula) && actual[1].equals(tipoCliente)) {
                return actual;
            }
        }
        return null;
    }
    
    public void removeLineFromFile(String lineToRemove) throws FileNotFoundException, IOException {
        
        File inputFile = new File("Clientes.txt");
        File tempFile = new File("myTempFile.txt");
        
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
        String currentLine;
        
        while ((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if (trimmedLine.equals(lineToRemove)) {
                System.out.println(trimmedLine);
                System.out.println(lineToRemove);
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        
        inputFile = new File("myTempFile.txt");
        tempFile = new File("Clientes.txt");
        
        reader = new BufferedReader(new FileReader(inputFile));
        writer = new BufferedWriter(new FileWriter(tempFile));
        
        while ((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        
    }
    
    private String[] generarVector(String contenido) {
        int contador = 0;
        String[] datos = new String[10];
        StringTokenizer r1 = new StringTokenizer(contenido, "++");
        while (r1.hasMoreTokens()) {
            datos[contador] = r1.nextToken();
            System.out.println(datos[contador]);
            contador++;
        }
        return datos;
    }
    private void txtactualizarClienteCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactualizarClienteCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactualizarClienteCiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int i = 0;
        if (this.txtactualizarClienteCi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CI VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (txtCorreoActualizarCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CORREO ELECTRÓNICO", JOptionPane.WARNING_MESSAGE);
        } else if (txtDireccionDomicilioActualizarCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO DIRECCIÓN", JOptionPane.WARNING_MESSAGE);
        } else if (txtTelefonoCeluActualizarCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtTelefonoConvencionalActualizarCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CONVENCIONAL", JOptionPane.WARNING_MESSAGE);
        } else {
            if (validar.validarCorreo(txtCorreoActualizarCliente.getText())) {
                i++;
            }
            if (validar.validarDireccion(txtDireccionDomicilioActualizarCliente.getText())) {
                i++;
            }
            if (validar.validarTelefonoC(txtTelefonoCeluActualizarCliente.getText())) {
                i++;
            }
            if (validar.validarTelefonoConvencional(this.txtTelefonoConvencionalActualizarCliente.getText())) {
                i++;
            }
            if (this.txtActualizarClienteActivo.isSelected() == true) {
                i++;
            } else if (this.txtActualizarClienteInactivo.isSelected() == true) {
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO ESTADO CLIENTE ", JOptionPane.WARNING_MESSAGE);
            }
            if (i == 5) {
                try {
                    cAct.setCedula(CIActualizarCliente.getText());
                    cAct.setNombres(nombreActualizarCliente.getText());
                    cAct.setApellidos(ApellidosActualizarCliente.getText());
                    cAct.setEmail(txtCorreoActualizarCliente.getText());
                    cAct.setDireciondomicilio(txtDireccionDomicilioActualizarCliente.getText());
                    cAct.setTelefonocelular(txtTelefonoCeluActualizarCliente.getText());
                    cAct.setTelefonoconvencional(txtTelefonoConvencionalActualizarCliente.getText());
                    if (txtActualizarClienteActivo.isSelected()) {
                        cAct.setEstado(txtActualizarClienteActivo.getText());
                    } else if (txtActualizarClienteInactivo.isSelected()) {
                        cAct.setEstado(txtActualizarClienteInactivo.getText());
                    }
                    Ccliente.edit(cAct);
                    JOptionPane.showMessageDialog(null, "Empleado Actualizado");
                } catch (Exception ex) {
                    Logger.getLogger(ActualizarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        List<Cliente> listC = Ccliente.findClienteEntities();
        for (int i = 0; i < listC.size(); i++) {
            if (txtactualizarClienteCi.getText().equals(listC.get(i).getCedula())) {
                CIActualizarCliente.setText(listC.get(i).getCedula());
                nombreActualizarCliente.setText(listC.get(i).getNombres());
                ApellidosActualizarCliente.setText(listC.get(i).getApellidos());
                txtCorreoActualizarCliente.setText(listC.get(i).getEmail());
                txtDireccionDomicilioActualizarCliente.setText(listC.get(i).getDireciondomicilio());
                txtTelefonoCeluActualizarCliente.setText(listC.get(i).getTelefonocelular());
                txtTelefonoConvencionalActualizarCliente.setText(listC.get(i).getTelefonoconvencional());
                if(listC.get(i).getEstado().equals(null)){
                    txtActualizarClienteActivo.setSelected(false);
                    txtActualizarClienteInactivo.setSelected(false);
                }else if (listC.get(i).getEstado().equals("Activo")) {
                    txtActualizarClienteActivo.setSelected(true);
                } else if (listC.get(i).getEstado().equals("Inactivo")) {
                    txtActualizarClienteInactivo.setSelected(true);
                }
                
            }
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void txtActualizarClienteActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarClienteActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarClienteActivoActionPerformed

    private void txtTelefonoConvencionalActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoConvencionalActualizarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoConvencionalActualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosActualizarCliente;
    private javax.swing.JTextField CIActualizarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelActualizarCli;
    private javax.swing.JTextField nombreActualizarCliente;
    private javax.swing.JRadioButton txtActualizarClienteActivo;
    private javax.swing.JRadioButton txtActualizarClienteInactivo;
    private javax.swing.JTextField txtCorreoActualizarCliente;
    private javax.swing.JTextField txtDireccionDomicilioActualizarCliente;
    private javax.swing.JTextField txtTelefonoCeluActualizarCliente;
    private javax.swing.JTextField txtTelefonoConvencionalActualizarCliente;
    private javax.swing.JTextField txtactualizarClienteCi;
    // End of variables declaration//GEN-END:variables
}
