package com.cursospring.holamundoSpringWebService.controller;

import com.cursospring.holamundoSpringWebService.model.Saludo;
import com.cursospring.holamundoSpringWebService.services.SaludadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SaludadorController {
     @Autowired
     private SaludadorService saludadorService;

    @GetMapping("/")
    public List<Saludo> saludar(@RequestParam String nombre){
        List<Saludo> saludos = saludadorService.getSaludos(nombre);
        return saludos;
    }
}


