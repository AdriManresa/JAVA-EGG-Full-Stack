/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Adri
 */
public class Persona {
/*Parametro*/
    String nombre;
    LocalDate fechaCumple;
    LocalDate fechaActual;
    int edad;
    int dia;
    int mes;
    int anio;

    /*Constructor Vacio*/
    public Persona() {
    }

    /*Constructor*/
    public Persona(String nombre, LocalDate fechaCumple, LocalDate fechaActual, int edad, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.fechaCumple = fechaCumple;
        this.fechaActual = fechaActual;
        this.edad = edad;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    /*GETTER AND SETTER*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(LocalDate fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    







}
