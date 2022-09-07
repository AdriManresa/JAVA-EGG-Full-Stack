/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosOperacion {

    private final Scanner read = new Scanner(System.in);

    public Operacion crearOprecion() {
        /*crea un objeto*/
        Operacion oP1 = new Operacion();
        System.out.println("Ingresa dos Números");
        oP1.setNumero1(read.nextInt());
        oP1.setNumero2(read.nextInt());
        return oP1;
    }

    public int suma(Operacion oP1) {
        int suma = oP1.getNumero1() + oP1.getNumero2();

        System.out.println("La suma del numero "+ oP1.getNumero1()+" y del numero " + oP1.getNumero2()+" es "+ suma);
        return suma;

    }

    public int resta(Operacion oP1) {
        int resta = oP1.getNumero1() - oP1.getNumero2();

        System.out.println("La resta del numero "+ oP1.getNumero1()+" y del numero " + oP1.getNumero2()+" es "+ resta);
        return resta;
    }

    public int multiplicar(Operacion oP1) {
        int multiplicar=1;
        
        if (oP1.getNumero1() == 0 || oP1.getNumero2()== 0) {
            System.out.println("Se a multiplicado por cero,por ende todo resultado dara 0");
            multiplicar=0;
        }else
            multiplicar=oP1.getNumero1() * oP1.getNumero2();
        System.out.println("La multiplicacion del numero "+ oP1.getNumero1()+" y del numero " + oP1.getNumero2()+" es "+ multiplicar);
       return multiplicar;

    }
        public int dividir(Operacion oP1) {
        int dividir=1;
        
        if (oP1.getNumero1() == 0 || oP1.getNumero2()== 0) {
            System.out.println("Se a dividido por cero,por ende todo resultado dara 0");
            dividir=0;
        
        }else
            dividir=oP1.getNumero1() / oP1.getNumero2();
            
        System.out.println("La divicion del numero "+ oP1.getNumero1()+" y del numero " + oP1.getNumero2()+" es "+ dividir);
        

        return dividir;
    }
}

