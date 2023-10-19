package com.demo.firplak.persistence.dto;

public class PODDto {
	private Long id;
	private String tipoEvidencia;
	private String evidencia;
	private String observacion;
	private GuiaTransporteDto guia;
	
	
	public PODDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public PODDto(Long id, String tipoEvidencia, String evidencia, String observacion, GuiaTransporteDto guia) {
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
	public GuiaTransporteDto getGuiaId() {
		return guia;
	}
	public void setGuiaId(GuiaTransporteDto guiaId) {
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
