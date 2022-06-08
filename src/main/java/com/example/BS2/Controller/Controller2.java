package com.example.BS2.Controller;

import com.example.BS2.Bs2Application;
import com.example.BS2.Class.Ciudad.Ciudad;
import com.example.BS2.Class.Persona.Persona;
import com.example.BS2.Class.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller2 {
    @Autowired
    PersonaService personaService;
    @Autowired
    ArrayList<Ciudad> listaCiudades;

    @GetMapping("/controlador2/getPersona")
    public Persona getPersona() {
        Persona newPersona = personaService.getPersona();
        newPersona.setEdad(newPersona.getEdad() * 2);
        return personaService.getPersona();
    }

    @GetMapping("/controlador2/getCiudad")
    public ArrayList<Ciudad> getCiudad() {
        return listaCiudades;
    }
}
