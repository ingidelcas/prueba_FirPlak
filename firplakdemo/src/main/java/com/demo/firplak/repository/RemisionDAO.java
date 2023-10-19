package com.demo.firplak.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.firplak.persistence.entity.RemisionEntity;

@Repository
public interface RemisionDAO extends CrudRepository<RemisionEntity, Long> {

}
