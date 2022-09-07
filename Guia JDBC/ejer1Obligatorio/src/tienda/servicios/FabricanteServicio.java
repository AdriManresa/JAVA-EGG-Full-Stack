/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.List;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Adri
 */
public class FabricanteServicio {
    private final FabricanteDAO fabricanteDAO;
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    public FabricanteServicio() {
        fabricanteDAO = new FabricanteDAO();
    }
    
    public void crearFabricante(String nombre) throws Exception {
        try{
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre es obligatorio");
            }
            
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            
            fabricanteDAO.guardarFabricante(fabricante);
            
        } catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirFabricante() throws Exception {
        try {
            List<Fabricante> fabricantes = fabricanteDAO.obtenerFabricante();

            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes");
            } else {
                System.out.println("LISTA DE FABRICANTES");
                System.out.printf("%-10s%-15s\n", "CODIGO", "NOMBRE");
                for (Fabricante fabricante : fabricantes) {
                    System.out.printf("%-10s%-15s\n", fabricante.getCodigo(), fabricante.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
        public void añadirFabricante() throws Exception {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = read.next();
        crearFabricante(nombre);
    }
}
