package com.example.BS2;

import com.example.BS2.Class.Ciudad.Ciudad;
import com.example.BS2.Class.Persona.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import java.util.ArrayList;

@SpringBootApplication
public class Bs2Application {
	@Autowired
	ArrayList<Ciudad> listaCiudades;
	public static ConfigurableApplicationContext cap;

	public static void main(String[] args) {
		cap = SpringApplication.run(Bs2Application.class, args);
	}


	@Bean("bean1")
	public static Persona persona1() {
		return Persona.builder().nombre("Marcos").edad(24).poblacion("Toledo").build();
	}
	@Bean("bean2")
	public static Persona persona2() {
		return Persona.builder().nombre("Andrea").edad(22).poblacion("Yeles").build();
	}
	@Bean("bean3")
	public static Persona persona3() {
		return Persona.builder().nombre("Eustaquia").edad(64).poblacion("Valdemoro").build();
	}
	@Bean()
	public static ArrayList<Ciudad> listaCiudades()
	{
		return new ArrayList<Ciudad>();
	}

}
