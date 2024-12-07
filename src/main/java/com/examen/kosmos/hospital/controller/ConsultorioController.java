package com.examen.kosmos.hospital.controller;

import com.examen.kosmos.hospital.model.Consultorio;
import com.examen.kosmos.hospital.model.Doctor;
import com.examen.kosmos.hospital.service.ConsultorioService;
import com.examen.kosmos.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultorios")
public class ConsultorioController {
    @Autowired
    private ConsultorioService consultorioService;

    @PostMapping
    public ResponseEntity<Consultorio> createConsultorio(@RequestBody Consultorio consultorio){
        return new ResponseEntity<Consultorio>(consultorioService.createConsultorio(consultorio), HttpStatus.CREATED);
    }
}
