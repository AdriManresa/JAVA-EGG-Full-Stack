/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosPuntos {

    private final Scanner read = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos p = new Puntos();
        System.out.println("Ingresa dos numeros para 1");
        p.setX1(read.nextInt());
        p.setY1(read.nextInt());
        System.out.println("Ingresa dos numeros para 2");
        p.setX2(read.nextInt());
        p.setY2(read.nextInt());
        return p;
    }

    public void calcularDistancia(Puntos p) {
        double sumaResta = (p.getX2() - p.getX1()) + (p.getY2() - p.getY1());
        double distancia = Math.pow(sumaResta, 2);

        System.out.println("la distacia es de:  " + distancia);
    }
}
