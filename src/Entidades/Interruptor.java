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
@Table(name = "interruptor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interruptor.findAll", query = "SELECT i FROM Interruptor i")
    , @NamedQuery(name = "Interruptor.findByCodigo", query = "SELECT i FROM Interruptor i WHERE i.codigo = :codigo")
    , @NamedQuery(name = "Interruptor.findByModelo", query = "SELECT i FROM Interruptor i WHERE i.modelo = :modelo")
    , @NamedQuery(name = "Interruptor.findByMarca", query = "SELECT i FROM Interruptor i WHERE i.marca = :marca")
    , @NamedQuery(name = "Interruptor.findByNumerobotones", query = "SELECT i FROM Interruptor i WHERE i.numerobotones = :numerobotones")
    , @NamedQuery(name = "Interruptor.findByTipo", query = "SELECT i FROM Interruptor i WHERE i.tipo = :tipo")
    , @NamedQuery(name = "Interruptor.findByPrecioimportacion", query = "SELECT i FROM Interruptor i WHERE i.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Interruptor.findByPreciopublico", query = "SELECT i FROM Interruptor i WHERE i.preciopublico = :preciopublico")})
public class Interruptor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "numerobotones")
    private String numerobotones;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "precioimportacion")
    private String precioimportacion;
    @Column(name = "preciopublico")
    private String preciopublico;

    public Interruptor() {
    }

    public Interruptor(String codigo) {
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

    public String getNumerobotones() {
        return numerobotones;
    }

    public void setNumerobotones(String numerobotones) {
        this.numerobotones = numerobotones;
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
        if (!(object instanceof Interruptor)) {
            return false;
        }
        Interruptor other = (Interruptor) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Interruptor[ codigo=" + codigo + " ]";
    }
    
}
