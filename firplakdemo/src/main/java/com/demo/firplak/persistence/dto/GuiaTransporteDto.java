package com.demo.firplak.persistence.dto;

import java.util.List;

public class GuiaTransporteDto {
	private Long id;

	private String fechaDespacho;
	private String fechaEntrega;
	private String transportadora;
	private String estado;

	private List<RemisionDto> listRemisiones;
	
	

	public GuiaTransporteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public GuiaTransporteDto(Long id, String fechaDespacho, String fechaEntrega, String transportadora, String estado,
			List<RemisionDto> listRemisiones) {
		super();
		this.id = id;
		this.fechaDespacho = fechaDespacho;
		this.fechaEntrega = fechaEntrega;
		this.transportadora = transportadora;
		this.estado = estado;
		this.listRemisiones = listRemisiones;
	}



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

	public List<RemisionDto> getListRemisiones() {
		return listRemisiones;
	}

	public void setListRemisiones(List<RemisionDto> listRemisiones) {
		this.listRemisiones = listRemisiones;
	}
}
