package com.api.rest.ad.service;

import com.api.rest.ad.domain.Jugador;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface JugadorService {
    public Flux<Jugador> findAll();
    public Mono<Jugador> findById(String id);
    public Mono<Jugador> save(Jugador jugador);
    public Mono<Void> delete(Jugador jugador);
    
}
