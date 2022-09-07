/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_17;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del cuadrado");
        int n = read.nextInt();

        if (n >= 0 && n <= 50) {
            //linea superior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            //salto de linea
            System.out.println();

            //centro de la forma
            for (int i = 0; i < n - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

                //linea inferior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }

        }
    }

}
