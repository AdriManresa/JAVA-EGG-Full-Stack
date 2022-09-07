/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkmysqlconnector;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adri
 */
public class CheckMysqlConnector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String className = "";
        try {
            Class.forName(className);
            System.out.println("Driver loaded Successfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Failed To Loaded Successfully");
            System.out.println(ex.getMessage());
        }
    }

}
