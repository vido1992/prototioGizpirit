/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Validar {

    
    
    public Validar() {
    }
    
    
    
     public boolean validadorDeCedula(String cedula) {
       
        boolean cedulaCorrecta = false;

        try {

        if (cedula.length() == 10) // ConstantesApp.LongitudCedula
        {
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito < 6) {
        // Coeficientes de validación cédula
        // El decimo digito se lo considera dígito verificador
         int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
         int verificador = Integer.parseInt(cedula.substring(9,10));
         int suma = 0;
         int digito = 0;
        for (int i = 0; i < (cedula.length() - 1); i++) {
         digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
         suma += ((digito % 10) + (digito / 10));
        }

        if ((suma % 10 == 0) && (suma % 10 == verificador)) {
         cedulaCorrecta = true;
        }
        else if ((10 - (suma % 10)) == verificador) {
         cedulaCorrecta = true;
        } else {
         cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } catch (NumberFormatException nfe) {
        cedulaCorrecta = false;
        } catch (Exception err) {
        System.out.println("Una excepción ocurrido en el proceso de validación");

        cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {

        System.out.println("Número de ciudadanía incorrecto");
        JOptionPane.showMessageDialog(null,  "Número de cédula de ciudadanía incorrecto","CAMPO CC INCORRECTO", JOptionPane.WARNING_MESSAGE);  

        }
        return cedulaCorrecta;
    }//fin metodo validar cedula


     
     
     
    public boolean validarCC (String cedula)
    {
        int cantidad=cedula.length();
        if(cantidad==10)
        {
            if(this.validadorDeCedula(cedula))
            {

               
                System.out.println( "Cédula Correcta");  
                return true;
            }
        }  
        else
        {  
            this.validadorDeCedula(cedula);
            
        }
        return false;
    }//fin validarCC
     
    
    
    public  boolean validarTex(String caracter) {
    
        //System.out.println("Por favor ingrese solo letras");
        

       int contador=0;	
 //      String nombre="Angel Fernandes ";
	StringTokenizer tokens=new StringTokenizer(caracter);
	while(tokens.hasMoreTokens()){
            contador++;
            System.out.println(tokens.nextToken());
        }
        System.out.println("cantidad de token"+contador);
        if(contador==2)
        {
            System.out.println("ingresado correcto"+contador);

         
            if (caracter.matches("^[A-ZÑÁÉÍÓÚ ]*$")) {
            System.out.println("Informacion valida");
            System.out.println(caracter); 
            return true;
        } else {

            JOptionPane.showMessageDialog(null,  "Solo se aceptan letras, tildes y espacios, con un límite de 50 caracteres además de ser en mayúsculas"
            ,"CAMPO INCORRECTO", JOptionPane.WARNING_MESSAGE);  
            }
        }else {
            System.out.println("debe ingresar dos nombre o dos apellidos"+contador);

            JOptionPane.showMessageDialog(null,  "Se admite solo MAYÚSCULAS");  
           //return false;

        }
        return false;
    }//fin validar texto

     
    public  boolean validarDireccion(String caracter) {
    
        System.out.println("Por favor ingrese solo letras");
        
        if (caracter.matches("^[A-Z0-9-\\ ]*$")) {
            System.out.println("Información válida");
            System.out.println(caracter);
            return true;
         
        } else {
            System.out.println("Se admite solo MAYÚSCULAS");
            JOptionPane.showMessageDialog(null,  "Dirección no cumple con lo permitido, Solo se aceptan letras, tildes, espacios y en mayúsculas");  
            return false;
        }
       
    }//fin validar direccion
    
    
    
    
    
    
    public boolean validarCorreo(String email)
    {
 
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@" + "[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$");
 
        // El email a validar
      //  String email = "info@programacionextrema.com";
 
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
            return true;
        } else {
            System.out.println("Dirección de correo no cumple con el estándar RFC 822.");
            JOptionPane.showMessageDialog(null,  "Se admite solo minúsculas"); 
            return false;
        }
        
    }
    
    
    
    public boolean validarTelefonoC(String telefono)
    {
 
        System.out.println("El teléfono ingresado?.");
        Pattern pattern = Pattern.compile("^(09)[5-9]{1}[0-9]{7}$");
        Matcher mather = pattern.matcher(telefono);
 
        if (mather.find() == true) {
            System.out.println("El teléfono ingresado es válido.");
            return true;
        } else {
            System.out.println("El teléfono ingresado es inválido.");
            JOptionPane.showMessageDialog(null,  "Se admite solo números y un total de 10 dígitos "); 
            return false;
        }
        
    }
    
        public boolean validarPlaca(String placa)
        {
            System.out.println("PLACA INGRESADA?.");
            Pattern pattern = Pattern.compile("^[A-Z]{3}\\-[0-9]{4}$");
            Matcher mather = pattern.matcher(placa);

            if (mather.find() == true) {
                System.out.println("La placa es válida.");
                return true;
            } else {
                System.out.println("La placa es inválida.");
                JOptionPane.showMessageDialog(null,  "placa incorrecta, no cumple con el reglamento de la ANT"); 
                return false;
            }
            
        }
    

    
    
    
    
    
}//fin toda la clase
    
    
 
    

