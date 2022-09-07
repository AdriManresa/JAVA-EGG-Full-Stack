/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String primeraletra;
       

        System.out.println("Ingresa una frase");
        String frase = read.nextLine();

        primeraletra= frase.substring(0, 1);

        
        if (primeraletra.equals("a")) {
            
            System.out.println("Correcto");
            
            
        } else{
            System.out.println("Incorrecto");
    }
    }
}
