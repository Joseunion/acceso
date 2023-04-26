package com.api.rest.ad.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api.rest.ad.domain.Estadio;

public interface EstadioRepository  extends ReactiveMongoRepository<Estadio, String>{
    
}
