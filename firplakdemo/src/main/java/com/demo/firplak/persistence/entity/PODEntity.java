package com.demo.firplak.persistence.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "POD")
public class PODEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "tipo_evidencia")
	private String tipoEvidencia;
	@Column(name = "evidencia")
	private String evidencia;
	@Column(name = "observacion")
	private String observacion;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "guia_id")
	@JsonBackReference
	private GuiaTransporteEntity guia;
	
	public PODEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public PODEntity(Long id, String tipoEvidencia, String evidencia, String observacion, GuiaTransporteEntity guia) {
		super();
		this.id = id;
		this.tipoEvidencia = tipoEvidencia;
		this.evidencia = evidencia;
		this.observacion = observacion;
		this.guia = guia;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public GuiaTransporteEntity getGuia() {
		return guia;
	}
	public void setGuia(GuiaTransporteEntity guiaId) {
		this.guia = guiaId;
	}
	public String getTipoEvidencia() {
		return tipoEvidencia;
	}
	public void setTipoEvidencia(String tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}
	public String getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	

}
