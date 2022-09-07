/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosPersona {

    Scanner read = new Scanner(System.in);
    Persona pers = new Persona();

    public Persona crearPersona(Persona pers) {
        System.out.println("Ingresa tu nombre");
        pers.setNombre(read.next().toLowerCase());
        System.out.println("Ingresa el Año");
        pers.setAnio(read.nextInt());
        System.out.println("Ingresa el Mes");
        pers.setMes(read.nextInt());
        System.out.println("ingrese el Dia");
        pers.setDia(read.nextInt());
        pers.setFechaCumple(LocalDate.of(pers.getAnio(), pers.getMes(), pers.getDia()));
        return pers;
    }

    public void calcularEdad(Persona pers) {
        LocalDate fechaCumple = pers.getFechaCumple();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaCumple, fechaActual);

        pers.setEdad(periodo.getYears());

    }

    public boolean menorQue(Persona pers, int edad) {
        System.out.println("Ingresa una edad");
        edad = read.nextInt();
        boolean bool;
        return edad >= pers.getEdad();
    }

    public void mostrarPersona(Persona pers) {
        System.out.println("Nombre "+ pers.getNombre());
        System.out.println("su edad es de: " + pers.getEdad() + " años");
        System.out.println("su fecha de nacimiento es: " + pers.getFechaCumple());
    }
}
