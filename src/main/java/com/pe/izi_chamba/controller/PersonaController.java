package com.pe.izi_chamba.controller;

import com.pe.izi_chamba.model.entity.Persona;
import com.pe.izi_chamba.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping
    ResponseEntity<Persona> save(@RequestBody Persona persona) {
        personaService.save(persona);
        return ResponseEntity.ok(persona);
    }
}
