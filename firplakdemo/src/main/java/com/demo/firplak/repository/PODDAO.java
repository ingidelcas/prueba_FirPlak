package com.demo.firplak.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.firplak.persistence.entity.PODEntity;

@Repository
public interface PODDAO extends CrudRepository<PODEntity, Long> {

}
