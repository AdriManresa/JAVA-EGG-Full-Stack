/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String cadena;
        cadena = "";
        int correcto;
        int cont = 0;
        int cont2 = 0;

        do {
            System.out.println("Ingresa una cadena");
            cadena = read.next();
            if (cadena.length() == 5 && "x".equals(cadena.substring(0, 1)) && "o".equals(cadena.substring(4, 5))) {
                System.out.println("la cadena es " + cadena);
                cont++;
            } else {
                System.out.println("La cadena no es valida");
                cont2++;
            }
            if (cadena.contains("&&&&&")) {
                System.out.println("Salida");
            }
            
        } while (!cadena.equals("&&&&&"));

        
        System.out.println("Usted finalizo los envios");
        System.out.println("La cantidad correcta de envios es "+ cont);
        System.out.println("La cantidad incorrecta de envios es "+ (cont2 -1));
    }

}
