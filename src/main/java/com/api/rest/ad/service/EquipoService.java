package com.api.rest.ad.service;

import com.api.rest.ad.domain.Equipo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EquipoService {
    public Flux<Equipo> findAll();
    public Mono<Equipo> findById(String id);
    public Mono<Equipo> save(Equipo equipo);
    public Mono<Void> delete(Equipo equipo);
}
