package com.demo.firplak.persistence.dto;

public class RemisionDto {

	private Long id;
	private Long ordenId;
	private Long lineaPedidoId;
	private GuiaTransporteDto guia;
	
	
	public RemisionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RemisionDto(Long id, Long ordenId, Long lineaPedidoId, GuiaTransporteDto guiaId) {
		super();
		this.id = id;
		this.ordenId = ordenId;
		this.lineaPedidoId = lineaPedidoId;
		this.guia = guiaId;
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
	public GuiaTransporteDto getGuiaId() {
		return guia;
	}
	public void setGuiaId(GuiaTransporteDto guia) {
		this.guia = guia;
	}

	
}
