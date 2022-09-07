/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Adri
 */
public class barcosMotor extends Barco {
    private  Integer potenciacv;

    public barcosMotor() {
    }

    public barcosMotor(Integer potenciacv) {
        this.potenciacv = potenciacv;
    }

    public barcosMotor(Integer potenciacv, String matricula, Integer eslora, LocalDate aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.potenciacv = potenciacv;
    }



    public Integer getPotenciacv() {
        return potenciacv;
    }

    public void setPotenciacv(Integer potenciacv) {
        this.potenciacv = potenciacv;
    }

public void crearBarcoMotor(){
    
}
    
    
}
