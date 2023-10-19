package com.demo.firplak.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.PODDto;
import com.demo.firplak.persistence.entity.PODEntity;

@Mapper
public interface PODMapper {
	
	PODDto evidenciaEntityToEvidenciaDTO(PODEntity entity);
	PODEntity evidenciaDtoToEvidenciaEntity(GuiaTransporteDto dto);
	List<PODDto> evidenciaToEvidenciaAllDto(List<PODEntity> listEntity);

}
