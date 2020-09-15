/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
    , @NamedQuery(name = "Llaveautomatica.findByPreciopublico", query = "SELECT l FROM Llaveautomatica l WHERE l.preciopublico = :preciopublico")})
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioimportacion")
    private BigDecimal precioimportacion;
    @Column(name = "preciopublico")
    private BigDecimal preciopublico;

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

    public BigDecimal getPrecioimportacion() {
        return precioimportacion;
    }

    public void setPrecioimportacion(BigDecimal precioimportacion) {
        this.precioimportacion = precioimportacion;
    }

    public BigDecimal getPreciopublico() {
        return preciopublico;
    }

    public void setPreciopublico(BigDecimal preciopublico) {
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