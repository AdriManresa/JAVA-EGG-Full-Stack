package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class serviciosPersona {

    private final Scanner read = new Scanner(System.in);

    public Persona crearPersona() {
        String sexo;
        Persona pers = new Persona();
        System.out.println("persona ");
        System.out.println("Nombre");
        pers.setNombre(read.next().toLowerCase());
        System.out.println("Sexo");
        sexo = read.next();
        while (!sexo.toUpperCase().equals("H") && !sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("O")) {

            System.out.println("Ingresa una opcion valida H/M/O");

            sexo = read.next();
        }
        pers.setSexo(sexo);
        System.out.println("Edad");
        pers.setEdad(read.nextInt());
        System.out.println("Peso");
        pers.setPeso(read.nextDouble());
        System.out.println("Altura");
        pers.setAltura(read.nextDouble());
        return pers;

    }

    public void mostrarMenu() {
        System.out.println("MENU:");
        System.out.println("1-Crear persona");
        System.out.println("2-Calcular el IMC");
        System.out.println("3-Es mayor de edad");
        System.out.println("4-Porcentaje mayor de edad");
        System.out.println("5-Porcentaje IMC");
    }

    public double calcularIMC(Persona pers) {
        double IMC;
        double alturaAlCuadrado = pers.getAltura();
        alturaAlCuadrado = (int) (Math.pow(2, 2));
        double peso = pers.getPeso();
        IMC = peso / alturaAlCuadrado;

        if (IMC < 20) {
            System.out.println("la persona está por debajo de su peso ideal");
            int bajopeso = -1;
            return bajopeso;
        } else if (IMC >= 20 && IMC == 25) {
            System.out.println("la persona está en su peso ideal");
            int pesoideal = 0;
            return pesoideal;
        } else {
            System.out.println("la persona tiene sobrepeso");
            int sobrepeso = 1;
            return sobrepeso;
        }
    }

    public boolean esMayorDeEdad(Persona pers, boolean esMayor) {
        if (pers.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
            esMayor = true;
        } else {
            System.out.println("Es menor de edad");
            esMayor=false;
        }
        return esMayor;
    }

}
