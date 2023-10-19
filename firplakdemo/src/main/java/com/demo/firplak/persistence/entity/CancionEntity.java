package com.demo.firplak.persistence.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name="cancion")
public class CancionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "artista")
	private String artista;
	@Column(name = "album")
	private String album;
	@Column(name = "anno")
	private long anno;
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "list_id")
	@JsonBackReference
	private PlayListEntity list;

	public CancionEntity() {
		super();
	}

	public CancionEntity(Long id, String titulo, String artista, String album, long anno, PlayListEntity list) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.anno = anno;
		this.list = list;
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
	public PlayListEntity getList() {
		return list;
	}
	public void setList(PlayListEntity list) {
		this.list = list;
	}


}
