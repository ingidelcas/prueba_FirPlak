package com.demo.firplak.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.demo.firplak.persistence.dto.PlayListDto;
import com.demo.firplak.persistence.entity.PlayListEntity;

@Mapper
public interface PlayListMapper {

	PlayListDto playListEntityToplayListDto(PlayListEntity playList);

	PlayListEntity playListDtoToPlayListEntity(PlayListDto playList);

	List<PlayListDto> playListToPlayListAllDtos(List<PlayListEntity> list);


}
