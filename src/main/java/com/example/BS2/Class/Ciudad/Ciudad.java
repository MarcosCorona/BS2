package com.example.BS2.Class.Ciudad;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Ciudad {
    private String nombre;
    private int numeroHabitantes;
}