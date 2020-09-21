/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admini
 */
@Entity
@Table(name = "tomacorriente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tomacorriente.findAll", query = "SELECT t FROM Tomacorriente t")
    , @NamedQuery(name = "Tomacorriente.findByCodigo", query = "SELECT t FROM Tomacorriente t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Tomacorriente.findByModelo", query = "SELECT t FROM Tomacorriente t WHERE t.modelo = :modelo")
    , @NamedQuery(name = "Tomacorriente.findByMarca", query = "SELECT t FROM Tomacorriente t WHERE t.marca = :marca")
    , @NamedQuery(name = "Tomacorriente.findByForma", query = "SELECT t FROM Tomacorriente t WHERE t.forma = :forma")
    , @NamedQuery(name = "Tomacorriente.findByTipo", query = "SELECT t FROM Tomacorriente t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "Tomacorriente.findByPrecioimportacion", query = "SELECT t FROM Tomacorriente t WHERE t.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Tomacorriente.findByPreciopublico", query = "SELECT t FROM Tomacorriente t WHERE t.preciopublico = :preciopublico")
    , @NamedQuery(name = "Tomacorriente.findByFechaimportacion", query = "SELECT t FROM Tomacorriente t WHERE t.fechaimportacion = :fechaimportacion")
    , @NamedQuery(name = "Tomacorriente.findByCantidad", query = "SELECT t FROM Tomacorriente t WHERE t.cantidad = :cantidad")
    , @NamedQuery(name = "Tomacorriente.findByEstado", query = "SELECT t FROM Tomacorriente t WHERE t.estado = :estado")})
public class Tomacorriente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "forma")
    private String forma;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "precioimportacion")
    private String precioimportacion;
    @Column(name = "preciopublico")
    private String preciopublico;
    @Column(name = "fechaimportacion")
    private String fechaimportacion;
    @Column(name = "cantidad")
    private String cantidad;
    @Column(name = "estado")
    private String estado;

    public Tomacorriente() {
    }

    public Tomacorriente(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecioimportacion() {
        return precioimportacion;
    }

    public void setPrecioimportacion(String precioimportacion) {
        this.precioimportacion = precioimportacion;
    }

    public String getPreciopublico() {
        return preciopublico;
    }

    public void setPreciopublico(String preciopublico) {
        this.preciopublico = preciopublico;
    }

    public String getFechaimportacion() {
        return fechaimportacion;
    }

    public void setFechaimportacion(String fechaimportacion) {
        this.fechaimportacion = fechaimportacion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tomacorriente)) {
            return false;
        }
        Tomacorriente other = (Tomacorriente) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tomacorriente[ codigo=" + codigo + " ]";
    }
    
}
