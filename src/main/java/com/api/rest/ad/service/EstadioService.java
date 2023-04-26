package com.api.rest.ad.service;

import com.api.rest.ad.domain.Estadio;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EstadioService {
    public Flux<Estadio> findAll();
    public Mono<Estadio> findById(String id);
    public Mono<Estadio> save(Estadio estadio);
    public Mono<Void> delete(Estadio estadio);
    
}
