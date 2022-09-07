/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú*/
    public static void main(String[] args) {
        // TODO code application logic here
        int select;
        int num1;
        int num2;
        int suma;
        int resta;
        int multi;
        int div;
        String salir;
        salir="";


          Scanner read = new Scanner(System.in);
            System.out.println("Ingresa dos numeros enteros positivos");
            num1 = read.nextInt();
            num2 = read.nextInt();
        do {
            //MENU
            System.out.println("---MENU---");
            System.out.println("Selecciona una opcion");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("-----------");
            select = read.nextInt();

            switch (select) {

                case 1:
                    suma = num1 + num2;
                    System.out.println("SUMA");
                    System.out.println("La suma de los numeros es " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("RESTA");
                    System.out.println("La resta es " + resta);
                    break;
                case 3:
                    multi = num1 * num2;
                    System.out.println("MULTIPLICACION");
                    System.out.println("La multiplicacion es " + multi);
                    break;
                case 4:
                    div = num1 / num2;
                    System.out.println("DIVISION");
                    System.out.println("La Division es "+div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   salir= read.next();
                   break;

            }

        } while (!salir.equals("s")) ;
        System.out.println("Fin");
    }

}
