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
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByCedula", query = "SELECT e FROM Empleado e WHERE e.cedula = :cedula")
    , @NamedQuery(name = "Empleado.findByNombres", query = "SELECT e FROM Empleado e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Empleado.findByApellidos", query = "SELECT e FROM Empleado e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Empleado.findByDireciondomicilio", query = "SELECT e FROM Empleado e WHERE e.direciondomicilio = :direciondomicilio")
    , @NamedQuery(name = "Empleado.findByTelefonocelular", query = "SELECT e FROM Empleado e WHERE e.telefonocelular = :telefonocelular")
    , @NamedQuery(name = "Empleado.findByTelefonoconvencional", query = "SELECT e FROM Empleado e WHERE e.telefonoconvencional = :telefonoconvencional")
    , @NamedQuery(name = "Empleado.findByRolempleado", query = "SELECT e FROM Empleado e WHERE e.rolempleado = :rolempleado")
    , @NamedQuery(name = "Empleado.findBySueldo", query = "SELECT e FROM Empleado e WHERE e.sueldo = :sueldo")
    , @NamedQuery(name = "Empleado.findByEmail", query = "SELECT e FROM Empleado e WHERE e.email = :email")
    , @NamedQuery(name = "Empleado.findByContrase\u00f1a", query = "SELECT e FROM Empleado e WHERE e.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "Empleado.findByEstado", query = "SELECT e FROM Empleado e WHERE e.estado = :estado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "direciondomicilio")
    private String direciondomicilio;
    @Column(name = "telefonocelular")
    private String telefonocelular;
    @Column(name = "telefonoconvencional")
    private String telefonoconvencional;
    @Column(name = "rolempleado")
    private String rolempleado;
    @Column(name = "sueldo")
    private String sueldo;
    @Column(name = "email")
    private String email;
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Column(name = "estado")
    private String estado;

    public Empleado() {
    }

    public Empleado(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getDireciondomicilio() {
        return direciondomicilio;
    }

    public void setDireciondomicilio(String direciondomicilio) {
        this.direciondomicilio = direciondomicilio;
    }

    public String getTelefonocelular() {
        return telefonocelular;
    }

    public void setTelefonocelular(String telefonocelular) {
        this.telefonocelular = telefonocelular;
    }

    public String getTelefonoconvencional() {
        return telefonoconvencional;
    }

    public void setTelefonoconvencional(String telefonoconvencional) {
        this.telefonoconvencional = telefonoconvencional;
    }

    public String getRolempleado() {
        return rolempleado;
    }

    public void setRolempleado(String rolempleado) {
        this.rolempleado = rolempleado;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Empleado[ cedula=" + cedula + " ]";
    }
    
}
