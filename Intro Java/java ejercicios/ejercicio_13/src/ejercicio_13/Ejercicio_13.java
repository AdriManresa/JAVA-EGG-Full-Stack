/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int suma;
        suma=0;
         System.out.println("Ingresa un numero");
         int limite_inicial =read.nextInt();
         
        while (limite_inicial > suma) {            
            System.out.println("Ingresa otro numero");
            int num = read.nextInt();
            
          suma=num+suma;
        }
        System.out.println("Se alcanzo el limite inicial");   
    }
    
    
    
}
