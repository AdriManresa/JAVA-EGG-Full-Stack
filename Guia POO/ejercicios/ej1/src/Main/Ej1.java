package Main;

import Entidades.Libro;
import Servicios.serviciosLibro;

public class Ej1 {

    public static void main(String[] args) {

        serviciosLibro Servl1 = new serviciosLibro(); //Instanciamos el objeto Servl1 para poder ingresar y usar los metodos de esa clase
        /*CREAR LIBRO*/
        Libro l1 = Servl1.crearLibro(); //Instanciamos el objeto l1 de clase libro e ingresamos el metodo crearLibro que está alojado en la clase ServiciosLibro

        Servl1.mostrarLibro(l1); //Con el objeto de la clase ServiciosLibro usamos el metodo mostrarLibro y le pasamos por parametro el objeto l1 de clase Libro

    }

}
