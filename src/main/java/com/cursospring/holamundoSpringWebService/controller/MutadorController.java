package com.cursospring.holamundoSpringWebService.controller;

import com.cursospring.holamundoSpringWebService.model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//en este caso no es record porque va a cambiar de valor
@RestController
public class MutadorController {
    @GetMapping("/mutar")
    public Animal mutar(@RequestBody (required = true) Animal animal){
        return animal;
    }
}
