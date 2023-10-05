package com.example.EquiposTIC.controlador;

import com.example.EquiposTIC.entidad.Persona;
import com.example.EquiposTIC.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/personas")
    public String persona(Model model){
        List<Persona> personas = personaRepository.findAll();
        model.addAttribute("personas",personas);
        return "persona/personas";
    }
    @GetMapping("/persona/form")
    public String form(Model model){
        model.addAttribute("personas", new Persona());
        return "persona/formulario";
    }
    @PostMapping("/persona/form")
    public String nuevo(Persona persona){
        personaRepository.save(persona);
        return "redirect:/personas";
    }

    //EDITAR
    //@GetMapping("/persona/editar/{id}")
    //public String editar(@PathVariable Integer id, Model model){
    //    Optional<Persona> personas = personaRepository.findById(id);
    //    return  "/persona/formulario";
    //}
    //ELIMINAR
    @GetMapping("/persona/eliminar/{id}")
    public  String eliminar(@PathVariable Integer id){
        personaRepository.deleteById(id);
        return "redirect:/personas";
    }

}
