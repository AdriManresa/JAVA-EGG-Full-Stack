/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosCafetera {

    private final Scanner read = new Scanner(System.in);

    public Cafetera llenarCafetera() {

        Cafetera cafetera = new Cafetera();

        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());

        return cafetera;
    }

    public void mostrarMenu() {
        System.out.println("MENU:");
        System.out.println("1)Ingresar Cafetera");
        System.out.println("2)Llenar Cafetera");
        System.out.println("3)Servir taza");
        System.out.println("4)Agregar Café");
        System.out.println("5)Cantidad actual");
        System.out.println("6)Vaciar Cafetera");
        System.out.println("7)Salir");
    }

    public int servirTaza(Cafetera cafetera, int tamaño) {

        switch (tamaño) {
            case 1:
                tamaño = 250;
                cafetera.setCapacidadMaxima(tamaño);
            case 2:
                tamaño = 350;
                cafetera.setCapacidadMaxima(tamaño);
            case 3:
                tamaño = 500;
                cafetera.setCapacidadMaxima(tamaño);
        }
        if (tamaño <= cafetera.getCantidadActual()) {
            System.out.println("se lleno su taza");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamaño);
        } else {
            System.out.println("Su taza fue llenada con lo que quedaba de cafe xD " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        }
        return tamaño;
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public int agregarCafe(Cafetera cafetera, int cafe) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        System.out.println("La cantidad de cafe actual es de" + cafetera.getCantidadActual());
        return cafe;

    }

    public int capacidadActual(Cafetera cafetera) {        
        System.out.println("La cantidad de cafe actual es de" + cafetera.getCantidadActual());

        return cafetera.getCantidadActual();
    }
}
