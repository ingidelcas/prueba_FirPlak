package com.demo.firplak.services.impl;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.firplak.mapper.PODMapper;
import com.demo.firplak.persistence.dto.GetPODDto;
import com.demo.firplak.persistence.entity.PODEntity;
import com.demo.firplak.repository.PODDAO;
import com.demo.firplak.services.interfaces.PODService;

@Service
public class PODServiceImpl implements PODService {
	
	@Autowired
	PODDAO repository;
	
	private PODMapper playListMapper = Mappers.getMapper(PODMapper.class);

	@Override
	public GetPODDto getEvidenciasByGuiaId(Long guiaId) {

		return null;
	}

	@Override
	public PODEntity registerEvidencia(PODEntity entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public void deleteEvidencia(PODEntity entity) {
		// TODO Auto-generated method stub
		repository.delete(entity);
	}

}
