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
public class Rectangulo {
    /*ATRIBUTOS*/
    private int base;
    private int altura;
/*contuctor vacio*/
    public Rectangulo() {
    }
/*constructor*/
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
/*getter and setter*/
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
