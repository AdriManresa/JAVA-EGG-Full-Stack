/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    /*Crear un programa que dado un numero determine si es par o impar*/
    public static void main(String[] args) {
         Scanner read =new Scanner (System.in);
         
         System.out.println("Escribe un numero");
         int num =read.nextInt();
         
         if (num % 2 == 0) {
             System.out.println("El numero " + num + " es par" );
                  
        }
         else{
             System.out.println("El numero "+ num +" es impar");
         }
    }

}
