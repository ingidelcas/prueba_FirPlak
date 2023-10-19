package com.demo.firplak.services.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.firplak.mapper.GuiaTransporteMapper;
import com.demo.firplak.mapper.PlayListMapper;
import com.demo.firplak.persistence.dto.GetAllGuiaTransporteResponseDto;
import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.UpdateGuiaTransporteRequestDto;
import com.demo.firplak.persistence.entity.GuiaTransporteEntity;
import com.demo.firplak.persistence.entity.PODEntity;
import com.demo.firplak.persistence.entity.RemisionEntity;
import com.demo.firplak.repository.GuiaTransporteDAO;
import com.demo.firplak.services.interfaces.GuiaTransporteService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.PostConstruct;

@Service
public class GuiaTransporteServicImpl implements GuiaTransporteService {

	@Autowired
	GuiaTransporteDAO repository;

	private GuiaTransporteMapper guiaMapper = Mappers.getMapper(GuiaTransporteMapper.class);

	@Value("${media.location}")
	private String mediaLocation;

	private Path rootLocation;

	@Override
	@PostConstruct
	public void init() throws IOException {
		rootLocation = Paths.get(mediaLocation);
		Files.createDirectories(rootLocation);

	}

	@Override
	public GetAllGuiaTransporteResponseDto getAllGuiaTrasporte() {
		GetAllGuiaTransporteResponseDto response = new GetAllGuiaTransporteResponseDto();
		List<GuiaTransporteEntity> list = (List<GuiaTransporteEntity>) repository.findAll();
		List<GuiaTransporteDto> listDto = guiaMapper.guiaTransporteEntityToGuiaTransporteAllDto(list);
		response.setGuiaTransporteDtos(listDto);
		return response;
	}

	public GuiaTransporteEntity register(GuiaTransporteDto dto) {
		GuiaTransporteEntity entity = guiaMapper.guiaTransporteDTOToGuiaTransporteEntity(dto);
		for (RemisionEntity remisionEndity : entity.getListRemisiones()) {
			remisionEndity.setGuia(entity);
		}
		return repository.save(entity);
	}

	@Override
	public GuiaTransporteEntity updateEstado(UpdateGuiaTransporteRequestDto dto, String host) {
		// TODO Auto-generated method stub
		List<PODEntity> listPod = new ArrayList();
		GuiaTransporteEntity entity = repository.findById(dto.getGuiaId()).orElse(null);
		entity.setEstado(dto.getEstado());

		if (!dto.getEvidencia().isEmpty() && !dto.getTipoEvidencia().isEmpty() && !dto.getEvidencia().isEmpty()) {
			PODEntity podEntity = new PODEntity();
			String path = storage(dto.getEvidencia());
			String url = ServletUriComponentsBuilder.fromHttpUrl(host).path("/v1/").path(path).toUriString();
			podEntity.setGuia(entity);
			podEntity.setTipoEvidencia(dto.getTipoEvidencia());
			podEntity.setEvidencia(url);
			podEntity.setObservacion(dto.getObservacion());
			listPod.add(podEntity);
			entity.setListPOD(listPod);
		}
		return repository.save(entity);
	}

	@Override
	public GuiaTransporteDto getGuiaTrasporteByID(Long id) {

		GuiaTransporteEntity guia = repository.findById(id).orElse(null);
		GuiaTransporteDto response = guiaMapper.guiaTransporteEntityToGuiaTranporteDTO(guia);

		return response;
	}

	public String storage(MultipartFile file) {
		try {
			if (file.isEmpty()) {
				throw new RuntimeException("Failed to store empty file");
			}

			String filename = file.getOriginalFilename();
			Path destinationFile = rootLocation.resolve(Paths.get(filename)).normalize().toAbsolutePath();
			try (InputStream inputStream = file.getInputStream()) {
				Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
			}

			return filename;
		} catch (IOException e) {
			throw new RuntimeException("Failed to store file", e);
		}
	}

}
