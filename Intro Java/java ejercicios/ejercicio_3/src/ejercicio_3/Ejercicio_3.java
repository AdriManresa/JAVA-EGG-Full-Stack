/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Adri
 */

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingresa una frase");
        
        String frase = leer.nextLine();
        
        System.out.println(""+frase.toLowerCase());
        System.out.println(""+frase.toUpperCase());
        
    }
    
}
