package com.example.EquiposTIC.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pricipal {
    @GetMapping("/")
    private String home(){
        return "Inamhi";
    }
}
