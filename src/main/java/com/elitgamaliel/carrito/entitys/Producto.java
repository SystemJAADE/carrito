package com.elitgamaliel.carrito.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author elitgamaliel
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
		@NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
		@NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre"),
		@NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio") })
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_producto")
	private Integer idProducto;
	@Column(name = "nombre")
	private String nombre;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "precio")
	private BigDecimal precio;
	@JsonIgnore
	@OneToMany(mappedBy = "idProducto", fetch = FetchType.LAZY)
	private List<DetalleVenta> detalleVentaList;

	public Producto() {
	}

	public Producto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@XmlTransient
	public List<DetalleVenta> getDetalleVentaList() {
		return detalleVentaList;
	}

	public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
		this.detalleVentaList = detalleVentaList;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio
				+ ", detalleVentaList=" + detalleVentaList + "]";
	}

}
