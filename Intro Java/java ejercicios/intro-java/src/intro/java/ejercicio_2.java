/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.*/
    public static void main(String[] args) {
        
        try (//variable scanner para leer datos
		Scanner scanner = new Scanner(System.in)) {
			//variale de tipo cadena (string)
			String nombre;
			
			System.out.println("Escribe tu nombre");
			
			nombre=scanner.next();
			
			System.out.println("Hola! "+ nombre);
		}
    }
    
}
