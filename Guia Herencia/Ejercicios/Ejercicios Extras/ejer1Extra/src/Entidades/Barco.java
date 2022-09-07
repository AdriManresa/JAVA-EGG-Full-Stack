/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Constantes.Constantes;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Barco {
       protected Scanner read = new Scanner(System.in).useDelimiter("\n");
    /*Atributos*/
    private String matricula;
    private Integer eslora;
    private Integer anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco(){
        System.out.println(Constantes.INGRESAR_MATRICULA);
        this.matricula = read.next();
        System.out.println(Constantes.INGRESAR_ESLORA);
        this.eslora =read.nextInt();
        System.out.println(Constantes.INGRESAR_ANIO_FABRICACION);
        this.anioFabricacion = read.nextInt();
    }
}
