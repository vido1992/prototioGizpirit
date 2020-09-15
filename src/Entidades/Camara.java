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
@Table(name = "camara")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camara.findAll", query = "SELECT c FROM Camara c")
    , @NamedQuery(name = "Camara.findByCodigo", query = "SELECT c FROM Camara c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Camara.findByModelo", query = "SELECT c FROM Camara c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Camara.findByMarca", query = "SELECT c FROM Camara c WHERE c.marca = :marca")
    , @NamedQuery(name = "Camara.findByResolucion", query = "SELECT c FROM Camara c WHERE c.resolucion = :resolucion")
    , @NamedQuery(name = "Camara.findByTipo", query = "SELECT c FROM Camara c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Camara.findByAnguloavertura", query = "SELECT c FROM Camara c WHERE c.anguloavertura = :anguloavertura")
    , @NamedQuery(name = "Camara.findByPrecioimportacion", query = "SELECT c FROM Camara c WHERE c.precioimportacion = :precioimportacion")
    , @NamedQuery(name = "Camara.findByPreciopublico", query = "SELECT c FROM Camara c WHERE c.preciopublico = :preciopublico")})
public class Camara implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "resolucion")
    private String resolucion;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "anguloavertura")
    private String anguloavertura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioimportacion")
    private BigDecimal precioimportacion;
    @Column(name = "preciopublico")
    private BigDecimal preciopublico;

    public Camara() {
    }

    public Camara(String codigo) {
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

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
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
        if (!(object instanceof Camara)) {
            return false;
        }
        Camara other = (Camara) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Camara[ codigo=" + codigo + " ]";
    }
    
}
