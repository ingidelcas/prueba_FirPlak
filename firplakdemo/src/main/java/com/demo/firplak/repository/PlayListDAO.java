package com.demo.firplak.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.firplak.persistence.entity.PlayListEntity;

@Repository
public interface PlayListDAO extends CrudRepository<PlayListEntity, Long>{

	PlayListEntity findByNombre(String name);

	@Transactional
    @Modifying
	void deleteByNombre(String name);

}
