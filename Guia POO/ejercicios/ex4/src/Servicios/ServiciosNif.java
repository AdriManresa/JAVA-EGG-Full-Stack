/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class ServiciosNif {

    private final Scanner read = new Scanner(System.in);

    public NIF crearNif() {
        NIF nif = new NIF();
        do {
            System.out.print("Introduce dni: ");
            nif.setDNI(read.nextLong());
        } while (nif.getDNI() <= 0);
        nif.setLetra(calcularLetra(nif));
        return nif;
    }

    private char calcularLetra(NIF nif) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[(int) nif.getDNI() % 23];
    }

    public void mostrar(NIF nif) {
        System.out.println(nif.getDNI()+"-"+nif.getLetra());
    }
}
