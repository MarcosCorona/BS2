package com.example.BS2.Class.Persona;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Persona {
    private String nombre;
    private int edad;
    private String poblacion;
}