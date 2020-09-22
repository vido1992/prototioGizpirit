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
@Table(name = "factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByNumerofactura", query = "SELECT f FROM Factura f WHERE f.numerofactura = :numerofactura")
    , @NamedQuery(name = "Factura.findByCodigovendedor", query = "SELECT f FROM Factura f WHERE f.codigovendedor = :codigovendedor")
    , @NamedQuery(name = "Factura.findByFechaventa", query = "SELECT f FROM Factura f WHERE f.fechaventa = :fechaventa")
    , @NamedQuery(name = "Factura.findByCicliente", query = "SELECT f FROM Factura f WHERE f.cicliente = :cicliente")
    , @NamedQuery(name = "Factura.findByNombres", query = "SELECT f FROM Factura f WHERE f.nombres = :nombres")
    , @NamedQuery(name = "Factura.findByApellidos", query = "SELECT f FROM Factura f WHERE f.apellidos = :apellidos")
    , @NamedQuery(name = "Factura.findByProducto", query = "SELECT f FROM Factura f WHERE f.producto = :producto")
    , @NamedQuery(name = "Factura.findBySubtutal", query = "SELECT f FROM Factura f WHERE f.subtutal = :subtutal")
    , @NamedQuery(name = "Factura.findByIva", query = "SELECT f FROM Factura f WHERE f.iva = :iva")
    , @NamedQuery(name = "Factura.findByTotal", query = "SELECT f FROM Factura f WHERE f.total = :total")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numerofactura")
    private String numerofactura;
    @Column(name = "codigovendedor")
    private String codigovendedor;
    @Column(name = "fechaventa")
    private String fechaventa;
    @Column(name = "cicliente")
    private String cicliente;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "producto")
    private String producto;
    @Column(name = "subtutal")
    private String subtutal;
    @Column(name = "iva")
    private String iva;
    @Column(name = "total")
    private String total;

    public Factura() {
    }

    public Factura(String numerofactura) {
        this.numerofactura = numerofactura;
    }

    public String getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(String numerofactura) {
        this.numerofactura = numerofactura;
    }

    public String getCodigovendedor() {
        return codigovendedor;
    }

    public void setCodigovendedor(String codigovendedor) {
        this.codigovendedor = codigovendedor;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getCicliente() {
        return cicliente;
    }

    public void setCicliente(String cicliente) {
        this.cicliente = cicliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getSubtutal() {
        return subtutal;
    }

    public void setSubtutal(String subtutal) {
        this.subtutal = subtutal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerofactura != null ? numerofactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.numerofactura == null && other.numerofactura != null) || (this.numerofactura != null && !this.numerofactura.equals(other.numerofactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Factura[ numerofactura=" + numerofactura + " ]";
    }
    
}
