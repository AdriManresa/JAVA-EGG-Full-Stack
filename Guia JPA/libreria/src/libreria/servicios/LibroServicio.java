/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Adri
 */
public class LibroServicio {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    LibroDAO librodao = new LibroDAO();
    AutorDAO autordao = new AutorDAO();
    AutorServicio autorserv = new AutorServicio();
    EditorialDAO editorialdao = new EditorialDAO();
    EditorialServicio editorialserv = new EditorialServicio();

    public void crearLibro() throws Exception {
        Libro libro = new Libro();

        try {
            System.out.println("Seleccione un autor");
            System.out.println("----LISTA AUTORES----");
            System.out.printf("%-10s%-15s\n", "ID", "NOMBRE");
            for (Autor autor : autordao.mostrarTodosLosAutores()) {
                System.out.printf("%-10s%-15s\n", autor.getId(), autor.getNombre());
            }
            System.out.println("----------------------");
            Autor autor = pedirAutor();
            libro.setAutor(autor);

            System.out.println("Seleccione una editorial");
            System.out.println("----LISTA EDITORIALES----");
            System.out.printf("%-10s%-15s\n", "ID", "NOMBRE");
            for (Editorial editorial : editorialdao.obtenerTodosLasEditoriales()) {
                System.out.printf("%-10s%-15s\n", editorial.getId(), editorial.getNombre());
            }
            System.out.println("----------------------");
            Editorial editorial = pedirEditorial();
            libro.setEditorial(editorial);

            System.out.println("Ingrese el ISBN");
            Long isbn = read.nextLong();
            libro.setIsbn(isbn);
            if (isbn == null || isbn.toString().trim().isEmpty()) {
                throw new Exception("El isbn es obligatorio");
            }

            System.out.println("Ingresa el Titulo");
            String titulo = read.next();
            libro.setTitulo(titulo);
            if (titulo == null || titulo.toString().trim().isEmpty()) {
                throw new Exception("El titulo es obligatorio");
            }

            System.out.println("Ingresa el año");
            Integer anio = read.nextInt();
            libro.setAnio(anio);
            if (anio == null || anio.toString().trim().isEmpty()) {
                throw new Exception("El año es obligatorio");
            }

            System.out.println("Ingrese ejemplares");
            Integer ejemplares = read.nextInt();
            libro.setEjemplares(ejemplares);
            if (ejemplares == null || ejemplares.toString().trim().isEmpty()) {
                throw new Exception("Los ejemplares son obligatorio");
            }

            System.out.println("Ingrese ejemplares prestados");
            Integer ejemplaresPrestados = read.nextInt();
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            if (ejemplaresPrestados == null || ejemplaresPrestados.toString().trim().isEmpty()) {
                throw new Exception("Los ejemplares prestados son obligatorio");
            }

            System.out.println("Ingrese ejemplares restantes");
            Integer ejemplaresRestantes = read.nextInt();
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            if (ejemplaresRestantes == null || ejemplaresRestantes.toString().trim().isEmpty()) {
                throw new Exception("Los ejemplares restantes son obligatorio");
            }
            libro.setAlta(true);
            librodao.GuardarLibro(libro);

        } catch (Exception e) {
            throw new Exception("Error al crear el libro");
        }
    }

    public void guardarLibro(Libro libro) throws Exception {
        librodao.GuardarLibro(libro);
    }

    private Autor pedirAutor() throws Exception {
        try {
            Autor autor;
            int id;
            System.out.println("Ingresa el id del autor");
            id = read.nextInt();
            autor = autordao.obtenerAutorPorid(id);
            if (id <= 0) {
                System.out.println("El id no es valido");
            }
            return autor;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private Editorial pedirEditorial() throws Exception {
        Editorial editorial;
        do {
            System.out.println("Ingrese el nombre de la Editorial");
            String nombre = read.next();
            editorial = editorialdao.obtenerEditorialPorNombre(nombre);
            if (editorial == null) {
                System.out.println("La editorial no fue encontrada");
            }
        } while (editorial == null);

        return editorial;
    }

    public void mostrarTodosLosLibros() {
        librodao.obtenerTodosLosLibros().forEach(System.out::println);
    }

    public void mostrarLibroPorISBN() throws Exception {
        try {
            System.out.println("Ingrese el ISBN");
            Long isbn1 = read.nextLong();
            if (isbn1 == null) {
                throw new Exception("El ISBN ingresado es invalido ");
            }
            Libro libro = librodao.obtenerLibrosporISBN(isbn1);
            if (libro == null) {
                throw new Exception("El libro que usted ha seleccionado no se encuentra");
            }
            System.out.println("Libro: " + libro);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Libro> mostrarLibrosDeUnAutor(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre es invalido");
            }
            return librodao.obtenerLibrosPorAutor(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Libro> mostrarLibrosDeUnaEditorial(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre es invalido");
            }
            return librodao.obtenerLibrosPorEditorial(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro mostrarLibroPorTitulo(String titulo) throws Exception {
        try {
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("el titulo del libro es invalido");
            }
            Libro libro = librodao.obtenerLibroPorTitulo(titulo);

            if (libro == null) {
                throw new Exception("El libro no fue encontrado");
            }
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }
}
