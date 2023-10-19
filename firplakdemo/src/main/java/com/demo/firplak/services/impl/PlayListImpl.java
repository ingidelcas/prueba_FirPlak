package com.demo.firplak.services.impl;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.firplak.mapper.PlayListMapper;
import com.demo.firplak.persistence.dto.GetAllPlayListResponseDto;
import com.demo.firplak.persistence.dto.GetPlayListResponseDto;
import com.demo.firplak.persistence.dto.PlayListDto;
import com.demo.firplak.persistence.dto.RegisterPlayListRequestDto;
import com.demo.firplak.persistence.entity.CancionEntity;
import com.demo.firplak.persistence.entity.PlayListEntity;
import com.demo.firplak.repository.PlayListDAO;
import com.demo.firplak.services.interfaces.PlayListService;


@Service
public class PlayListImpl implements PlayListService{
	
	@Autowired
	private PlayListDAO playListRepository;
	
	private PlayListMapper playListMapper = Mappers.getMapper(PlayListMapper.class);

	@Override
	public GetAllPlayListResponseDto getAllPlayList() {
		GetAllPlayListResponseDto response = new GetAllPlayListResponseDto();
		List<PlayListEntity> playList = (List<PlayListEntity>) playListRepository.findAll();
		
		List<PlayListDto> playListDto = playListMapper.playListToPlayListAllDtos(playList);
		
		response.setPlayListDtos(playListDto);
		// TODO Auto-generated method stub
		return response;
	}

	@Override
	public PlayListEntity registerPlayList(RegisterPlayListRequestDto request) {
		// TODO Auto-generated method stub
		PlayListEntity playList = playListMapper.playListDtoToPlayListEntity(request.getPlayList());

		for(CancionEntity cancionEntity: playList.getCanciones()) {
			cancionEntity.setList(playList);
		}
		return playListRepository.save(playList);
		
		
	}

	@Override
	public GetPlayListResponseDto getPlaylist(String name) {
		GetPlayListResponseDto response = new GetPlayListResponseDto();
		PlayListEntity playList = (PlayListEntity) playListRepository.findByNombre(name);
		PlayListDto playListDto = playListMapper.playListEntityToplayListDto(playList);
		response.setPlaylist(playListDto);	
		return response;
	}

	@Override
	public void deletePlayList(String name) {
		playListRepository.deleteByNombre(name);
		
	}
	
	

	

}
