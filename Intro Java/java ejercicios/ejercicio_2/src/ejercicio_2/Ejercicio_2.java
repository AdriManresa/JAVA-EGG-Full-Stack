/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;


/**
 *
 * @author Adri
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola! "+ nombre);
    }
    
}
