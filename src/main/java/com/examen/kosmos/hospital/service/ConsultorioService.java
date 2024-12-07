package com.examen.kosmos.hospital.service;

import com.examen.kosmos.hospital.model.Consultorio;
import com.examen.kosmos.hospital.model.Doctor;
import org.springframework.stereotype.Service;

@Service
public class ConsultorioService {
    public Consultorio createConsultorio(Consultorio consultorio){
        //consultorios.add(consultorio);
        return consultorio;
    }
}
