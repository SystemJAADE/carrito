package com.elitgamaliel.carrito.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elitgamaliel
 */
@Entity
@Table(name = "detalle_venta")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "DetalleVenta.findAll", query = "SELECT d FROM DetalleVenta d"),
		@NamedQuery(name = "DetalleVenta.findByIdDetalleVenta", query = "SELECT d FROM DetalleVenta d WHERE d.idDetalleVenta = :idDetalleVenta") })
public class DetalleVenta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_detalle_venta")
	private Integer idDetalleVenta;
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	@ManyToOne(fetch = FetchType.LAZY)
	private Producto idProducto;
	@JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
	@ManyToOne(fetch = FetchType.LAZY)
	private Venta idVenta;

	public DetalleVenta() {
	}

	public DetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	public Venta getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Venta idVenta) {
		this.idVenta = idVenta;
	}

	@Override
	public String toString() {
		return "DetalleVenta [idDetalleVenta=" + idDetalleVenta + ", idProducto=" + idProducto + ", idVenta=" + idVenta
				+ "]";
	}

}
