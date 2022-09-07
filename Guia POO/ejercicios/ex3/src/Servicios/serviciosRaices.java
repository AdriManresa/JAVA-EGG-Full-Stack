package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class serviciosRaices {

    private final Scanner read = new Scanner(System.in);

    public Raices crearRaices() {
        Raices r = new Raices();
        System.out.println("Ingresa el primer coeficiente");
        r.setA(read.nextDouble());
        System.out.println("Ingresa el segundo coeficiente");
        r.setB(read.nextDouble());
        System.out.println("Ingresa el tercer coeficiente");
        r.setC(read.nextDouble());
        return r;
    }

    public double getDiscriminante(Raices r) {
        double discriminante;
        double cuadrado;
        cuadrado = Math.pow(r.getB(), 2);
        discriminante = cuadrado - 4 * r.getA() * r.getC();
        System.out.println("El discriminante es ");
        System.out.println(discriminante);
        return discriminante;
    }

    public boolean tieneRaices(Raices r) {
        if (getDiscriminante(r) > 0) {
            System.out.println("tiene dos soluciones");
            return true;
        } else {
            System.out.println("vea opcion 3");
            return false;
        }

    }

    public boolean tieneRaiz(Raices r) {
        if (getDiscriminante(r) == 0) {
            System.out.println("tiene una única solución");
            return true;
        } else {
            System.out.println("vea opcion 3");
            return false;
        }

    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r) == true) {
            System.out.println("La soluciones son: ");
            double raiz;
            double cuadrado;
            double solucion;
            double solucion1;
            cuadrado = Math.pow(r.getB(), 2);
            raiz = Math.sqrt(cuadrado - 4 * r.getA() * r.getC());
            solucion = (-r.getB() + raiz) / (2 * r.getA());
            solucion1 = (-r.getB() - raiz) / (2 * r.getA());
            System.out.println("La primera solucion es: " + solucion);
            System.out.println("La Segunda solucion es: " + solucion1);

        } else {
            System.out.println("no entro");
        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r) == true) {
            double raiz;
            double cuadrado;
            double solucion;
            cuadrado = Math.pow(r.getB(), 2);
            raiz = Math.sqrt(cuadrado - 4 * r.getA() * r.getC());
            solucion = (-r.getB() + raiz) / (2 * r.getA());
            System.out.println("La unica solucion es: " + solucion);
        } else {
            System.out.println("no entro");
        }

    }

    public void calcular(Raices r) {
        if (tieneRaices(r)==true) {
            obtenerRaices(r);
        }
        else if(tieneRaiz(r)==true){
            obtenerRaiz(r);
        }
        else {
            System.out.println("No tiene solucion");
        }
    }
}
