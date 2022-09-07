/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Adri
 */
public class Edificio {
    /*Atributo*/
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;
    
   

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
        public void calcularSuperficie(){
         int superficie;
         
         superficie = this.ancho * this.largo;
         
        System.out.println("La superficie del edificio es "+ superficie );
        
    }
    
    public void calcularVolumen(){
        int volumen;
        
        volumen = this.alto * this.ancho * this.largo;
        
        System.out.println("El volumen del edificio es " +volumen);
    }
}
