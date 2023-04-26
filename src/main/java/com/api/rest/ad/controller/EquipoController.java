package com.api.rest.ad.controller;

import java.net.URI;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ComparisonOperators.Eq;
import org.springframework.data.mongodb.core.aggregation.VariableOperators.Map;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.ad.domain.Equipo;
import com.api.rest.ad.repository.EquipoRepository;
import com.api.rest.ad.service.EquipoService;

import jakarta.validation.Valid;
import lombok.Value;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping("/equipos/{id}")
    public Mono<Equipo> obtenerbyId(@PathVariable String id){
        return equipoService.findById(id);
    }

    @GetMapping(value = "/equipos", produces = "application/json")
    public Mono<ResponseEntity<Flux<Equipo>>> listarEquipos(){
        return Mono.just(
            ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .body(equipoService.findAll())
        );
        
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Equipo>> verDetallesEquipo(@PathVariable String id){
        return equipoService.findById(id).map(e -> ResponseEntity.ok()
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .body(e)).defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping("/equipos")
    public Mono<Equipo> crearEquipo(@RequestBody Equipo equipo){
        return equipoService.save(equipo);
    }

    @PutMapping("/equipos/{id}")
    public Mono<Equipo> actualizarEquipo(@PathVariable String id, @RequestBody Equipo equipo) {
        return equipoService.findById(id).flatMap(e -> {
            e.setNombre(equipo.getNombre());
            e.setNumJugadores(equipo.getNumJugadores());
            e.setPuntos(equipo.getPuntos());
            return equipoService.save(e);
        });
    }

   


    }


    

