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
@Table(name = "cable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cable.findAll", query = "SELECT c FROM Cable c")
    , @NamedQuery(name = "Cable.findByCodigo", query = "SELECT c FROM Cable c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Cable.findByModelo", query = "SELECT c FROM Cable c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Cable.findByMarca", query = "SELECT c FROM Cable c WHERE c.marca = :marca")
    , @NamedQuery(name = "Cable.findByLongitud", query = "SELECT c FROM Cable c WHERE c.longitud = :longitud")
    , @NamedQuery(name = "Cable.findByPrecioimportacion", query = "SELECT c FROM Cable c WHERE c.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Cable.findByPreciopublico", query = "SELECT c FROM Cable c WHERE c.preciopublico = :preciopublico")})
public class Cable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "longitud")
    private String longitud;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioimportacion")
    private BigDecimal precioimportacion;
    @Column(name = "preciopublico")
    private BigDecimal preciopublico;

    public Cable() {
    }

    public Cable(String codigo) {
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

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
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
        if (!(object instanceof Cable)) {
            return false;
        }
        Cable other = (Cable) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cable[ codigo=" + codigo + " ]";
    }
    
}
