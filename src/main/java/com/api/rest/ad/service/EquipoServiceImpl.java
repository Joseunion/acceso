package com.api.rest.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.ad.domain.Equipo;
import com.api.rest.ad.repository.EquipoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public Flux<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    @Override
    public Mono<Equipo> findById(String id) {
        return equipoRepository.findById(id);
    }

    @Override
    public Mono<Equipo> save(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public Mono<Void> delete(Equipo equipo) {
        return equipoRepository.delete(equipo);
    }

    
}
