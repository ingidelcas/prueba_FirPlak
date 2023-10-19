package com.demo.firplak.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.firplak.persistence.dto.GetPlayListResponseDto;
import com.demo.firplak.persistence.dto.PlayListDto;
import com.demo.firplak.persistence.dto.RegisterPlayListRequestDto;
import com.demo.firplak.persistence.entity.PlayListEntity;
import com.demo.firplak.services.interfaces.PlayListService;

@RestController
public class PlayListController {
	public static final String VERSION = "1";
	public static final String PATH = "/v" + VERSION;
	public static final String PLAY_LIST = "/lists";
	public static final String LIST_BY_NAME = "/lists/{listName}";

	
	@Autowired
	private PlayListService listService;

	
	@GetMapping(value = "/lists", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAllPlayList() {
		try {
			listService.getAllPlayList();
			return ResponseEntity.ok(listService.getAllPlayList());
		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
	}
	
	@GetMapping(value = LIST_BY_NAME, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity recuperarPlayList(@PathVariable("listName") String listName) {
		try {
			GetPlayListResponseDto rs = listService.getPlaylist(listName);
			if(rs.getPlaylist() != null ) {
			return ResponseEntity.ok(rs);
			}else {
				return  ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
		
	}


	@PostMapping(value = PLAY_LIST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity registerPlayList(@RequestBody PlayListDto request) {
		URI location = URI.create(String.format(PLAY_LIST, request));
		RegisterPlayListRequestDto rq = new RegisterPlayListRequestDto();
		try {
			if (request.getNombre() == null || request.getNombre().equals("")) {
				return  ResponseEntity.badRequest().build();
			} else {
				rq.sePlayList(request);
				PlayListEntity listEntity = listService.registerPlayList(rq);
				return ResponseEntity.created(location).body(listEntity);
			}
		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
	}
	
	@DeleteMapping(value = LIST_BY_NAME, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity deletePlayList(@PathVariable("listName") String listName) {
		
		try {
			
			GetPlayListResponseDto rs = listService.getPlaylist(listName);
			if(rs.getPlaylist() != null ) {
				listService.deletePlayList(listName);
				return  ResponseEntity.noContent().build();
			}else {
				return   ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
		
	}

}
