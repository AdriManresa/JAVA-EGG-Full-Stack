package ej3;

import Entidades.DivisionNumero;
import java.util.Scanner;

public class Ej3 {

    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        DivisionNumero divN = new DivisionNumero();

        try {
            System.out.println("Ingrese el primer numero");

            divN.setN1(read.next());

            System.out.println("Ingrese el Segundo numero");

            divN.setN2(read.next());

            int n1Int = Integer.parseInt(divN.getN1());

            int n2Int = Integer.parseInt(divN.getN2());

            int divicion = n1Int / n2Int;

            System.out.println("La divicion es: " + divicion);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.toString());
        }

    }

}
