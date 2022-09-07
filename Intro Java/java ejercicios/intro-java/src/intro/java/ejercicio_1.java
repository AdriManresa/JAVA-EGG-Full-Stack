package intro.java;

import java.util.Scanner;

public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    
    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma
      de los dos. El programa deberá después mostrar el resultado de la suma*/
    
    public static void main(String[] args) {

     int numero1;
     int numero2;
     int sumaTotal;
     
     Scanner scanner = new Scanner(System.in));
    
    //almacena el primer numero
     System.out.println("Ingresa el primer numero para sumar");
     numero1=scanner.nextInt();
     //almacena el segundo numero
     System.out.println("Ingresa el segundo numero para sumar");
     numero2=scanner.nextInt();
     
     //relizar la suma
     
     sumaTotal=numero1+numero2;
     
        System.out.println("La suma de los dos numerops insertados es "+ sumaTotal);
        
        
        
    }
    
}
