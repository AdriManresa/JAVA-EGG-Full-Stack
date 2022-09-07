/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        int centigrados;
        int Fahrenheit;
        
        Scanner read =new Scanner (System.in);
        
        System.out.println("Ingresa los grados en centigrados");
         centigrados = read.nextInt();
         
         Fahrenheit=32+(9*centigrados/5);
         
         System.out.println("los grados centigrados en grado Fahrenheit es "+ Fahrenheit);
         
         
         
        
    }
    
}
