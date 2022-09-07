/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juevesdejava;

/**
 *
 * @author Adri
 */
public class Juevesdejava {

    /*Java | Find duplicates - Implementa el método findDuplicates que devuelve una nueva lista que contiene duplicados que ocurrieron N veces.*/
    public static void main(String[] args) {

        System.out.println(calcularLetra());
    }

    static char calcularLetra() {
        int DNI = 0;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        return letras[(int) DNI % 23];
        
    }
}
