/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    
    /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese un nota");
        int nota = read.nextInt();
        
                while (nota < 0 || nota > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = read.nextInt();

        }
                System.out.println("Nota correcta");
    }

}
