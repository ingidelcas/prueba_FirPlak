package com.demo.firplak.controller;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.firplak.persistence.dto.GuiaTransporteDto;
import com.demo.firplak.persistence.dto.UpdateGuiaTransporteRequestDto;
import com.demo.firplak.persistence.entity.GuiaTransporteEntity;
import com.demo.firplak.services.interfaces.GuiaTransporteService;
import com.demo.firplak.services.interfaces.PODService;

@RestController
public class logisticaController {

	public static final String VERSION = "1";
	public static final String PATH = "/v" + VERSION;
	public static final String GUIA_LIST = PATH + "/guias";
	public static final String GUIA_ID = PATH + "/guia/{id}";
	public static final String REGISTER_GUIA = PATH + "/register";
	public static final String UPDATE_GUIA = PATH + "/update";

	@Autowired
	GuiaTransporteService guiaService;

	@Autowired
	PODService podService;
	
	@Autowired
	private HttpServletRequest request;

	@GetMapping(value = GUIA_LIST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAllGuiaTransporte() {
		try {
			return ResponseEntity.ok(guiaService.getAllGuiaTrasporte());
		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
	}

	@GetMapping(value = GUIA_ID, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity recuperarGuiaTransporte(@PathVariable("id") Long guiaId) {
		try {
			GuiaTransporteDto rs = guiaService.getGuiaTrasporteByID(guiaId);
			if (rs != null) {
				return ResponseEntity.ok(rs);
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}

	}

	@PostMapping(value = REGISTER_GUIA, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity registerGuiaTransporte(@RequestBody GuiaTransporteDto request) {
		URI location = URI.create(String.format(REGISTER_GUIA, request));

		try {

			GuiaTransporteEntity entity = guiaService.register(request);
			return ResponseEntity.created(location).body(entity);

		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
	}

	@PostMapping(value = UPDATE_GUIA, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity actualizarGuia(@RequestParam("guiaId") String guiaId, @RequestParam("estado") String estado,
			@RequestParam("tipoEvidencia") String tipoEvidencia, @RequestParam("evidencia") MultipartFile evidencia,
			@RequestParam("observacion") String observacion) {
		
		String host = request.getRequestURL().toString().replace(request.getRequestURI(),"");

		UpdateGuiaTransporteRequestDto request = new UpdateGuiaTransporteRequestDto();
		request.setGuiaId(Long.valueOf(guiaId));
		request.setEstado(estado);
		request.setTipoEvidencia(tipoEvidencia);
		request.setEvidencia(evidencia);
		request.setObservacion(observacion);
		URI location = URI.create(String.format(REGISTER_GUIA, request));


		try {

			GuiaTransporteEntity entity = guiaService.updateEstado(request, host);
			return ResponseEntity.created(location).body(entity);

		} catch (Exception e) {
			return ResponseEntity.ok("Error al consultar el servicio" + e);
		}
	}

}
