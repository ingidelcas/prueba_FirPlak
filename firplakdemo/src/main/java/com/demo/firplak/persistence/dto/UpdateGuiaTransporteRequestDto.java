package com.demo.firplak.persistence.dto;

import org.springframework.web.multipart.MultipartFile;

public class UpdateGuiaTransporteRequestDto {
	private Long guiaId;
	private String estado;
	private String tipoEvidencia;
	private MultipartFile evidencia;
	private String observacion;
	public Long getGuiaId() {
		return guiaId;
	}
	public void setGuiaId(Long guiaId) {
		this.guiaId = guiaId;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoEvidencia() {
		return tipoEvidencia;
	}
	public void setTipoEvidencia(String tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}
	public MultipartFile getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(MultipartFile evidencia) {
		this.evidencia = evidencia;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
	
	
	

}
