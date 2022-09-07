/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosRectangulo {

    private final Scanner read = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        /*crea un objeto*/
        Rectangulo Rec1 = new Rectangulo();
        System.out.println("Ingresa la Base y la Altura del Rectangulo");
        Rec1.setBase(read.nextInt());
        Rec1.setAltura(read.nextInt());
        return Rec1;
    }

    /*Calcular superfiecie*/
    public int superficieRectangulo(Rectangulo Rec1) {
        int superficie = Rec1.getAltura() * Rec1.getBase();

        System.out.println("La superficie del rectangulo es " + superficie);
        return superficie;

    }

    /*calcular perimetro*/
    public int perimetroRectangulo(Rectangulo Rec1) {
        int perimetro = (Rec1.getAltura() + Rec1.getBase()) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
        return perimetro;
    }

    /*Dibujar rectangulo*/
    public void dibujarRectangulo(Rectangulo Rec1) {
        System.out.println("Rectangulo dibujado ");
        for (int i = 0; i < Rec1.getAltura(); i++) {
            for (int j = 0; j < Rec1.getBase(); j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*Dibujar rectangulo vacio*/
    public void dibujarRectanguloVacio(Rectangulo Rec1) {
        System.out.println("Rectangulo dibujado vacio ");
        
        /*linea superior*/
        for (int i = 0; i < Rec1.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println();
        /*Centro forma*/
        for (int i = 0; i < Rec1.getAltura() ; i++) {
            System.out.print("*");
            for (int j = 0; j < Rec1.getAltura() ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        /*Linea inferioro*/
        for (int i = 0; i < Rec1.getBase(); i++) {
            System.out.print("*");
        }
    }

}
