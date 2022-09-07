/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.Persona;
import Servicios.serviciosPersona;

/**
 *
 * @author Adri
 */
public class Main {

    public static void main(String[] args) {

        serviciosPersona serP = new serviciosPersona();
        Persona pers =new Persona();
        serP.crearPersona(pers);
        serP.calcularEdad(pers);
        System.out.println("La edad es menor: "+serP.menorQue(pers, 0));
        serP.mostrarPersona(pers);
    }
    
}
