/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import Entidades.NIF;
import Servicios.ServiciosNif;

/**
 *
 * @author Adri
 */
public class Ex4 {

    public static void main(String[] args) {

        ServiciosNif snif =new ServiciosNif();
        NIF nif = snif.crearNif();
        snif.mostrar(nif);
    }
    
}
