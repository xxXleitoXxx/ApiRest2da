package com.example.inicial1.controllers;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/personas")
@RequestMapping(path = "api/v1/Personas")
public class PersonaController extends BaseControlerImpl<Persona,PersonaServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity <?> search(@RequestParam String filtro) {
        try {
        return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \""+e.getMessage()+"\"}"));

        }
    }
}