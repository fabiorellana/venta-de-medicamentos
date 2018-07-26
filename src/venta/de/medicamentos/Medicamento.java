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
@Table(name = "medicamento", catalog = "medicamentos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medicamento.findAll", query = "SELECT m FROM Medicamento m"),
    @NamedQuery(name = "Medicamento.findByCodigo", query = "SELECT m FROM Medicamento m WHERE m.codigo = :codigo"),
    @NamedQuery(name = "Medicamento.findByNombre", query = "SELECT m FROM Medicamento m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Medicamento.findByMarca", query = "SELECT m FROM Medicamento m WHERE m.marca = :marca"),
    @NamedQuery(name = "Medicamento.findByStock", query = "SELECT m FROM Medicamento m WHERE m.stock = :stock"),
    @NamedQuery(name = "Medicamento.findByStockMax", query = "SELECT m FROM Medicamento m WHERE m.stockMax = :stockMax"),
    @NamedQuery(name = "Medicamento.findByStockMin", query = "SELECT m FROM Medicamento m WHERE m.stockMin = :stockMin"),
    @NamedQuery(name = "Medicamento.findByValor", query = "SELECT m FROM Medicamento m WHERE m.valor = :valor")})
public class Medicamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "marca")
    private Integer marca;
    @Column(name = "Stock")
    private Integer stock;
    @Column(name = "Stock_Max")
    private Integer stockMax;
    @Column(name = "Stock_Min")
    private Integer stockMin;
    @Column(name = "valor")
    private Integer valor;

    public Medicamento() {
    }

    public Medicamento(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        Integer oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        Integer oldStock = this.stock;
        this.stock = stock;
        changeSupport.firePropertyChange("stock", oldStock, stock);
    }

    public Integer getStockMax() {
        return stockMax;
    }

    public void setStockMax(Integer stockMax) {
        Integer oldStockMax = this.stockMax;
        this.stockMax = stockMax;
        changeSupport.firePropertyChange("stockMax", oldStockMax, stockMax);
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        Integer oldStockMin = this.stockMin;
        this.stockMin = stockMin;
        changeSupport.firePropertyChange("stockMin", oldStockMin, stockMin);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        Integer oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
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
        if (!(object instanceof Medicamento)) {
            return false;
        }
        Medicamento other = (Medicamento) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "venta.de.medicamentos.Medicamento[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
