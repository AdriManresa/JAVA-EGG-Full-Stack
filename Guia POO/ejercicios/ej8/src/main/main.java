package main;

import Entidades.Cadena;
import Servicios.serviciosCadena;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        serviciosCadena servCad = new serviciosCadena();

        Cadena cad1 = new Cadena();

        /*MENU*/
        servCad.mostrarMenu(cad1);
        int option;
        option = read.nextInt();
        while (option != 9) {
            switch (option) {

                case 1:
                    System.out.println("ingresa una frase");
                    cad1 = servCad.crearCadena();
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 2:
                    servCad.mostrarVocales(cad1);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 3:
                    servCad.invertirFrase(cad1);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese una letra");
                    String letra = read.next();
                    servCad.vecesRepetido(cad1, letra);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 5:
                    System.out.println("Ingresa una nueva frase");
                    String frase2 = read.nextLine();
                    servCad.compararLongitud(cad1, frase2);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 6:
                    String frase3 = read.nextLine();
                    servCad.unirFrases(cad1, frase3);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 7:
                    System.out.println("Ingresa un caracter para remplzar la letras 'A' ");
                    char remplazo = read.next().charAt(0);
                    servCad.reemplazar(cad1, remplazo);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                    break;
                case 8:
                    System.out.println("Ingrese una letra para buscar en la frase");
                    String letra3=read.next();
                    servCad.contiene(cad1, letra3);
                    servCad.mostrarMenu(cad1);
                    option = read.nextInt();
                case 9:
                    break;
            }
        }
    }

}
