package com.demo.firplak.services.interfaces;

import com.demo.firplak.persistence.dto.GetPODDto;
import com.demo.firplak.persistence.entity.PODEntity;

public interface PODService {
	
	public GetPODDto getEvidenciasByGuiaId(Long guiaId);
	
	public PODEntity registerEvidencia(PODEntity entity);
	
	public void deleteEvidencia(PODEntity entity);

}
