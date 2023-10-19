package com.demo.firplak.services.interfaces;

import com.demo.firplak.persistence.dto.GetAllGuiaTransporteResponseDto;
import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.UpdateGuiaTransporteRequestDto;
import com.demo.firplak.persistence.entity.GuiaTransporteEntity;

import java.io.IOException;

public interface GuiaTransporteService {

	void init() throws IOException;
	
	public GetAllGuiaTransporteResponseDto getAllGuiaTrasporte();
	
	public GuiaTransporteDto getGuiaTrasporteByID(Long id);
	
	public GuiaTransporteEntity register(GuiaTransporteDto dto);
	
	public GuiaTransporteEntity updateEstado(UpdateGuiaTransporteRequestDto dto, String host);

}
