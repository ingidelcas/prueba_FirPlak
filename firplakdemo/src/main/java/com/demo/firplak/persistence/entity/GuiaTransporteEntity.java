package com.demo.firplak.persistence.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "guia_transporte")
public class GuiaTransporteEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "fecha_despacho")
	private String fechaDespacho;
	@Column(name = "fecha_entrega")
	private String fechaEntrega;
	@Column(name = "transportadora")
	private String transportadora;
	@Column(name = "estado")
	private String estado;

	@OneToMany(mappedBy = "guia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<RemisionEntity> listRemisiones;
	
	@OneToMany(mappedBy = "guia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<PODEntity> listPOD;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(String fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<RemisionEntity> getListRemisiones() {
		return listRemisiones;
	}

	public void setListRemisiones(List<RemisionEntity> listRemisiones) {
		this.listRemisiones = listRemisiones;
	}

	public List<PODEntity> getListPOD() {
		return listPOD;
	}

	public void setListPOD(List<PODEntity> listPOD) {
		this.listPOD = listPOD;
	}
	
	
	
	
}
