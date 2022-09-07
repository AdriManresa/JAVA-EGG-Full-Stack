
package ej2;

import Entidades.Circunferencia;
import Servicios.serviciosCircunferencia;

public class main {


    public static void main(String[] args) {
 
        //traigo el paquete servicio uy lo creo
        serviciosCircunferencia servC = new serviciosCircunferencia();
        
        Circunferencia c1 = servC.crearCircunferencia();
        
        System.out.println("El area es " + servC.area(c1));
        System.out.println("El perimetro es " + servC.perimetro(c1));
        
        
        
    }
    
}
