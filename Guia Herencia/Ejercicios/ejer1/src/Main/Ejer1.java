
package Main;

import AnimalesEntidades.Animal;
import AnimalesEntidades.Caballo;
import AnimalesEntidades.Gato;
import AnimalesEntidades.Perro;


public class Ejer1 {

    public static void main(String[] args) {

        Animal perro = new Perro("Corcho","Carne","Mestizo",3);
        Animal perro2 = new Perro("Shiro","Carne","Mestizo",7);
        Animal gato = new Gato("Gatubela","Pescado","Siames",6);
        Animal caballo = new Caballo("Carbon","Alfalfa","Puraraza",10);
        
        perro.seAlintadoDe();
        perro2.seAlintadoDe();
        gato.seAlintadoDe();
        caballo.seAlintadoDe();
        
    }
    
}
