package com.demo.firplak.persistence.entity;

import java.io.Serializable;

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
@Table(name="remision")
public class RemisionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "orden_id")
	private Long ordenId;
	@Column(name = "linea_pedido_id")
	private Long lineaPedidoId;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "guia_id")
	@JsonBackReference
	private GuiaTransporteEntity guia;
	
	
	public RemisionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RemisionEntity(Long id, Long ordenId, Long lineaPedidoId, GuiaTransporteEntity guia) {
		super();
		this.id = id;
		this.ordenId = ordenId;
		this.lineaPedidoId = lineaPedidoId;
		this.guia = guia;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}
	public Long getLineaPedidoId() {
		return lineaPedidoId;
	}
	public void setLineaPedidoId(Long lineaPedidoId) {
		this.lineaPedidoId = lineaPedidoId;
	}
	public GuiaTransporteEntity getGuia() {
		return guia;
	}
	public void setGuia(GuiaTransporteEntity guia) {
		this.guia = guia;
	}
	
	

}
