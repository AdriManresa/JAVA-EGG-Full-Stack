package Entidades;

import Contantes.Constantes;

public final class Televisor extends Electrodomesticos {

    private Integer resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {

        crearElectrodomestico();

        System.out.println(Constantes.INGRESE_RESOLUCION);

        this.resolucion = read.nextInt();

        System.out.println(Constantes.TIENE_TDT);

        String opc = read.next();

        if (opc.equalsIgnoreCase("SI")) {

            this.sintonizadorTDT = true;

        } else {

            this.sintonizadorTDT = false;

        }
        
        precioFinal();

    }

    public void precioFinal() {

        super.precioFinal();

        Integer precioInteger = this.precio;
        
        double precioDouble = precioInteger;
        
        if (this.resolucion > 40) {

            precioDouble = precioDouble + (precioDouble * 0.3);

        }

        this.precio = (int) precioDouble;

        if (sintonizadorTDT) {
            this.precio += 500;
        }

    }

    public void mostrarTelevisor() {

        System.out.println("Caracteristicas de su Televisor: "
                + "\nColor: " + this.color
                + "\nConsumo: " + this.consumoEnergetico
                + "\nPeso: " + this.peso
                + "\nPulgadas: " + this.resolucion
                + "\nPrecio: " + this.precio
                + "\nSintetizador: " + this.sintonizadorTDT);

    }

    @Override
    public String toString() {
        return "Televisor" + " Resolucion:" + resolucion + " Sintonizador TDT:" + sintonizadorTDT + super.toString();
    }

}