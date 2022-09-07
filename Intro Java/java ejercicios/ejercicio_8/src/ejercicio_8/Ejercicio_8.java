/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java*/
    
    public static void main(String[] args) {
    
        Scanner read= new Scanner (System.in);
        
        System.out.println("Ingresa una frase");
        
        String frase =read.next();
        
        if (frase.equals("eureka")) {              /*Compara la cadena de texto contra un objeto. 
                                                      Devolverá true si las cadenas comparadas son iguales. 
                                                               En caso contrario devolverá false.*/
        System.out.println("Correcto");
            
        }
        else
            System.out.println("Incorrecto");
        
         {
            
        }
        
        
        
    }
}
