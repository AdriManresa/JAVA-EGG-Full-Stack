/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_21;

import java.util.Scanner;
import javafx.scene.control.ButtonType;

/**
 *
 * @author Adri
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido*/
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner read = new Scanner(System.in);
          boolean ok=false;
          
          int max=10;
          int min =0;
          
          
          
          System.out.println("Introduce el tamaño del arreglo");
          int n = read.nextInt();
          int [] arreglo =new int[n];
          //llenar arreglo
          for (int i = 0; i < n; i++) {
            int aleat = (int) (Math.random()*(9+1));
              arreglo[i]=aleat;  
        }
           //mostrar arreglo
           System.out.println("************");
          for (int i = 0; i < n; i++) {
              System.out.println(arreglo[i]);
        }
          //busqueda
          System.out.println("Ingresa el valor que desea buscar");
          int busq =read.nextInt();
          
          for (int i = 0; i < n; i++) {
              if (busq == arreglo[i]) {
                  System.out.println("Se encuentra "+ busq + " en la posicion " + i);
                  break;
              }
              else  {
                  ok=true;
              }
        }
         if (ok) {
             System.out.println(busq +" No se encuentra en ninguna posicion");
        }
 
          
          
         
        
    }
    
}
