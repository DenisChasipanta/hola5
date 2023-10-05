package com.example.EquiposTIC.controlador;

import com.example.EquiposTIC.entidad.Solicitud;
import com.example.EquiposTIC.repositorio.SolicitucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class SolicitudController {
    @Autowired
    SolicitucRepository solicitucRepository;

    @GetMapping("/solicitudes")
    public String solicitud(Model model){
        List<Solicitud> solicitudes = solicitucRepository.findAll();
        model.addAttribute("solicitudes",solicitudes);
        return "solicitud/solicitudes";
    }
    @GetMapping("/solicitud/form")
    public  String form(Model model){
        model.addAttribute("solicitudes", new Solicitud());
        return "solicitud/formulario";
    }
    @PostMapping("/solicitud/form")
    public String crear(Solicitud solicitud){
        solicitucRepository.save(solicitud);
        return "redirect:/solicitudes";
    }
    //EDITAR
    @GetMapping("/solicitud/editar/{numeroCodigo}")
    public String editar(@PathVariable Integer numeroCodigo, Model model){
        Optional<Solicitud> solicitudes = solicitucRepository.findById(numeroCodigo);
        return "/solicitud/formulario";
    }
    //ELIMINAR
    @GetMapping("/solicitud/eleiminar/{numeroCodigo}")
    public String eliminar(@PathVariable Integer numeroCodigo){
        solicitucRepository.deleteById(numeroCodigo);
        return "redirect:/solicitudes";
    }

}
