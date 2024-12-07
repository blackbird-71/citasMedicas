package com.examen.kosmos.hospital.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
}
