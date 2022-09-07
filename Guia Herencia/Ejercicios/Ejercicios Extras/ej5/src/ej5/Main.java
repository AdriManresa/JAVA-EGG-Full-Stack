package ej5;

import java.util.Scanner;

public class Main {

    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int numeroAletoreo = (int) Math.floor(Math.random() * 500 + 1);
        
        System.out.println(numeroAletoreo);
        
        int n,cont = 0;
        
        boolean flag =false;
        
        do {
            try {
                System.out.println("Ingresa un numero a adivinar");
                
                n = read.nextInt();
                
                if (numeroAletoreo == n) {
                    System.out.println("¡Usted a Adivinado el numero!");
                    
                    System.out.println("usted lo intento  " + cont +" veces");
                    
                    flag = true;
                }else{
                    
                    if (n > numeroAletoreo) {
                        System.out.println("El numero ingresado es mayor al numero a adivinar");
                    }else{
                        System.out.println("El numero ingresado es menor al numero a adivinar");
                    }
                    cont++;
                }
                  
                
                
            } catch (Exception e) {
                System.out.println("Error "+ e.toString());
                System.out.println("Por favor ingrese un numero");
                read.next();
                
                cont++;
                     
            }
            
            
            
            
            
            
        } while (!flag);
        
    }

}
