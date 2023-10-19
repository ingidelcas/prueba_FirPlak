package com.demo.firplak.persistence.dto;

import java.util.List;

import com.demo.firplak.persistence.entity.CancionEntity;

public class PlayListDto {
	private Long id;
	private String nombre;
	private String descripcion;
	private List<CancionDto> canciones;


	public PlayListDto() {
		super();
	}


	public PlayListDto(Long id, String nombre, String descripcion, List<CancionDto> canciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.canciones = canciones;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<CancionDto> getCanciones() {
		return canciones;
	}
	public void setCanciones(List<CancionDto> canciones) {
		this.canciones = canciones;
	}
}
