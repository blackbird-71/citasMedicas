package com.examen.kosmos.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity
public class Doctor extends Persona {
    private String especialidad;

    public Doctor() {
    }

    public Doctor(Integer id, String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad) {
        super(id, nombre, apellidoPaterno, apellidoMaterno);
        this.especialidad = especialidad;
    }
}
