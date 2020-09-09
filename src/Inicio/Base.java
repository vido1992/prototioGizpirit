/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Base {
   // Registro_Cliente RC=new Registro_Cliente();
     //Scanner sc;
    public void crearArchivo(String a,String b,String c,String d,String e1,String f,String g,String h){
            
            File viajeTxt = new File("Clientes.txt");
                try {
                if (viajeTxt.createNewFile()) {
                    System.out.println("Se ha creado el archivo");
                }
                 } catch (IOException e) {
                System.out.println("No se creó el archivo");
                }
                try {

                BufferedWriter Escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(viajeTxt, true), "utf-8"));
                Escribir.write(a + "++");
                Escribir.write(b + "++");
                Escribir.write(c+ "++");
                Escribir.write(d + "++");
                Escribir.write(e1 + "++");
                Escribir.write(f+ "++");
                Escribir.write(g+ "++");
                Escribir.write(h+ "++{}\n");
                
               
                System.out.println("Datos ingresados");
                //JOptionPane.showMessageDialog(null,  "CLIENTE REGISTRADO en archivos"); 
                Escribir.close();
               
               // sc.close();
                
                
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
                     System.out.println("");                   
    }//crear archivo sin cantidad
                
     public void prepagoArchivo(String a,String b,String c,String d,String e1,String f,String g,String h,String i){
            
            File viajeTxt = new File("Clientes.txt");
                try {
                if (viajeTxt.createNewFile()) {
                    System.out.println("Se ha creado el archivo");
                }
                 } catch (IOException e) {
                System.out.println("No se creó el archivo");
                }
                try {

                BufferedWriter Escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(viajeTxt, true), "utf-8"));
                Escribir.write(a + "++");
                Escribir.write(b + "++");
                Escribir.write(c+ "++");
                Escribir.write(d + "++");
                Escribir.write(e1 + "++");
                Escribir.write(f+ "++");
                Escribir.write(g+ "++");
                Escribir.write(h+ "++");
                Escribir.write(i+ "++{}\n");
                
               
                System.out.println("Datos ingresados");
                //JOptionPane.showMessageDialog(null,  "CLIENTE REGISTRADO en archivos"); 
                Escribir.close();
               
               // sc.close();
                
                
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
                     System.out.println("");                   
    }//crear archivo sin cantidad
    
}//fin clase base
