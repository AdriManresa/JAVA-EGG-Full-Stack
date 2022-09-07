package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class serviciosCircunferencia {

    private final Scanner read = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingresa el Area");
        c1.setRadio(read.nextDouble());
        return c1;
    }

    public double area(Circunferencia c1) {
        double area = Math.PI * c1.getRadio()* c1.getRadio();

        return area;
    }

    public double perimetro(Circunferencia c1) {
        double area = 2 * Math.PI * c1.getRadio();

        return area;
    }
}
