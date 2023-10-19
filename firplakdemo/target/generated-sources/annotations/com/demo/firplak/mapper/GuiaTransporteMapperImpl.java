package com.demo.firplak.mapper;

import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.RemisionDto;
import com.demo.firplak.persistence.entity.GuiaTransporteEntity;
import com.demo.firplak.persistence.entity.RemisionEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-18T18:08:25-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
public class GuiaTransporteMapperImpl implements GuiaTransporteMapper {

    @Override
    public GuiaTransporteDto guiaTransporteEntityToGuiaTranporteDTO(GuiaTransporteEntity entity) {
        if ( entity == null ) {
            return null;
        }

        GuiaTransporteDto guiaTransporteDto = new GuiaTransporteDto();

        guiaTransporteDto.setId( entity.getId() );
        guiaTransporteDto.setFechaDespacho( entity.getFechaDespacho() );
        guiaTransporteDto.setFechaEntrega( entity.getFechaEntrega() );
        guiaTransporteDto.setTransportadora( entity.getTransportadora() );
        guiaTransporteDto.setEstado( entity.getEstado() );
        guiaTransporteDto.setListRemisiones( remisionEntityListToRemisionDtoList( entity.getListRemisiones() ) );

        return guiaTransporteDto;
    }

    @Override
    public GuiaTransporteEntity guiaTransporteDTOToGuiaTransporteEntity(GuiaTransporteDto dto) {
        if ( dto == null ) {
            return null;
        }

        GuiaTransporteEntity guiaTransporteEntity = new GuiaTransporteEntity();

        guiaTransporteEntity.setId( dto.getId() );
        guiaTransporteEntity.setFechaDespacho( dto.getFechaDespacho() );
        guiaTransporteEntity.setFechaEntrega( dto.getFechaEntrega() );
        guiaTransporteEntity.setTransportadora( dto.getTransportadora() );
        guiaTransporteEntity.setEstado( dto.getEstado() );
        guiaTransporteEntity.setListRemisiones( remisionDtoListToRemisionEntityList( dto.getListRemisiones() ) );

        return guiaTransporteEntity;
    }

    @Override
    public List<GuiaTransporteDto> guiaTransporteEntityToGuiaTransporteAllDto(List<GuiaTransporteEntity> listEntity) {
        if ( listEntity == null ) {
            return null;
        }

        List<GuiaTransporteDto> list = new ArrayList<GuiaTransporteDto>( listEntity.size() );
        for ( GuiaTransporteEntity guiaTransporteEntity : listEntity ) {
            list.add( guiaTransporteEntityToGuiaTranporteDTO( guiaTransporteEntity ) );
        }

        return list;
    }

    protected RemisionDto remisionEntityToRemisionDto(RemisionEntity remisionEntity) {
        if ( remisionEntity == null ) {
            return null;
        }

        RemisionDto remisionDto = new RemisionDto();

        remisionDto.setId( remisionEntity.getId() );
        remisionDto.setOrdenId( remisionEntity.getOrdenId() );
        remisionDto.setLineaPedidoId( remisionEntity.getLineaPedidoId() );

        return remisionDto;
    }

    protected List<RemisionDto> remisionEntityListToRemisionDtoList(List<RemisionEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RemisionDto> list1 = new ArrayList<RemisionDto>( list.size() );
        for ( RemisionEntity remisionEntity : list ) {
            list1.add( remisionEntityToRemisionDto( remisionEntity ) );
        }

        return list1;
    }

    protected RemisionEntity remisionDtoToRemisionEntity(RemisionDto remisionDto) {
        if ( remisionDto == null ) {
            return null;
        }

        RemisionEntity remisionEntity = new RemisionEntity();

        remisionEntity.setId( remisionDto.getId() );
        remisionEntity.setOrdenId( remisionDto.getOrdenId() );
        remisionEntity.setLineaPedidoId( remisionDto.getLineaPedidoId() );

        return remisionEntity;
    }

    protected List<RemisionEntity> remisionDtoListToRemisionEntityList(List<RemisionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<RemisionEntity> list1 = new ArrayList<RemisionEntity>( list.size() );
        for ( RemisionDto remisionDto : list ) {
            list1.add( remisionDtoToRemisionEntity( remisionDto ) );
        }

        return list1;
    }
}
