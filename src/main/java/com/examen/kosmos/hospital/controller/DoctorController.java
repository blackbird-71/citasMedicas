package com.examen.kosmos.hospital.controller;

import com.examen.kosmos.hospital.model.Doctor;
import com.examen.kosmos.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctores")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<Doctor> createUser(@RequestBody Doctor doctor){
        return new ResponseEntity<Doctor>(doctorService.createDoctor(doctor), HttpStatus.CREATED);
    }

}
