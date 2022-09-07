/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Arrays;

/**
 *
 * @author Adri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] A = new double[50];
        double[] B = new double[20];

        llenarVectorA(A);
        Arrays.sort(A);
        System.out.println("Array A");
        mostrarArray(A);

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                B[i] = A[i];
            }else{
                B[i]=0.5;
            }
        }
        System.out.println("-------------");
        System.out.println("Array B");
        mostrarArray(B);
        System.out.println("-------------");
    }

    public static void llenarVectorA(double[] A) {
        for (int i = 0; i < 50; i++) {
            A[i] = (int) (Math.random() * 50);
        }
    }

    public static void mostrarArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }
    }

}
