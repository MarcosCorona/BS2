package com.example.BS2.Controller;
import com.example.BS2.Bs2Application;
import com.example.BS2.Class.Persona.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class BeanController {

    @GetMapping("/controlador/bean/{bean}")
    public Persona getBeanPersona(@PathVariable("bean") String nombre) {
        return (Persona) Bs2Application.cap.getBean(nombre);
    }
}
