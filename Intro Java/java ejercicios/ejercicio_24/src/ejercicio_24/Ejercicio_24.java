/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_24;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    
    /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        
        //llenar matriz
        for (int i = 0; i < 3; i++) {
            System.out.println("ingresa los datos de las filas"+(i+i));
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = read.nextInt();
            }
        }
         //matris transpuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        if (matriz[i][j]) {
            
        }
    } 
}
