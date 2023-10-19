package com.demo.firplak.persistence.dto;

import com.demo.firplak.persistence.entity.PlayListEntity;

public class CancionDto {

	private Long id;
	private String titulo;
	private String artista;
	private String album;
	private long anno;
	private GuiaTransporteDto list;
	public CancionDto(Long id, String titulo, String artista, String album, long anno, GuiaTransporteDto list) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.anno = anno;
		this.list = list;
	}
	public CancionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public long getAnno() {
		return anno;
	}
	public void setAnno(long anno) {
		this.anno = anno;
	}
	public GuiaTransporteDto getList() {
		return list;
	}
	public void setList(GuiaTransporteDto list) {
		this.list = list;
	}
	
	
}
