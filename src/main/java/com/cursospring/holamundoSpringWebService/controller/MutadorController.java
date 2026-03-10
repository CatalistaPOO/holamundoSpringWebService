package com.cursospring.holamundoSpringWebService.controller;

import com.cursospring.holamundoSpringWebService.model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//en este caso no es record porque va a cambiar de valor
public class MutadorController {
    @GetMapping("/mutar")
    public Animal mutar(@RequestBody (required = true) Animal animal){
        return animal;
    }
}
