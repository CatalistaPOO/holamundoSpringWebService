package com.cursospring.holamundoSpringWebService.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Integer sumar(Integer n1, Integer n2) {
        return n1 + n2;
    }

    public Integer restar(Integer n1, Integer n2) {
        return n1 - n2;
    }

    public Integer multiplicar(Integer n1, Integer n2) {
        return n1 * n2;
    }

    public Integer dividir(Integer n1, Integer n2) {
        return n1 / n2;
    }

}
