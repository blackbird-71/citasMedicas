package com.examen.kosmos.hospital.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String fecha;
    private String hora;
    private String motivo;
    /*
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
     */
}
