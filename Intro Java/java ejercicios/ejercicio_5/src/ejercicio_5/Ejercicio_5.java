/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
    public static void main(String[] args) {
        // TODO code application logic here
        int raizcuadrada;
        int doble;
        int triple;
        
        Scanner read =new Scanner (System.in);
        
        System.out.println("Ingresa un numero");
         int numero = read.nextInt();
         
         doble=numero*2;
         triple=numero*3;
         
         
        
        
        System.out.println("la raiz cudrarda es "+ Math.sqrt(numero) );
        System.out.println("El doble es " + doble);
        System.out.println("El triple es "+ triple );
        
         
         
      
         
        
    }
    
}
