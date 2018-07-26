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
@Table(name = "detalle_venta", catalog = "medicamentos", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetalleVenta.findAll", query = "SELECT d FROM DetalleVenta d"),
    @NamedQuery(name = "DetalleVenta.findById", query = "SELECT d FROM DetalleVenta d WHERE d.id = :id"),
    @NamedQuery(name = "DetalleVenta.findByNumerodeventa", query = "SELECT d FROM DetalleVenta d WHERE d.numerodeventa = :numerodeventa"),
    @NamedQuery(name = "DetalleVenta.findByCodProducto", query = "SELECT d FROM DetalleVenta d WHERE d.codProducto = :codProducto"),
    @NamedQuery(name = "DetalleVenta.findByCantidad", query = "SELECT d FROM DetalleVenta d WHERE d.cantidad = :cantidad")})
public class DetalleVenta implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Numero_de_venta")
    private Integer numerodeventa;
    @Column(name = "cod_producto")
    private Integer codProducto;
    @Column(name = "Cantidad")
    private Integer cantidad;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Integer getNumerodeventa() {
        return numerodeventa;
    }

    public void setNumerodeventa(Integer numerodeventa) {
        Integer oldNumerodeventa = this.numerodeventa;
        this.numerodeventa = numerodeventa;
        changeSupport.firePropertyChange("numerodeventa", oldNumerodeventa, numerodeventa);
    }

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        Integer oldCodProducto = this.codProducto;
        this.codProducto = codProducto;
        changeSupport.firePropertyChange("codProducto", oldCodProducto, codProducto);
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Integer oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "venta.de.medicamentos.DetalleVenta[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
