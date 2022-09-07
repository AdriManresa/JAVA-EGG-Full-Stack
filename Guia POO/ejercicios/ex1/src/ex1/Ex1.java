/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        Cancion c =new Cancion();
        
        System.out.println("introduce el nombre del autor");
        c.setAutor(read.next());
        System.out.println("Ingresa el nombre de la cancion");
        c.setTitulo(read.next());
        
        System.out.println("El nombre del autor es: " +c.getAutor() );
        System.out.println("El nombre de la cancion es: " +c.getTitulo() );
    }
    
}
