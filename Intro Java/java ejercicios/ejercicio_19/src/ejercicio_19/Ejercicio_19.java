/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_19;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    /*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
    public static void main(String[] args) {
        // TODO code application logic here10
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.println("Introduce la cantidad de euros que deasea convertir");
        
        int euros = read.nextInt();
        String moneda="";
        do {
              System.out.println("Indica a que moneda desea conertir(dolar,yen,libra)");
        moneda = read.next();
        
        if (moneda.toLowerCase().equals("libra")) {
            convertirLibra(euros, moneda);
        }
        
        if (moneda.toLowerCase().equals("dolar")) {
                convertirDolares(euros, moneda);
            }
        
        if (moneda.toLowerCase().equals("yen")) {
            convertirYen(euros, moneda);
        }
        
        } while (!moneda.equals("libra") && !moneda.equals("dolar" ) && !moneda.equals("yen") );
        
      

    }

    public static void convertirLibra(int euro, String moneda) {
        double libras = 0;
        libras = (euro * 0.86);
        System.out.println("Las libras son $ " + libras);

    }

    public static void convertirDolares(int euro, String moneda) {
        double dolares = 0;
        dolares = (euro * 1.28611);
        System.out.println("Los dolares son $ " + dolares);

    }
    public static void convertirYen(int euro,String moneda) {
        double yen = 0;
        yen = (euro * 1.28611);
        System.out.println("Los yenes son $ " + yen);
    }
}
