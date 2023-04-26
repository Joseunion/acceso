package com.api.rest.ad.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.ad.domain.Equipo;

@Repository
public interface EquipoRepository  extends ReactiveMongoRepository <Equipo, String>{}
