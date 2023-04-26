package com.api.rest.ad.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(value = "equipos")
public class Equipo {

    @Id
    private String id;

    @Field
    private String nombre;
    @Field
    private int numJugadores;
    @Field
    private int puntos;
}
