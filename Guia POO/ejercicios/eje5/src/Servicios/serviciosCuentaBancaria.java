/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.cuentaBancaria;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosCuentaBancaria {

    /*Limita los decimales*/
    DecimalFormat df = new DecimalFormat("#.00");

    private final Scanner read = new Scanner(System.in);

    public cuentaBancaria crearCuenta() {

        /*hace nacer el objeto de entidades*/
        cuentaBancaria cuenta = new cuentaBancaria();

        System.out.println("Ingresa tu dni");
        cuenta.setDNI(read.nextLong());

        System.out.println("Ingresa tu numero de cuenta");
        cuenta.setNumeroCuenta(read.nextInt());

        System.out.println("Su saldo actual es " + df.format(cuenta.getSaldoActual()));

        return cuenta;
    }

    /*Ingresar dinero*/
    public double ingreso(cuentaBancaria cuenta) {
        double dineroIngresar = 0;
        int select;
        boolean salir= false;

        do {
            System.out.println("¿Desea Retirar dinero?");
            System.out.println("1-si");
            System.out.println("2-no");
            select = read.nextInt();
            switch (select) {
                case 1:
                    System.out.println("¿Cuanto dinero deasea ingresar?");
                    dineroIngresar = read.nextDouble();
                    cuenta.setSaldoActual(dineroIngresar + cuenta.getSaldoActual());
                    System.out.println("su saldo actual es " + df.format(cuenta.getSaldoActual()));
                case 2:
                    salir=true;
                    break;
            }

        } while (!salir);

        return dineroIngresar;

    }

    public double retirar(cuentaBancaria cuenta) {
        double dineroRetirar = 0;
        boolean salir = false;
        int select;
        do {
            System.out.println("¿Desea Retirar dinero?");
            System.out.println("1-si");
            System.out.println("2-no");
            select = read.nextInt();
            switch (select) {
                case 1:
                    System.out.println("¿Cuanto dinero deasea retirar?");
                    dineroRetirar = read.nextDouble();
                    cuenta.setSaldoActual(cuenta.getSaldoActual() - dineroRetirar);

                    if (dineroRetirar > cuenta.getSaldoActual()) {
                        cuenta.setSaldoActual(0);
                        System.out.println("su saldo quedo en 0 " + df.format(cuenta.getSaldoActual()));
                    }
                case 2:
salir=true;
                    break;
            }

        } while (!salir);

        return dineroRetirar;
    }

    public double extraccionRapida(cuentaBancaria cuenta) {
        double dineroRapido = 0;

        return dineroRapido;
    }

    public void consultarSaldo(cuentaBancaria cuenta) {
        System.out.println("Su saldo es" + cuenta.getSaldoActual());
    }

    public void consultarDatos(cuentaBancaria cuenta) {
        System.out.println("Su numero de cuenta es " + cuenta.getNumeroCuenta());
        System.out.println("Su dni es " + cuenta.getDNI());
    }
}
