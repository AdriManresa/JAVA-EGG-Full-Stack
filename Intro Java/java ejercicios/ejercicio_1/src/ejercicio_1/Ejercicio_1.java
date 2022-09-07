/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    
    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        Scanner scanner= new Scanner(System.in);
        
        //almacena el numero
        System.out.println("Ingresa el primer numero");
        numero1=scanner.nextInt();
        
        //almacena segundo numero
        System.out.println("Ingresa el segundo numero");
        numero2=scanner.nextInt();
        
        //realizar suma
        
        suma=numero1+numero2;
        
        System.out.println("La suna de los numeros es; " + suma);
        
    }
    
}
