package com.demo.firplak.mapper;

import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.PODDto;
import com.demo.firplak.persistence.entity.PODEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-18T18:08:25-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
public class PODMapperImpl implements PODMapper {

    @Override
    public PODDto evidenciaEntityToEvidenciaDTO(PODEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PODDto pODDto = new PODDto();

        pODDto.setId( entity.getId() );
        pODDto.setTipoEvidencia( entity.getTipoEvidencia() );
        pODDto.setEvidencia( entity.getEvidencia() );
        pODDto.setObservacion( entity.getObservacion() );

        return pODDto;
    }

    @Override
    public PODEntity evidenciaDtoToEvidenciaEntity(GuiaTransporteDto dto) {
        if ( dto == null ) {
            return null;
        }

        PODEntity pODEntity = new PODEntity();

        pODEntity.setId( dto.getId() );

        return pODEntity;
    }

    @Override
    public List<PODDto> evidenciaToEvidenciaAllDto(List<PODEntity> listEntity) {
        if ( listEntity == null ) {
            return null;
        }

        List<PODDto> list = new ArrayList<PODDto>( listEntity.size() );
        for ( PODEntity pODEntity : listEntity ) {
            list.add( evidenciaEntityToEvidenciaDTO( pODEntity ) );
        }

        return list;
    }
}
