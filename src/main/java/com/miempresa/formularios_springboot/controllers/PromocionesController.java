package com.miempresa.formularios_springboot.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromocionesController{

    @GetMapping("/promociones")
    public String mostrarpromociones() {
        return "promociones"; 
    }
}