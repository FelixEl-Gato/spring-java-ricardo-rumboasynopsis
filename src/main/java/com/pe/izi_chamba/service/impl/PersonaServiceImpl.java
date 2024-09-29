package com.pe.izi_chamba.service.impl;

import com.pe.izi_chamba.model.entity.Persona;
import com.pe.izi_chamba.model.repository.PersonaRepository;
import com.pe.izi_chamba.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    public Persona getById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public void save(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void update(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }
}
