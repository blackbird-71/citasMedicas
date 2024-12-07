package com.examen.kosmos.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity
public class Paciente extends Persona{
    private String edad;
    private String sexo;

    public Paciente() {
        super();
    }

    public Paciente(Integer id, String nombre, String apellidoPaterno, String apellidoMaterno, String edad, String sexo) {
        super(id, nombre, apellidoPaterno, apellidoMaterno);
        this.edad = edad;
        this.sexo = sexo;
    }
}
