package com.demo.firplak.persistence.dto;

public class GetPlayListResponseDto {

	private PlayListDto playlist;



	public GetPlayListResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetPlayListResponseDto(PlayListDto playlist) {
		super();
		this.playlist = playlist;
	}

	public PlayListDto getPlaylist() {
		return playlist;
	}

	public void setPlaylist(PlayListDto playlist) {
		this.playlist = playlist;
	}


}
