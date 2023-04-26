package com.api.rest.ad.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(value = "jugadores")
public class Jugador {

    @Id
    private long id;

    @Field
    private String nombre;

    @Field
    private int goles;
    
}
