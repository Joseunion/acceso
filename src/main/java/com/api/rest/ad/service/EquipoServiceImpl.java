package com.api.rest.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.rest.ad.domain.Equipo;
import com.api.rest.ad.repository.EquipoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

    @GetMapping
    public Flux<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Equipo> findById(String id) {
        return equipoRepository.findById(id);
    }

    @PostMapping
    public Mono<Equipo> save(Equipo equipo) {
        return equipoRepository.save(equipo);
    }
    @PutMapping("/{id}")
    public Mono<Equipo> updateEquipo(@PathVariable String id, @RequestBody Equipo equipo){
        equipo.setId(id);
        return equipoRepository.save(equipo);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> delete(Equipo equipo) {
        return equipoRepository.delete(equipo);
    }

    /*
    @GetMapping
    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }
    
    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    
    @PutMapping("/{id}")
    public Mono<User> updateUser(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }
    
    @DeleteMapping("/{id}")
    public Mono<Void> deleteUser(@PathVariable String id) {
        return userRepository.deleteById(id);
    }
    */ 

    
}
