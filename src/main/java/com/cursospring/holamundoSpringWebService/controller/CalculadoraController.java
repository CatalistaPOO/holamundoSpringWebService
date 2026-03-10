package com.cursospring.holamundoSpringWebService.controller;

import com.cursospring.holamundoSpringWebService.model.Calculadora;
import com.cursospring.holamundoSpringWebService.model.Resultado;
import com.cursospring.holamundoSpringWebService.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping ("/sumar")
    public Resultado sumar(@RequestParam Integer n1, @RequestParam Integer n2){
        Integer resultado = calculadoraService.sumar(n1,n2);
        return new Resultado(resultado);
    }

}
