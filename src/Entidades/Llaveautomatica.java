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
@Table(name = "llaveautomatica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Llaveautomatica.findAll", query = "SELECT l FROM Llaveautomatica l")
    , @NamedQuery(name = "Llaveautomatica.findByCodigo", query = "SELECT l FROM Llaveautomatica l WHERE l.codigo = :codigo")
    , @NamedQuery(name = "Llaveautomatica.findByModelo", query = "SELECT l FROM Llaveautomatica l WHERE l.modelo = :modelo")
    , @NamedQuery(name = "Llaveautomatica.findByMarca", query = "SELECT l FROM Llaveautomatica l WHERE l.marca = :marca")
    , @NamedQuery(name = "Llaveautomatica.findByPrecioimportacion", query = "SELECT l FROM Llaveautomatica l WHERE l.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Llaveautomatica.findByPreciopublico", query = "SELECT l FROM Llaveautomatica l WHERE l.preciopublico = :preciopublico")
    , @NamedQuery(name = "Llaveautomatica.findByFechaimportacion", query = "SELECT l FROM Llaveautomatica l WHERE l.fechaimportacion = :fechaimportacion")
    , @NamedQuery(name = "Llaveautomatica.findByCantidad", query = "SELECT l FROM Llaveautomatica l WHERE l.cantidad = :cantidad")
    , @NamedQuery(name = "Llaveautomatica.findByEstado", query = "SELECT l FROM Llaveautomatica l WHERE l.estado = :estado")})
public class Llaveautomatica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
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

    public Llaveautomatica() {
    }

    public Llaveautomatica(String codigo) {
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
        if (!(object instanceof Llaveautomatica)) {
            return false;
        }
        Llaveautomatica other = (Llaveautomatica) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Llaveautomatica[ codigo=" + codigo + " ]";
    }
    
}
