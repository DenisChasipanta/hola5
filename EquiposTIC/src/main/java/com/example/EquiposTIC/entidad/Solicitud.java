package com.example.EquiposTIC.entidad;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numeroCodigo;
    private String codigo;
    private String nombreFuncionario;
    private String direccion;
    private String email;
    private String tipoRegistro;
    private LocalDate fecha;
    private String tipoEquipo;
    private String sistemaOperativo;
    private String procesador;
    private String tipoDisco;
    private String ram;
    private String capacidadDisco;
    private String marcaDiscoDuro;
    private String modeloDiscoDuro;
    private String serieDiscoDuro;
    private String estadoDiscoDuro;
    private String observacionDiscoDuro;
    private String marcaCase;
    private String modeloCase;
    private String serieCase;
    private String estadoCase;
    private String observacionCase;
    private String marcaMonitor;
    private String modeloMonitor;
    private String serieMonitor;
    private String estadoMonitor;
    private String observacionMonitor;
    private String marcaTeclado;
    private String modeloTeclado;
    private String serieTeclado;
    private String estadoTeclado;
    private String observacionTeclado;
    private String marcaMouse;
    private String modeloMouse;
    private String serieMouse;
    private String estadoMouse;
    private String observacionMouse;
    private String marcaUPS;
    private String modeloUPS;
    private String serieUPS;
    private String estadoUPS;
    private String observacionUPS;
    private String marcaParlantes;
    private String modeloParlantes;
    private String serieParlantes;
    private String estadoParlantes;
    private String observacionParlantes;
    private String marcaMemoriaRam;
    private String modeloMemoriaRam;
    private String serieMemoriaRam;
    private String estadoMemoriaRam;
    private String observacionMemoriaRam;
    private String marcaCamara;
    private String modeloCamara;
    private String serieCamara;
    private String estadoCamara;
    private String observacionCamara;
    private String marcaBateria;
    private String modeloBateria;
    private String serieBateria;
    private String estadoBateria;
    private String observacionBateria;
    private String marcaCargadorPortatil;
    private String modeloCargadorPortatil;
    private String serieCargadorPortatil;
    private String estadoCargadorPortatil;
    private String observacionCargadorPortatil;
    private String marcaMicrofono;
    private String modeloMicrofono;
    private String serieMicrofono;
    private String estadoMicrofono;
    private String observacionMicrofono;
    private String marcaTarjetaRed;
    private String modeloTarjetaRed;
    private String serieTarjetaRed;
    private String estadoTarjetaRed;
    private String observacionTarjetaRed;
    private String funcionaCableEnergia;
    private String observacionCableEnergia;
    private String funcionaTouchpad;
    private String observacionTouchpad;
    private String funcionaLector;
    private String observacionLector;
    private String funcionaLectorTarjetas;
    private String observacionLectorTarjetas;
    private String funcionaPuertoEthernet;
    private String observacionPuertoEthernet;
    private String funcionaPuertoHDMI;
    private String observacionPuertoHDMI;
    private String funcionaPuertoVGA;
    private String observacionPuertoVGA;
    private String funcionaIndicadoresLuminosos;
    private String observacionIndicadoresLuminosos;
    private String funcionaSalidaAudio;
    private String observacionSalidaAudio;
    private String funcionaWIFI;
    private String observacionWIFI;
    private String mantenimiento;
    private String revisado;
    private String cargoRevisado;
    private String recibido;
    private String cargoRecibido;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
