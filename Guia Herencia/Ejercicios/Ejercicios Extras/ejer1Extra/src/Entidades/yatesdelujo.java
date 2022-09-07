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
public class yatesdelujo extends barcosMotor {
    
    private Integer numeroCamarotes;

    public yatesdelujo(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public yatesdelujo(Integer numeroCamarotes, Integer potenciacv) {
        super(potenciacv);
        this.numeroCamarotes = numeroCamarotes;
    }

    public yatesdelujo(Integer numeroCamarotes, Integer potenciacv, String matricula, Integer eslora, LocalDate aniofabricacion) {
        super(potenciacv, matricula, eslora, aniofabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    
    
}
