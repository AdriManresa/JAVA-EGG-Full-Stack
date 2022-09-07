/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        System.out.println("Ingresa el Año");
        anio = read.nextInt();
        System.out.println("Ingresa el Mes");
        mes = read.nextInt();
        System.out.println("ingrese el Dia");
        dia = read.nextInt();

        LocalDate primeraFecha = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        System.out.println("La primera fecha  es " + primeraFecha);
        System.out.println("La fecha actual es " + fechaActual);
        
        
        Period periodo = Period.between(primeraFecha, fechaActual);
        
        System.out.println("Diferencia de: "+periodo.getYears()+" años");
        System.out.println("Diferencia de: " + periodo.getMonths()+" meses");
        System.out.println("Diferencia de: "+ periodo.getDays()+" dias");

    }

}
