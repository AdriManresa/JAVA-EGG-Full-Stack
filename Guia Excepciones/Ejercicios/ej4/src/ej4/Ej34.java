package ej4;

import Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej34 {

    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        DivisionNumero divN = new DivisionNumero();

        try {

            System.out.println("Ingres el primer numero");

            divN.setN1(read.next());

            System.out.println("Ingrese el segundo numero");

            divN.setN2(read.next());

        } catch (InputMismatchException | ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

        try {

            int n1Int = Integer.parseInt(divN.getN1());

            int n2Int = Integer.parseInt(divN.getN2());

            int division = n1Int / n2Int;

            System.out.println("La división es: " + division);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
