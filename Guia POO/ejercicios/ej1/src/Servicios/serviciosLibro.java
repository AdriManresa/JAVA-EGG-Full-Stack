/*aca se debe encontrar las funciones que debe realizar el programa*/
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class serviciosLibro {

    private final Scanner read = new Scanner(System.in);

    public Libro crearLibro() {
        /*traigo el objeto libro*/
        Libro l1 = new Libro();

        System.out.println("Ingresa el nombre del autor");
        l1.setAutor(read.next());
        System.out.println("Ingresa el titulo del libro");
        l1.setNombreLibro(read.next());
        System.out.println("Ingresa el ISBN");
        l1.setISBN(read.nextInt());
        System.out.println("Ingresa la cantidad de paginas");
        l1.setNumPaginas(read.nextInt());
        return l1;
    }

    public void mostrarLibro(Libro l1) {
        System.out.println("El nombre del libro es "+ l1.getNombreLibro());     
        System.out.println("El nombre del autor es "+ l1.getAutor());     
        System.out.println("La cantidad de paginas que tiene es "+ l1.getNumPaginas());     
        System.out.println("El ISBN es "+ l1.getISBN());     
    }
}
