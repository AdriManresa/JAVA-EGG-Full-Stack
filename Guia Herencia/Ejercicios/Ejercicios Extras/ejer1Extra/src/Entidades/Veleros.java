/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Veleros extends Barco  {
    
    private Integer numeroMastiles;

    public Veleros() {
    }

    public Veleros(String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
 
    @Override
    public String toString() {
        return "Veleros{" + "numeroMastiles=" + numeroMastiles + '}';
    }
    
    public void crearVeleros(){
        crearBarco();
        
        
    }
    
}
