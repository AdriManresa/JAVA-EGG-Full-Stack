/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    /*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla*/
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner read =new Scanner (System.in);
         
         System.out.println("Ingresa el primer numero");
         int num1 = read.nextInt();
        
         System.out.println("Ingresa el segundo numero");
         int num2 = read.nextInt();
         
         if (num1 > num2) {
             System.out.println("El numero mayor es "+ num1);
             
        }
         else if (num2 > num1) {
             System.out.println("El numero mayor es "+ num2);
        }
    }
    
}
