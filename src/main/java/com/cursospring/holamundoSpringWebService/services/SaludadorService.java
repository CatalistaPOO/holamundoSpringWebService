package com.cursospring.holamundoSpringWebService.services;

import com.cursospring.holamundoSpringWebService.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaludadorService {

    public List<Saludo> getSaludos(String nombre) {
        List<Saludo> saludos = new ArrayList<>();
        saludos.add(new Saludo("Hola, " + nombre));
        saludos.add(new Saludo("Hi, " + nombre));
        return saludos;
    }
}
