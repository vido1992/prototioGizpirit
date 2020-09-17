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
@Table(name = "cargador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargador.findAll", query = "SELECT c FROM Cargador c")
    , @NamedQuery(name = "Cargador.findByCodigo", query = "SELECT c FROM Cargador c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Cargador.findByModelo", query = "SELECT c FROM Cargador c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Cargador.findByMarca", query = "SELECT c FROM Cargador c WHERE c.marca = :marca")
    , @NamedQuery(name = "Cargador.findByTipo", query = "SELECT c FROM Cargador c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Cargador.findByWattscarga", query = "SELECT c FROM Cargador c WHERE c.wattscarga = :wattscarga")
    , @NamedQuery(name = "Cargador.findByPrecioimportacion", query = "SELECT c FROM Cargador c WHERE c.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Cargador.findByPreciopublico", query = "SELECT c FROM Cargador c WHERE c.preciopublico = :preciopublico")
    , @NamedQuery(name = "Cargador.findByFechaimportacion", query = "SELECT c FROM Cargador c WHERE c.fechaimportacion = :fechaimportacion")
    , @NamedQuery(name = "Cargador.findByCantidad", query = "SELECT c FROM Cargador c WHERE c.cantidad = :cantidad")
    , @NamedQuery(name = "Cargador.findByEstado", query = "SELECT c FROM Cargador c WHERE c.estado = :estado")})
public class Cargador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "wattscarga")
    private String wattscarga;
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

    public Cargador() {
    }

    public Cargador(String codigo) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getWattscarga() {
        return wattscarga;
    }

    public void setWattscarga(String wattscarga) {
        this.wattscarga = wattscarga;
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
        if (!(object instanceof Cargador)) {
            return false;
        }
        Cargador other = (Cargador) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cargador[ codigo=" + codigo + " ]";
    }
    
}
