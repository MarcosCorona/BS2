package com.example.BS2.Class.Persona;

import org.springframework.stereotype.Service;

@Service
public interface PersonaService {
    void setPersona(Persona persona);
    Persona getPersona();
}