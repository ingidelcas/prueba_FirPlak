package com.demo.firplak.persistence.dto;

public class RegisterPlayListRequestDto {

	private PlayListDto playList;

	public RegisterPlayListRequestDto() {
		super();
	}
	public RegisterPlayListRequestDto(PlayListDto playList) {
		super();
		this.playList = playList;
	}
	public PlayListDto getPlayList() {
		return playList;
	}
	public void sePlayList(PlayListDto playList) {
		this.playList = playList;
	}

}
