/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package venta.de.medicamentos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "ventas", catalog = "medicamentos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v"),
    @NamedQuery(name = "Ventas.findByNumerodeventa", query = "SELECT v FROM Ventas v WHERE v.numerodeventa = :numerodeventa"),
    @NamedQuery(name = "Ventas.findByFecha", query = "SELECT v FROM Ventas v WHERE v.fecha = :fecha"),
    @NamedQuery(name = "Ventas.findByTotal", query = "SELECT v FROM Ventas v WHERE v.total = :total"),
    @NamedQuery(name = "Ventas.findByCodEmpleado", query = "SELECT v FROM Ventas v WHERE v.codEmpleado = :codEmpleado"),
    @NamedQuery(name = "Ventas.findByReceta", query = "SELECT v FROM Ventas v WHERE v.receta = :receta")})
public class Ventas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Numero_de_venta")
    private Integer numerodeventa;
    @Column(name = "Fecha")
    private String fecha;
    @Column(name = "Total")
    private Integer total;
    @Column(name = "cod_empleado")
    private Integer codEmpleado;
    @Column(name = "Receta")
    private Integer receta;

    public Ventas() {
    }

    public Ventas(Integer numerodeventa) {
        this.numerodeventa = numerodeventa;
    }

    public Integer getNumerodeventa() {
        return numerodeventa;
    }

    public void setNumerodeventa(Integer numerodeventa) {
        Integer oldNumerodeventa = this.numerodeventa;
        this.numerodeventa = numerodeventa;
        changeSupport.firePropertyChange("numerodeventa", oldNumerodeventa, numerodeventa);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        Integer oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Integer getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(Integer codEmpleado) {
        Integer oldCodEmpleado = this.codEmpleado;
        this.codEmpleado = codEmpleado;
        changeSupport.firePropertyChange("codEmpleado", oldCodEmpleado, codEmpleado);
    }

    public Integer getReceta() {
        return receta;
    }

    public void setReceta(Integer receta) {
        Integer oldReceta = this.receta;
        this.receta = receta;
        changeSupport.firePropertyChange("receta", oldReceta, receta);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerodeventa != null ? numerodeventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.numerodeventa == null && other.numerodeventa != null) || (this.numerodeventa != null && !this.numerodeventa.equals(other.numerodeventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "venta.de.medicamentos.Ventas[ numerodeventa=" + numerodeventa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
