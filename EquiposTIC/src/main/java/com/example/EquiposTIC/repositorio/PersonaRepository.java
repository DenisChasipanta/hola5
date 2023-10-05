package com.example.EquiposTIC.repositorio;

import com.example.EquiposTIC.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}
