/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_22;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el tamaño del arreglo");
        int n = read.nextInt();
        int[] vector;
        vector = new int[n];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        llenar(vector, n);
        mostrar(vector, n);

        //calcula los digitos
        for (int i = 0; i < n; i++) {
            if (vector[i]/10 <1) {
                cont1++;
            }
            else if(vector[i]/100 <1){
                cont2++;
            }
            else if (vector[i]/1000 <1){
                cont3++;
            }
            else if (vector[i]/10000 <1){
                cont4++;
            }
            else if (vector[i]/100000 <1)
                cont5++;
        }
       
            System.out.println("El vector quedo cargado "+cont1+" numeros de un digito");
            System.out.println("El vector quedo cargado "+cont2+" numeros de dos digito");
            System.out.println("El vector quedo cargado "+cont3+" numeros de tres digito");
            System.out.println("El vector quedo cargado "+cont4+" numeros de cuatro digito");
            System.out.println("El vector quedo cargado "+cont5+" numeros de cinco digito");
    }

    //llenar arreglo
    public static void llenar(int vector[], int n) {

        for (int i = 0; i < n; i++) {
            int aleat = (int) (Math.random() * 99999);
            vector[i] = aleat;
        }

    }

    //mostrar vector
    public static void mostrar(int vector[], int n) {
        System.out.println("************");
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("************");
    }

}
