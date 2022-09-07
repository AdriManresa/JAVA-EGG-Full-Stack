/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_18;

import com.sun.org.apache.xml.internal.security.encryption.XMLCipher;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 ***/
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);

        System.out.println("Ingresa cuatro numero entre en 1 y el 20");
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        int n3 = read.nextInt();
        int n4 = read.nextInt();

        //numero 1
        if (n1 <= 20) {
            System.out.print(n1 + " = ");
            for (int i = 0; i < n1; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El numero Ingresado es invalido");

        }
        System.out.print(" ");

        //numero 2
        if (n1 <= 20) {
            System.out.print(n2 + " = ");
            for (int i = 0; i < n2; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El numero Ingresado es invalido");

        }
        System.out.print(" ");
        //numero 3
        if (n1 <= 20) {
            System.out.print(n3 + " = ");
            for (int i = 0; i < n3; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El numero Ingresado es invalido");

        }
        System.out.print(" ");
        //numero 4
        if (n1 <= 20) {
            System.out.print(n4 + " = ");
            for (int i = 0; i < n4; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El numero Ingresado es invalido");

        }
        System.out.print(" ");
    }
}
