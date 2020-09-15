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
@Table(name = "audifonos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Audifonos.findAll", query = "SELECT a FROM Audifonos a")
    , @NamedQuery(name = "Audifonos.findByCodigo", query = "SELECT a FROM Audifonos a WHERE a.codigo = :codigo")
    , @NamedQuery(name = "Audifonos.findByModelo", query = "SELECT a FROM Audifonos a WHERE a.modelo = :modelo")
    , @NamedQuery(name = "Audifonos.findByMarca", query = "SELECT a FROM Audifonos a WHERE a.marca = :marca")
    , @NamedQuery(name = "Audifonos.findByTipo", query = "SELECT a FROM Audifonos a WHERE a.tipo = :tipo")
    , @NamedQuery(name = "Audifonos.findByPrecioimportacion", query = "SELECT a FROM Audifonos a WHERE a.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Audifonos.findByPreciopublico", query = "SELECT a FROM Audifonos a WHERE a.preciopublico = :preciopublico")})
public class Audifonos implements Serializable {

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
    @Column(name = "precioimportacion")
    private String precioimportacion;
    @Column(name = "preciopublico")
    private String preciopublico;

    public Audifonos() {
    }

    public Audifonos(String codigo) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audifonos)) {
            return false;
        }
        Audifonos other = (Audifonos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Audifonos[ codigo=" + codigo + " ]";
    }
    
}
