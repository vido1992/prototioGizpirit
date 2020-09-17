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
@Table(name = "controladorvoz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Controladorvoz.findAll", query = "SELECT c FROM Controladorvoz c")
    , @NamedQuery(name = "Controladorvoz.findByCodigo", query = "SELECT c FROM Controladorvoz c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Controladorvoz.findByModelo", query = "SELECT c FROM Controladorvoz c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Controladorvoz.findByMarca", query = "SELECT c FROM Controladorvoz c WHERE c.marca = :marca")
    , @NamedQuery(name = "Controladorvoz.findByTama\u00f1o", query = "SELECT c FROM Controladorvoz c WHERE c.tama\u00f1o = :tama\u00f1o")
    , @NamedQuery(name = "Controladorvoz.findByPrecioimportacion", query = "SELECT c FROM Controladorvoz c WHERE c.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Controladorvoz.findByPreciopublico", query = "SELECT c FROM Controladorvoz c WHERE c.preciopublico = :preciopublico")})
public class Controladorvoz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "tama\u00f1o")
    private String tamaño;
    @Column(name = "precioimportacion")
    private String precioimportacion;
    @Column(name = "preciopublico")
    private String preciopublico;

    public Controladorvoz() {
    }

    public Controladorvoz(String codigo) {
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
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
        if (!(object instanceof Controladorvoz)) {
            return false;
        }
        Controladorvoz other = (Controladorvoz) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Controladorvoz[ codigo=" + codigo + " ]";
    }
    
}
