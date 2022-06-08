package com.example.BS2.Controller;


import com.example.BS2.Bs2Application;
import com.example.BS2.Class.Ciudad.Ciudad;
import com.example.BS2.Class.Persona.Persona;
import com.example.BS2.Class.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class Controller1 {
    @Autowired
    PersonaService personaService;

    @Autowired
    ArrayList<Ciudad> listaCiudades;

    @GetMapping("/controlador1/addPersona")
    public Persona addPersona() {
        Persona newPersona = Bs2Application.persona1();
        //System.out.println(newPersona.toString());
        personaService.setPersona(newPersona);
        return personaService.getPersona();
    }

    @PostMapping("/controlador1/addCiudad")
    public Ciudad addCiudad(@RequestBody Ciudad ciudad) {
        listaCiudades.add(ciudad);
        return ciudad;
    }
}