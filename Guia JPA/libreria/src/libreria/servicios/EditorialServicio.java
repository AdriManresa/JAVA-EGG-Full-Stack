/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Adri
 */
public class EditorialServicio {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    EditorialDAO editorialdao = new EditorialDAO();

    public void CrearEditorial() throws Exception {

        Editorial editorial = new Editorial();

        try {
            System.out.println("Ingrese el nombre de la editorial");
            String nombre = read.next();
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe contener un nombre");
            } else {
                System.out.println("Se guardo exitosamente.");
            }
            editorialdao.GuardarEditorial(editorial);
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarTodasLasEditoriales() {
        System.out.println("------LISTA EDITORIALES------");
        System.out.printf("%-10s%-15s%-15s\n", "ID", "EDITORIAL", "ALTA");
        for (Editorial editorial : editorialdao.obtenerTodosLasEditoriales()) {
            System.out.printf("%-10s%-15s%-15s\n", editorial.getId(), editorial.getNombre(), editorial.getAlta());
        }
    }

    public void obtenerEditorialPorID() throws Exception {
        System.out.println("Ingrese el id de la Editorial");
        int id = read.nextInt();
        editorialdao.obtenerEditorialPorId(id);
    }

    public void obtenerEditorialPorNombre() throws Exception {
        try {
            System.out.println("Ingrese el nombre de la editorial");
            String nombre = read.next();
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("EL nombre no es correcto");
            }
            Editorial editorial = editorialdao.obtenerEditorialPorNombre(nombre);

            if (editorial == null) {
                System.out.println("La editorial no fue encontrada");
            }
            System.out.println("Editorial: " + editorial);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            System.out.println(e.toString());
        }

    }

    public void modificarEditorialPorID() {
        try {
            mostrarTodasLasEditoriales();
            System.out.println("Ingrese el ID del la Editorial");
            Integer id = read.nextInt();

            if (id == null || id <= 0) {
                throw new Exception("Id no valido");
            }

            Editorial editorial = editorialdao.obtenerEditorialPorId(id);

            if (editorial == null) {
                throw new Exception("La editorial no fue encontrado");
            }

            System.out.println("Ingrese nombre de la Editorial");
            editorial.setNombre(read.next());
            pedirAltaEditorial(editorial);
            editorialdao.editar(editorial);

        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.toString());
        }
    }

    public void pedirAltaEditorial(Editorial editorial) {
        System.out.println("La editorial se encuentra disponible? (S/N)");
        String opc = read.next().substring(0, 1);
        editorial.setAlta(opc.equalsIgnoreCase("S"));
    }

    public void darAltaEditorial() {
        try {
            mostrarTodasLasEditoriales();
            System.out.println("ingrese el id de la editorial");
            Integer id = read.nextInt();

            if (id == null || id <= 0) {
                throw new Exception("Id no valido");
            }

            Editorial editorial = editorialdao.obtenerEditorialPorId(id);

            if (editorial == null) {
                throw new Exception("La editorial no fue encontrado");
            } else {
                System.out.println("La editorial fue dado de alta");
                editorial.setAlta(true);
                editorialdao.editar(editorial);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.toString());
        }
    }
        public void darBajaEditorial() {
        try {
            mostrarTodasLasEditoriales();
            System.out.println("ingrese el id de la Editorial");
            Integer id = read.nextInt();

            if (id == null || id <= 0) {
                throw new Exception("Id no valido");
            }

            Editorial editorial = editorialdao.obtenerEditorialPorId(id);

            if (editorial == null) {
                throw new Exception("La editorial no fue encontrado");
            } else {
                System.out.println("La editorial fue dado de baja");
                editorial.setAlta(false);
                editorialdao.editar(editorial);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.toString());
        }
    }
}
