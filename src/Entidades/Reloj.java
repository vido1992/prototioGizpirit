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
@Table(name = "reloj")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reloj.findAll", query = "SELECT r FROM Reloj r")
    , @NamedQuery(name = "Reloj.findByCodigo", query = "SELECT r FROM Reloj r WHERE r.codigo = :codigo")
    , @NamedQuery(name = "Reloj.findByModelo", query = "SELECT r FROM Reloj r WHERE r.modelo = :modelo")
    , @NamedQuery(name = "Reloj.findByMarca", query = "SELECT r FROM Reloj r WHERE r.marca = :marca")
    , @NamedQuery(name = "Reloj.findByGama", query = "SELECT r FROM Reloj r WHERE r.gama = :gama")
    , @NamedQuery(name = "Reloj.findBySumergible", query = "SELECT r FROM Reloj r WHERE r.sumergible = :sumergible")
    , @NamedQuery(name = "Reloj.findBySistemaandroid", query = "SELECT r FROM Reloj r WHERE r.sistemaandroid = :sistemaandroid")
    , @NamedQuery(name = "Reloj.findByPrecioimportacion", query = "SELECT r FROM Reloj r WHERE r.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Reloj.findByPreciopublico", query = "SELECT r FROM Reloj r WHERE r.preciopublico = :preciopublico")
    , @NamedQuery(name = "Reloj.findByFechaimportacion", query = "SELECT r FROM Reloj r WHERE r.fechaimportacion = :fechaimportacion")
    , @NamedQuery(name = "Reloj.findByCantidad", query = "SELECT r FROM Reloj r WHERE r.cantidad = :cantidad")
    , @NamedQuery(name = "Reloj.findByEstado", query = "SELECT r FROM Reloj r WHERE r.estado = :estado")})
public class Reloj implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "gama")
    private String gama;
    @Column(name = "sumergible")
    private String sumergible;
    @Column(name = "sistemaandroid")
    private String sistemaandroid;
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

    public Reloj() {
    }

    public Reloj(String codigo) {
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

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getSumergible() {
        return sumergible;
    }

    public void setSumergible(String sumergible) {
        this.sumergible = sumergible;
    }

    public String getSistemaandroid() {
        return sistemaandroid;
    }

    public void setSistemaandroid(String sistemaandroid) {
        this.sistemaandroid = sistemaandroid;
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
        if (!(object instanceof Reloj)) {
            return false;
        }
        Reloj other = (Reloj) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Reloj[ codigo=" + codigo + " ]";
    }
    
}
