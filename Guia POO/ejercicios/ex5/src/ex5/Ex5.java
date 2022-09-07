/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String mes[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto;
        int n = (int)(Math.random()*12);
        mesSecreto = mes[n];
        

        System.out.println(n);
        do {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
            String intento = read.next();
            
            if (intento.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            }
            else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes"); 
                break;
            }
        } while (true);

    }

}
