/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_23;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];

        //llenar matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int aleat = (int) (Math.random() * 9);
                matriz[i][j] = aleat;
            }
        }
        //matris transpuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        //mostrar matriz
        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        //mostrar matriz transpuesta
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizT[i][j]+"\t");
            }
             System.out.println("");
        }
       
    }

}
