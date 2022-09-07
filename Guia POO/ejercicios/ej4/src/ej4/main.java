/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Entidades.Rectangulo;
import Servicios.serviciosRectangulo;

/**
 *
 * @author Adri
 */
public class main {

    public static void main(String[] args) {
        /*crear objeto*/

        serviciosRectangulo servRec = new serviciosRectangulo();

        /*Creo otro objeto y lo intancio*/ 
        Rectangulo rec = servRec.crearRectangulo();
        
        /*Calcular superfiecie*/
        
        servRec.superficieRectangulo(rec);
          /*calcular perimetro*/
        servRec.perimetroRectangulo(rec);
        /*Dibujar Rectangulo*/
        servRec.dibujarRectangulo(rec);
        /*Dibujar rectangulo vacion*/
        servRec.dibujarRectanguloVacio(rec);
    }

}
