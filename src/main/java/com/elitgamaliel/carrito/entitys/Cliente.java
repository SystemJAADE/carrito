package com.elitgamaliel.carrito.entitys;

import java.io.Serializable;
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

/**
 *
 * @author elitgamaliel
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
		@NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
		@NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre"),
		@NamedQuery(name = "Cliente.findByApellidos", query = "SELECT c FROM Cliente c WHERE c.apellidos = :apellidos"),
		@NamedQuery(name = "Cliente.findByDni", query = "SELECT c FROM Cliente c WHERE c.dni = :dni"),
		@NamedQuery(name = "Cliente.findByTelefono", query = "SELECT c FROM Cliente c WHERE c.telefono = :telefono"),
		@NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email") })
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_cliente")
	private Integer idCliente;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "dni")
	private String dni;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "email")
	private String email;
	@OneToMany(mappedBy = "idCliente", fetch = FetchType.LAZY)
	private List<Venta> ventaList;

	public Cliente() {
	}

	public Cliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlTransient
	public List<Venta> getVentaList() {
		return ventaList;
	}

	public void setVentaList(List<Venta> ventaList) {
		this.ventaList = ventaList;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", telefono=" + telefono + ", email=" + email + ", ventaList=" + ventaList + "]";
	}

}
