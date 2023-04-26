package com.api.rest.ad.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api.rest.ad.domain.Jugador;

public interface JugadorRepository extends ReactiveMongoRepository<Jugador, String> {
    
}
