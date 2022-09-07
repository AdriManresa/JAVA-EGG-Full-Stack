/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java*/
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        int tamanio;
        tamanio=0;
                
        System.out.println("Ingresa una frase");
        String frase = read.next();
        
        tamanio=frase.length();
        
      
        
        if (tamanio == 8) {
            System.out.println("Correcto, la frase tiene un tamaño de 8 carcateres");

        } else if (tamanio < 8) {
            System.out.println("Incorrecto, la frase debe inclñuir 8 caracteres");
        }
        {

        }

    }

}
