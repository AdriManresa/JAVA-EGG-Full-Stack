package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Adri
 */
public class AutorServicio {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final AutorDAO autordao = new AutorDAO();

    public void CrearAutor() throws Exception {
        Autor autor = new Autor();
        try {
            System.out.println("Ingrese nombre del autor");
            String nombre = read.next();
            autor.setNombre(nombre);
            autor.setAlta(true);
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe contener un nombre");
            } else {
                System.out.println("Se guardo exitosamente.");
            }
            autordao.GuardarAutor(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarTodosLosAutores() {
        System.out.println("------LISTA DE AUTORES------");
        System.out.printf("%-10s%-15s%-15s\n", "ID", "AUTOR","ALTA");
        for (Autor autor : autordao.mostrarTodosLosAutores()) {
            System.out.printf("%-10s%-15s%-15s\n", autor.getId(), autor.getNombre(), autor.getAlta());
        }
    }

    public void obtenerAutorPorid() throws Exception {
        System.out.println("Ingresa el id del autor");
        int id = read.nextInt();
        autordao.obtenerAutorPorid(id);
    }

    public void obtenerAutorPorNombre() {
        try {
            System.out.println("Ingrese el nombre del autor");
            String nombre = read.next();

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("EL nombre no es correcto");
            }

            Autor autor = autordao.obtenerAutorPorNombre(nombre);

            if (autor == null) {
                throw new Exception("EL autor no fue encontrado");
            }
            System.out.println(autor);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            System.out.println(e.toString());
        }

    }

    public void modificarAutorPorID() {
        try {
            mostrarTodosLosAutores();
            System.out.println("Ingrese el ID del autor");
            Integer id = read.nextInt();

            if (id == null || id <= 0) {
                throw new Exception("Id no valido");
            }

            Autor autor = autordao.obtenerAutorPorid(id);

            if (autor == null) {
                throw new Exception("el autor no fue encontrado");
            }

            System.out.println("Ingrese nombre del autor");
            autor.setNombre(read.next());
            pedirAltaAutor(autor);
            autordao.editar(autor);

        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.toString());
        }
    }

    public void pedirAltaAutor(Autor autor) {
        System.out.println("El autor se encuentra disponible? (S/N)");
        String opc = read.next().substring(0, 1);
        autor.setAlta(opc.equalsIgnoreCase("S"));
    }

    public void darAltaAutor() {
        try {
            mostrarTodosLosAutores();
            System.out.println("ingrese el id del autor");
            Integer id = read.nextInt();

            if (id == null || id <= 0) {
                throw new Exception("Id no valido");
            }

            Autor autor = autordao.obtenerAutorPorid(id);

            if (autor == null) {
                throw new Exception("el autor no fue encontrado");
            } else {
                System.out.println("El autor fue dado de alta");
                autor.setAlta(true);
                autordao.editar(autor);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.toString());
        }
    }
        public void darBajaAutor() {
        try {
            mostrarTodosLosAutores();
            System.out.println("ingrese el id del autor");
            Integer id = read.nextInt();

            if (id == null || id <= 0) {
                throw new Exception("Id no valido");
            }

            Autor autor = autordao.obtenerAutorPorid(id);

            if (autor == null) {
                throw new Exception("el autor no fue encontrado");
            } else {
                System.out.println("El autor fue dado de Baja");
                autor.setAlta(false);
                autordao.editar(autor);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.toString());
        }
    }
}
