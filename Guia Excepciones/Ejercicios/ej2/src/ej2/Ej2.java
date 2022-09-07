/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Adri
 */
public class Ej2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        
        try {
            array[7]=3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+ e.getMessage());
        }

    }

}
