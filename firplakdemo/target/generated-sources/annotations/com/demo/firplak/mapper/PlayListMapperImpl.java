package com.demo.firplak.mapper;

import com.demo.firplak.persistence.dto.CancionDto;
import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.PlayListDto;
import com.demo.firplak.persistence.entity.CancionEntity;
import com.demo.firplak.persistence.entity.PlayListEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-18T18:08:26-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
public class PlayListMapperImpl implements PlayListMapper {

    @Override
    public PlayListDto playListEntityToplayListDto(PlayListEntity playList) {
        if ( playList == null ) {
            return null;
        }

        PlayListDto playListDto = new PlayListDto();

        playListDto.setId( playList.getId() );
        playListDto.setNombre( playList.getNombre() );
        playListDto.setDescripcion( playList.getDescripcion() );
        playListDto.setCanciones( cancionEntityListToCancionDtoList( playList.getCanciones() ) );

        return playListDto;
    }

    @Override
    public PlayListEntity playListDtoToPlayListEntity(PlayListDto playList) {
        if ( playList == null ) {
            return null;
        }

        PlayListEntity playListEntity = new PlayListEntity();

        if ( playList.getId() != null ) {
            playListEntity.setId( playList.getId() );
        }
        playListEntity.setNombre( playList.getNombre() );
        playListEntity.setDescripcion( playList.getDescripcion() );
        playListEntity.setCanciones( cancionDtoListToCancionEntityList( playList.getCanciones() ) );

        return playListEntity;
    }

    @Override
    public List<PlayListDto> playListToPlayListAllDtos(List<PlayListEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PlayListDto> list1 = new ArrayList<PlayListDto>( list.size() );
        for ( PlayListEntity playListEntity : list ) {
            list1.add( playListEntityToplayListDto( playListEntity ) );
        }

        return list1;
    }

    protected GuiaTransporteDto playListEntityToGuiaTransporteDto(PlayListEntity playListEntity) {
        if ( playListEntity == null ) {
            return null;
        }

        GuiaTransporteDto guiaTransporteDto = new GuiaTransporteDto();

        guiaTransporteDto.setId( playListEntity.getId() );

        return guiaTransporteDto;
    }

    protected CancionDto cancionEntityToCancionDto(CancionEntity cancionEntity) {
        if ( cancionEntity == null ) {
            return null;
        }

        CancionDto cancionDto = new CancionDto();

        cancionDto.setId( cancionEntity.getId() );
        cancionDto.setTitulo( cancionEntity.getTitulo() );
        cancionDto.setArtista( cancionEntity.getArtista() );
        cancionDto.setAlbum( cancionEntity.getAlbum() );
        cancionDto.setAnno( cancionEntity.getAnno() );
        cancionDto.setList( playListEntityToGuiaTransporteDto( cancionEntity.getList() ) );

        return cancionDto;
    }

    protected List<CancionDto> cancionEntityListToCancionDtoList(List<CancionEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CancionDto> list1 = new ArrayList<CancionDto>( list.size() );
        for ( CancionEntity cancionEntity : list ) {
            list1.add( cancionEntityToCancionDto( cancionEntity ) );
        }

        return list1;
    }

    protected PlayListEntity guiaTransporteDtoToPlayListEntity(GuiaTransporteDto guiaTransporteDto) {
        if ( guiaTransporteDto == null ) {
            return null;
        }

        PlayListEntity playListEntity = new PlayListEntity();

        if ( guiaTransporteDto.getId() != null ) {
            playListEntity.setId( guiaTransporteDto.getId() );
        }

        return playListEntity;
    }

    protected CancionEntity cancionDtoToCancionEntity(CancionDto cancionDto) {
        if ( cancionDto == null ) {
            return null;
        }

        CancionEntity cancionEntity = new CancionEntity();

        cancionEntity.setId( cancionDto.getId() );
        cancionEntity.setTitulo( cancionDto.getTitulo() );
        cancionEntity.setArtista( cancionDto.getArtista() );
        cancionEntity.setAlbum( cancionDto.getAlbum() );
        cancionEntity.setAnno( cancionDto.getAnno() );
        cancionEntity.setList( guiaTransporteDtoToPlayListEntity( cancionDto.getList() ) );

        return cancionEntity;
    }

    protected List<CancionEntity> cancionDtoListToCancionEntityList(List<CancionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<CancionEntity> list1 = new ArrayList<CancionEntity>( list.size() );
        for ( CancionDto cancionDto : list ) {
            list1.add( cancionDtoToCancionEntity( cancionDto ) );
        }

        return list1;
    }
}
