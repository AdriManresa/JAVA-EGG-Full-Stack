/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Constantes.Constantes;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Alquiler {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    /*ATRIBUTOS*/
    private String nombre;
    private String apellido;
    private Integer DNIcliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posicionAmarre;
    private Barco tipoBarco;

    /*Constructor*/
    public Alquiler() {
    }

    public Alquiler(String nombre, String apellido, Integer DNIcliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco tipoBarco) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNIcliente = DNIcliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(Integer DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(Barco tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public void crearAlquiler() {
        System.out.println(Constantes.INGRESAR_NOMBRE);
        this.nombre = read.next();
        System.out.println(Constantes.INGRESA_APELLIDO);
        this.apellido = read.next();
        System.out.println(Constantes.INGRESAR_DNI);
        this.DNIcliente = read.nextInt();
        crearFecha();
        
        calcularDias(fechaAlquiler, fechaDevolucion);
        
    }

    public void crearFecha() {
      
        String fechaAlquilerString ;
        String fechaDevolucionString ;

        do {
            System.out.println(Constantes.INGRESAR_FECHA_ALQUILER);
            fechaAlquilerString = read.next();
        } while (!fechaAlquilerString.contains("-"));

        this.fechaAlquiler = LocalDate.parse(fechaAlquilerString);

        do {

            System.out.println(Constantes.INGRESAR_FECHA_DEVOLUCION);

            fechaDevolucionString = read.next();

        } while (!fechaDevolucionString.contains("-"));

        this.fechaDevolucion = LocalDate.parse(fechaDevolucionString);

    }
    
        public int calcularDias(LocalDate fechaAlquiler, LocalDate fechaDevolucion) {

        int Difdias;

        Duration dd = Duration.between(fechaAlquiler.atStartOfDay(), fechaDevolucion.atStartOfDay());

        Difdias = (int) dd.toDays();

        return Difdias;

    }

    @Override
    public String toString() {
        return "--Alquiler--" 
                + "\nnombre=" + nombre 
                + "\napellido=" + apellido 
                + "\nDNIcliente=" + DNIcliente 
                + "\nfechaAlquiler=" + fechaAlquiler 
                + "\nfechaDevolucion=" + fechaDevolucion 
                + "\nposicionAmarre=" + posicionAmarre 
                + "\ntipoBarco=" + tipoBarco + '}';
    }


        
        
}

