/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Servicios.serviciosPuntos;
import Entidades.Puntos;

/**
 *
 * @author Adri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviciosPuntos sP= new serviciosPuntos();
        Puntos p = sP.crearPuntos();
        sP.crearPuntos();
        sP.calcularDistancia(p);
    }
    
}
