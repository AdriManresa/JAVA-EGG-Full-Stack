/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entidades.Operacion;
import Servicios.serviciosOperacion;

/**
 *
 * @author Adri
 */
public class main {

    public static void main(String[] args) {
        /*crea un objeto*/
        serviciosOperacion servOp = new serviciosOperacion();
        /*creo otro objeto y lo*/
        Operacion oP = servOp.crearOprecion();
        servOp.suma(oP);
        servOp.resta(oP);
        servOp.multiplicar(oP);
        servOp.dividir(oP);
    }

}
