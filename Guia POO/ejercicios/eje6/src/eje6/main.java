package eje6;

import Entidades.Cafetera;
import Servicios.serviciosCafetera;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        serviciosCafetera servCafe = new serviciosCafetera();
        Cafetera cafetera = servCafe.llenarCafetera();
        servCafe.mostrarMenu();
        int option;
        option = read.nextInt();
        while (option != 7) {
            switch (option) {
                case 1:
                    System.out.println("Su cafetera ha sido creada");
                    servCafe.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 2:
                    servCafe.llenarCafetera();
                    servCafe.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese la capacidad de la taza: ");
                    System.out.println("1-pequeño");
                    System.out.println("2-mediano");
                    System.out.println("2-grande");
                    int tamaño = read.nextInt();
                    servCafe.servirTaza(cafetera, tamaño);
                    servCafe.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese la cantida de café a agregar: ");
                    int cant = read.nextInt();
                    servCafe.agregarCafe(cafetera, cant);
                    servCafe.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 5:
                    int actual = servCafe.capacidadActual(cafetera);
                    System.out.println("La cantidad actual es: " + actual);
                    servCafe.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 6:
                    servCafe.vaciarCafetera(cafetera);
                    servCafe.mostrarMenu();
                    option = read.nextInt();
                    break;
            }
        }
    }

}
