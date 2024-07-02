package com.andyg.odontologo.controller;

import com.andyg.odontologo.entity.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class patientController {

    @GetMapping("/list")
    @ResponseBody
    public List<Patient> List1(){

        //simulo la BD con una lista
        List<Patient> patientList = new ArrayList<Patient>();
        patientList.add(new Patient(1L, "12334567-8", "Jose", "Martinez", LocalDate.of(2016,8,18)));
        patientList.add(new Patient(2L, "23456789-0", "Juan", "Rodriguez", LocalDate.of(1997,12,24)));
        patientList.add(new Patient(3L, "43265476-5", "Andres", "Soto", LocalDate.of(2001,1,23)));
        patientList.add(new Patient(4L, "89078967-8", "Antonio", "Perez", LocalDate.of(2018,4,12)));
        patientList.add(new Patient(5L, "23465456-7", "Joaquin", "Pereira", LocalDate.of(1995,8,6)));
        patientList.add(new Patient(6L, "11223344-5", "Andres", "Ochoa", LocalDate.of(2010,2,28)));

        return patientList;
    }

    @GetMapping("/menores")
    @ResponseBody
    public List<Patient> List2(){

        //simulo la BD con una lista
        List<Patient> patientList = new ArrayList<Patient>();
        patientList.add(new Patient(1L, "12334567-8", "Jose", "Martinez", LocalDate.of(2016,8,18)));
        patientList.add(new Patient(2L, "23456789-0", "Juan", "Rodriguez", LocalDate.of(1997,12,24)));
        patientList.add(new Patient(3L, "43265476-5", "Andres", "Soto", LocalDate.of(2001,1,23)));
        patientList.add(new Patient(4L, "89078967-8", "Antonio", "Perez", LocalDate.of(2018,4,12)));
        patientList.add(new Patient(5L, "23465456-7", "Joaquin", "Pereira", LocalDate.of(1995,8,6)));
        patientList.add(new Patient(6L, "11223344-5", "Andres", "Ochoa", LocalDate.of(2010,2,28)));

        List<Patient> listaMenores = new ArrayList<Patient>();


        for(Patient pat : patientList){
            LocalDate hoy = LocalDate.now();

            Period cantidadDeAnios = Period.between(pat.getFnac(), hoy);
            //Evaluo que la fecha de nacimeento del paciente sea menor a 18 anios
            if(cantidadDeAnios.getYears()<18){
                System.out.println("cantida de anios " + cantidadDeAnios.getYears());
                listaMenores.add(pat);
            }
        }


        return listaMenores;
    }






}


