/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematicas;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosMatematicas {

    private final Scanner read = new Scanner(System.in);
    /*Limita los decimales*/
    DecimalFormat df = new DecimalFormat("#.00");
    Matematicas mat = new Matematicas();

    public void mostrarMenu(Matematicas mat) {
        System.out.println("1-Generar Numeros");
        System.out.println("2-¿Cual es mayor?");
        System.out.println("3-Potencia");
        System.out.println("4-Calcular Raiz");
        System.out.println("5-Salir");
    }

    public void devolverMayor(Matematicas mat) {
        double mayor = Math.max(mat.getNum1(), mat.getNum2());
        System.out.println("El numero mayor es " + mayor);
    }

    public void calcularPotencia(Matematicas mat) {
        double num1 = mat.getNum1();
        double num2 = mat.getNum2();

        double r1 = Math.round(num1);
        double r2 = Math.round(num2);
        double mayor = Math.max(r1, r2);
        double menor = Math.min(r2, r1);

        double potencia;

        potencia = Math.pow(mayor, menor);

        System.out.println("el numero mayor " + mayor + " elevado al numero menor " + menor + " es " + potencia);
    }

    public void calculaRaiz(Matematicas mat) {
        double menor = Math.min(mat.getNum1(), mat.getNum2());
        menor = Math.abs(menor);
        double raiz = Math.sqrt(menor);
        System.out.println("La raiz cuadrada del numero menor " +menor+ " Es "+raiz);

    }
}
