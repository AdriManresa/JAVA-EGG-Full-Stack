/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        
    
        int num;
        num=-1;
        int suma;
        suma=0;        
        for (int i = 0; i < 20; i++) {
            if (num == 0) {
               break;
            }
            if (num > 0) {
             suma=suma + num;
            }
           System.out.println("Ingresa un numero");
        num=read.nextInt();
        }
        System.out.println("Se capturó el numero cero");
        System.out.println("La suma de los numeros ingresados es "+ suma);
        
    }
    
}
