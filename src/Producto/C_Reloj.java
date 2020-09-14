/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author David
 */
public class C_Reloj extends  Producto{
    String Gama;
    String Sumergible, SistemaAndroid;

    public C_Reloj(String Gama, String Sumergible, String SistemaAndroid) {
        this.Gama = Gama;
        this.Sumergible = Sumergible;
        this.SistemaAndroid = SistemaAndroid;
    }

    public C_Reloj() {
    }

    public String getGama() {
        return Gama;
    }

    public String getSumergible() {
        return Sumergible;
    }

    public String getSistemaAndroid() {
        return SistemaAndroid;
    }

    public void setGama(String Gama) {
        this.Gama = Gama;
    }

    public void setSumergible(String Sumergible) {
        this.Sumergible = Sumergible;
    }

    public void setSistemaAndroid(String SistemaAndroid) {
        this.SistemaAndroid = SistemaAndroid;
    }

   
    
    
}
