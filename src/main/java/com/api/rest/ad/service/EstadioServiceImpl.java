package com.api.rest.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.rest.ad.domain.Estadio;
import com.api.rest.ad.repository.EstadioRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EstadioServiceImpl implements EstadioService{

    @Autowired
    private EstadioRepository estadioRepository;

    @GetMapping
    public Flux<Estadio> findAll() {
        return estadioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Estadio> findById(String id) {
        return estadioRepository.findById(id);
    }

    @PostMapping
    public Mono<Estadio> save(Estadio estadio) {
        return estadioRepository.save(estadio);
    }
    @PutMapping("/{id}")
    public Mono<Estadio> updateEstadio(@PathVariable String id, @RequestBody Estadio estadio){
        estadio.setId(id);
        return estadioRepository.save(estadio);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> delete(Estadio estadio) {
        return estadioRepository.delete(estadio);
    }

    
}
