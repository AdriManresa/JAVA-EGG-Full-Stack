/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Contantes.Constantes;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Electrodomesticos {

    protected Scanner read = new Scanner(System.in).useDelimiter("\n");
    protected Integer precio;
    protected String color;
    protected String consumoEnergetico;
    protected Integer peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Integer precio, String color, String consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(String letra) {

        if (!this.consumoEnergetico.equals("A") && this.consumoEnergetico.equals("B") && this.consumoEnergetico.equals("C") && this.consumoEnergetico.equals("C")
                && this.consumoEnergetico.equals("D") && this.consumoEnergetico.equals("E") && this.consumoEnergetico.equals("F")) {

            System.out.println(Constantes.LETRA_INCORRECTA);
            this.consumoEnergetico = "F";
        } else {

            this.consumoEnergetico = letra;
        }

    }

    public void comprobarColor(String color) {

        if (!this.color.equalsIgnoreCase("negro") && this.color.equalsIgnoreCase("rojo") && this.color.equalsIgnoreCase("azul") && this.color.equalsIgnoreCase("gris")) {
            System.out.println(Constantes.COLOR_INCORRECTO);
            this.color = "blanco";
        } else {

            this.color = color;
        }
    }

    public void crearElectrodomestico() {

        System.out.println(Constantes.ELEGIR_CONSUMO);
        this.consumoEnergetico = read.next();
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println(Constantes.ELEGIR_COLOR);
        this.color = read.next();
        comprobarColor(color);
        System.out.println(Constantes.ELEGIR_PESO);

        this.peso = read.nextInt();

        this.precio = 1000;
    }

    public void precioFinal() {

        switch (this.consumoEnergetico) {
            case "A":
                this.precio = 1000;
            case "B":
                this.precio = 800;
            case "C":
                this.precio = 600;
            case "D":
                this.precio = 500;
            case "E":
                this.precio = 300;
            case "F":
                this.precio = 100;
        }
        if (this.peso>=1 && this.peso <=19) {
            this.precio=100;
        }
        if (this.peso >=20 && this.peso <=49) {
            this.precio= 500;
        }
        if (this.peso >=50 && this.peso <=79) {
            this.precio =800;
            
        }
        if (this.precio >=80 ) {
            this.precio=1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "read=" + read + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
