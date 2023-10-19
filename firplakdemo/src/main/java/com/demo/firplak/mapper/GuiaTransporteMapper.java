package com.demo.firplak.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.entity.GuiaTransporteEntity;

@Mapper
public interface GuiaTransporteMapper {

	GuiaTransporteDto guiaTransporteEntityToGuiaTranporteDTO(GuiaTransporteEntity entity);
	GuiaTransporteEntity guiaTransporteDTOToGuiaTransporteEntity(GuiaTransporteDto dto);
	List<GuiaTransporteDto> guiaTransporteEntityToGuiaTransporteAllDto(List<GuiaTransporteEntity> listEntity);
}
