package com.andyg.odontologo.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Patient {

    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate Fnac;

    public Patient(){

    }

    public Patient(Long id, String dni, String nombre, String apellido, LocalDate Fnac){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Fnac = Fnac;
    }


}
