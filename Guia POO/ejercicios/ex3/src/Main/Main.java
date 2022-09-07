/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Raices;
import Servicios.serviciosRaices;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        serviciosRaices sR = new serviciosRaices();
        Raices r = sR.crearRaices();

        sR.calcular(r);
    }
}
