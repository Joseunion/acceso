package com.api.rest.ad.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Document(value = "Estadio")
public class Estadio {
 
    @Id
    private long id;

    @Field
    private int capacidad;

    @Field
    private String direccion;
}
