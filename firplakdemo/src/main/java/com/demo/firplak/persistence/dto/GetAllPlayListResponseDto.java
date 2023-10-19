package com.demo.firplak.persistence.dto;

import java.util.List;

public class GetAllPlayListResponseDto {

	private List<PlayListDto> playListDtos;



	public GetAllPlayListResponseDto() {
		super();
	}

	public GetAllPlayListResponseDto(List<PlayListDto> playListDtos) {
		super();
		this.playListDtos = playListDtos;
	}

	public List<PlayListDto> getPlayListDtos() {
		return playListDtos;
	}

	public void setPlayListDtos(List<PlayListDto> playListDtos) {
		this.playListDtos = playListDtos;
	}


}
