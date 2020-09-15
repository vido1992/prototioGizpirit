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
@Table(name = "tomacorriente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tomacorriente.findAll", query = "SELECT t FROM Tomacorriente t")
    , @NamedQuery(name = "Tomacorriente.findByCodigo", query = "SELECT t FROM Tomacorriente t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Tomacorriente.findByModelo", query = "SELECT t FROM Tomacorriente t WHERE t.modelo = :modelo")
    , @NamedQuery(name = "Tomacorriente.findByMarca", query = "SELECT t FROM Tomacorriente t WHERE t.marca = :marca")
    , @NamedQuery(name = "Tomacorriente.findByForma", query = "SELECT t FROM Tomacorriente t WHERE t.forma = :forma")
    , @NamedQuery(name = "Tomacorriente.findByTipo", query = "SELECT t FROM Tomacorriente t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "Tomacorriente.findByAnguloavertura", query = "SELECT t FROM Tomacorriente t WHERE t.anguloavertura = :anguloavertura")
    , @NamedQuery(name = "Tomacorriente.findByPrecioimportacion", query = "SELECT t FROM Tomacorriente t WHERE t.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Tomacorriente.findByPreciopublico", query = "SELECT t FROM Tomacorriente t WHERE t.preciopublico = :preciopublico")})
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
    @Column(name = "anguloavertura")
    private String anguloavertura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioimportacion")
    private BigDecimal precioimportacion;
    @Column(name = "preciopublico")
    private BigDecimal preciopublico;

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

    public String getAnguloavertura() {
        return anguloavertura;
    }

    public void setAnguloavertura(String anguloavertura) {
        this.anguloavertura = anguloavertura;
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
