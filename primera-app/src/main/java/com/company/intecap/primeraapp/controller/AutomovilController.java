package com.company.intecap.primeraapp.controller;


import com.company.intecap.primeraapp.model.Automovil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AutomovilController {
    @GetMapping("/Automovil")
    public ResponseEntity<List<Automovil>> getAutomovil(){
       Automovil a1 = new Automovil(1,"Toyota", "Corolla", "Rojo", "P123SAT", 87000 );
       Automovil a2 = new Automovil(2,"Mazda", "Mazda 3", "Negro", "P216FMV", 88336 );
       Automovil a3 = new Automovil(3,"Jeep", "Jeep Cherokee", "Rojo", "P578SPI", 387000 );
       Automovil a4 = new Automovil(4,"Kia", "Kia Besta ", "Verde", "P358SPI", 52369 );
       Automovil a5 = new Automovil(5,"Alfa Romeo", "Alfa Romeo 4C  ", "Rojo", "P813HYN", 540369 );

    List<Automovil> automovils = List.of(a1,a2,a3,a4,a5);

    return new ResponseEntity<>(automovils, HttpStatus.OK);
    }
}
