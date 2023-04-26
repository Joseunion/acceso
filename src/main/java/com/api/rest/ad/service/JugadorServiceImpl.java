package com.api.rest.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.rest.ad.domain.Jugador;
import com.api.rest.ad.repository.JugadorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class JugadorServiceImpl implements JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping
    public Flux<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Jugador> findById(String id) {
        return jugadorRepository.findById(id);
    }

    @PostMapping
    public Mono<Jugador> save(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
    @PutMapping("/{id}")
    public Mono<Jugador> updateEstadio(@PathVariable String id, @RequestBody Jugador jugador){
        jugador.setId(id);
        return jugadorRepository.save(jugador);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> delete(Jugador jugador) {
        return jugadorRepository.delete(jugador);
    }
    
}
