/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Matematicas;
import Servicios.serviciosMatematicas;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        serviciosMatematicas servMat = new serviciosMatematicas();
        Matematicas mat = new Matematicas();

        /*MENU*/
        servMat.mostrarMenu(mat);
        int option;
        option = read.nextInt();
        while (option != 5) {
            switch (option) {
                case 1:
                    mat.setNum1(Math.random() * 100);
                    mat.setNum2(Math.random() * 100);
                    System.out.println("Se genero el numero " + mat.getNum1());
                    System.out.println("Se genero el numero " + mat.getNum2());
                    servMat.mostrarMenu(mat);
                    option = read.nextInt();
                    break;
                case 2:
                    servMat.devolverMayor(mat);
                    servMat.mostrarMenu(mat);
                    option = read.nextInt();
                    break;
                case 3:
                    servMat.calcularPotencia(mat);
                    servMat.mostrarMenu(mat);
                    option = read.nextInt();
                    break;
                case 4:
                    servMat.calculaRaiz(mat);
                    servMat.mostrarMenu(mat);
                    option = read.nextInt();
                    break;
                    case 5:
                        break;
            }
        }
    }

}
