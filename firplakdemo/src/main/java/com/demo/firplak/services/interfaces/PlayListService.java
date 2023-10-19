package com.demo.firplak.services.interfaces;

import com.demo.firplak.persistence.dto.GetAllPlayListResponseDto;
import com.demo.firplak.persistence.dto.GetPlayListResponseDto;
import com.demo.firplak.persistence.dto.RegisterPlayListRequestDto;
import com.demo.firplak.persistence.entity.PlayListEntity;

public interface PlayListService {

	public GetAllPlayListResponseDto getAllPlayList();
	
	public PlayListEntity registerPlayList(RegisterPlayListRequestDto person);
	
	public GetPlayListResponseDto getPlaylist(String name);
	
	public void deletePlayList(String name);
	
}
