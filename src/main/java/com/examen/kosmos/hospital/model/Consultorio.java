package com.examen.kosmos.hospital.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Consultorio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idConsultorio;
    private Integer piso;

}
