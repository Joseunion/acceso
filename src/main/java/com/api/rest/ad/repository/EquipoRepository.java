package com.api.rest.ad.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api.rest.ad.domain.Equipo;

public interface EquipoRepository  extends ReactiveMongoRepository <Equipo, String>{
    
}
