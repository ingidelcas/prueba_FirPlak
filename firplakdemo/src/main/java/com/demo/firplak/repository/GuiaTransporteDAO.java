package com.demo.firplak.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.firplak.persistence.entity.GuiaTransporteEntity;

@Repository
public interface GuiaTransporteDAO extends CrudRepository<GuiaTransporteEntity, Long>{


}
