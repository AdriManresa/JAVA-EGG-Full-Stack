package ej7;

import Entidades.Persona;
import Servicios.serviciosPersona;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        serviciosPersona servPers = new serviciosPersona();

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
 /*MENU*/
        servPers.mostrarMenu();
        int option;
        option = read.nextInt();
        while (option != 7) {
            switch (option) {
                case 1:
                    /*Asignacion*/
                    System.out.println("se creo la persona 1");
                    p1 = servPers.crearPersona();
                    System.out.println("se creo la persona 2");
                    p2 = servPers.crearPersona();
                    System.out.println("se creo la persona 3");
                    p3 = servPers.crearPersona();
                    System.out.println("se creo la persona 4");
                    p4 = servPers.crearPersona();
                    servPers.mostrarMenu();
                    option = read.nextInt();
                case 2:
                    System.out.println("Se calculo el IMC de la persona 1");
                    servPers.calcularIMC(p1);
                    System.out.println("Se calculo el IMC de la persona 2");
                    servPers.calcularIMC(p2);
                    System.out.println("Se calculo el IMC de la persona 3");
                    servPers.calcularIMC(p3);
                    System.out.println("Se calculo el IMC de la persona 4");
                    servPers.calcularIMC(p4);
                    servPers.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 3:
                    servPers.esMayorDeEdad(p1, true);
                    servPers.esMayorDeEdad(p2, true);
                    servPers.esMayorDeEdad(p3, true);
                    servPers.esMayorDeEdad(p4, true);
                    servPers.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 4:
                    int cont = 0;
                    int porc;
                    boolean resultEsM1 = servPers.esMayorDeEdad(p1, true);
                    boolean resultEsM2 = servPers.esMayorDeEdad(p2, true);
                    boolean resultEsM3 = servPers.esMayorDeEdad(p3, true);
                    boolean resultEsM4 = servPers.esMayorDeEdad(p4, true);
                    if (resultEsM1 == true) {
                        cont++;
                    }
                    if (resultEsM2 == true) {
                        cont++;
                    }
                    if (resultEsM3 == true) {
                        cont++;
                    }
                    if (resultEsM4 == true) {
                        cont++;
                    }
                    porc = cont * 100 / 4;

                    System.out.println("El porcentaje de los mayores de edad " + porc);

                    servPers.mostrarMenu();
                    option = read.nextInt();
                    break;
                case 5:
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int porc1;
                    int porc2;
                    int porc3;
                    double resultIMC1 = servPers.calcularIMC(p1);
                    double resultIMC2 = servPers.calcularIMC(p2);
                    double resultIMC3 = servPers.calcularIMC(p3);
                    double resultIMC4 = servPers.calcularIMC(p4);

                    if (resultIMC1 == -1 || resultIMC2 == -1 || resultIMC3 == -1 || resultIMC4 == -1) {
                        cont1++;
                    }
                    if (resultIMC1 == 0 || resultIMC2 == 0 || resultIMC3 == 0 || resultIMC4 == 0) {
                        cont2++;
                       
                    }
                    if (resultIMC1 == 1 || resultIMC2 == 1 || resultIMC3 == 1 || resultIMC4 == 1) {
                        cont3++;
                    }

                    System.out.println("La cantidad de personas que está por debajo de su peso ideal es " + cont1);
                    System.out.println("La cantidad de personas que está en su peso ideal es " + cont2);
                    System.out.println("La cantidad de personas que tiene sobrepeso es " + cont3);
                    
                    porc1 = cont1 * 100 / 4;
                    porc1 = cont2 * 100 / 4;
                    porc1 = cont3 * 100 / 4;
                    servPers.mostrarMenu();
                    option = read.nextInt();
            }
        }

    }
}
