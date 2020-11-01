package com.elitgamaliel.carrito.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author elitgamaliel
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
		@NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta"),
		@NamedQuery(name = "Venta.findByFecha", query = "SELECT v FROM Venta v WHERE v.fecha = :fecha") })
public class Venta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_venta")
	private Integer idVenta;
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente idCliente;
	@JsonIgnore
	@OneToMany(mappedBy = "idVenta", fetch = FetchType.LAZY)
	private List<DetalleVenta> detalleVentaList;

	public Venta() {
	}

	public Venta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
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
		return "Venta [idVenta=" + idVenta + ", fecha=" + fecha + ", idCliente=" + idCliente + ", detalleVentaList="
				+ detalleVentaList + "]";
	}

}
