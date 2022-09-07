package ejer4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo circulo = new Circulo();
        System.out.println("Indique el radio del circulo");
        circulo.setRadio(leer.nextDouble());

        System.out.println("El area del Circulo es "+ circulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Indique la base del rectangulo");
        rectangulo.setBase(leer.nextDouble());
        System.out.println("Indique la altura del rectangulo");
        rectangulo.setAltura(leer.nextDouble());

        System.out.println("El area del Rectangulo es: "+rectangulo.calcularArea());  
        System.out.println("El perimetro del rectangulo es: "+ rectangulo.calcularPerimetro()); 

    }

}
