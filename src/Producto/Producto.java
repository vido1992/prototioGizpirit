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
public class Producto {
   String codigo;
   String marca;
   String modelo;
   float precioImportacion;
   float precioPublico;

    public Producto() {
    }

    public Producto(String codigo, String marca, String modelo, float precioImportacion, float precioPublico) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precioImportacion = precioImportacion;
        this.precioPublico = precioPublico;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecioImportacion() {
        return precioImportacion;
    }

    public float getPrecioPublico() {
        return precioPublico;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioImportacion(float precioImportacion) {
        this.precioImportacion = precioImportacion;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }
    
   
   
   
   
}//fin clase producto
