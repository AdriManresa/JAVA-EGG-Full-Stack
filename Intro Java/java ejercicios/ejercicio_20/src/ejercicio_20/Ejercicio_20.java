/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_20;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
          int[] arreglo =new int[100];
          
         
         for (int i = 0; i < 100; i++) {
            arreglo[i]=i +1;
        }
        System.out.println("Contenido del arreglo");
        
        //invertir arreglo
        for (int i = 99; i > 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
    
}
