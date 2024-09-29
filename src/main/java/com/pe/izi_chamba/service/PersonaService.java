package com.pe.izi_chamba.service;

import com.pe.izi_chamba.model.entity.Persona;

import java.util.List;

public interface PersonaService {
    Persona getById(Long id);
    List<Persona> getAll();
    void save(Persona persona);
    void update(Persona persona);
    void delete(Long id);
}
