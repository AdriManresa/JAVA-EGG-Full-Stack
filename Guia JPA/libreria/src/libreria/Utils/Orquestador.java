import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Orquestador {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    LibroServicio libroServicio = new LibroServicio();
    AutorServicio autorServicio = new AutorServicio();
    EditorialServicio editorialServicio = new EditorialServicio();

//MENU PRINCIOPAL    
    public void menuPrincipal() throws Exception {
        int opc;
        do {
            System.out.println("----MENU PRINCIPAL----\n"
                    + "1-Ir a Menu Autor \n"
                    + "2-Ir a Menu Editorial\n"
                    + "3-Ir a Menu Libro\n"
                    + "4-Salir\n");

            System.out.println("Seleccione una opcion");

            opc = read.nextInt();

            switch (opc) {
                case 1:
                    menuAutor();
                    break;
                case 2:
                    menuEditorial();
                    break;
                case 3:
                    menuLibro();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 4);

        System.out.println("Usted salio del programa");

    }
//MENU AUTOR

    public void menuAutor() throws Exception {
        int opc;
        do {
            System.out.println("----MENU AUTOR-----\n"
                    + "1-Crear un nuevo Autor\n"
                    + "2-Mostrar Todos los Autores\n"
                    + "3-Buscar un autor usando su ID\n"
                    + "4-Buscar un autor usando su nombre\n"
                    + "5-Modificar un autor usando su id\n"
                    + "6-Dar de alta a un autor\n"
                    + "7-Dar de baja a un autor\n"
                    + "8-Volver al menu principal\n");

            System.out.println("Ingrese una opcion");

            opc = read.nextInt();

            switch (opc) {
                case 1:
                    autorServicio.CrearAutor();
                    break;
                case 2:
                    autorServicio.mostrarTodosLosAutores();
                    break;
                case 3:
                    autorServicio.obtenerAutorPorid();
                    break;
                case 4:
                    autorServicio.obtenerAutorPorNombre();
                    break;
                case 5:
                    autorServicio.modificarAutorPorID();
                    break;
                case 6:
                    autorServicio.darAltaAutor();
                    break;
                case 7:
                    autorServicio.darBajaAutor();
                    break;
                case 8:
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opc != 8);

    }

    //MENU EDITORIAL
    public void menuEditorial() throws Exception {
        int opc;
        do {
            System.out.println("----MENU----\n"
                    + "1-Crear una editorial\n"
                    + "2-Mostrar todas las editoriales\n"
                    + "3-Mostrar Editorial por ID\n"
                    + "4-Buscar Editorial por su nombre\n"
                    + "5-Modificar Editorial Usando su ID\n"
                    + "6-Dar de alta una Editorial\n"
                    + "7-Dar de baja una Editorial\n"
                    + "8-Volver al menu principal\n");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    editorialServicio.CrearEditorial();
                    break;
                case 2:
                    editorialServicio.mostrarTodasLasEditoriales();
                    break;
                case 3:
                    editorialServicio.obtenerEditorialPorID();
                    break;
                case 4:
                    editorialServicio.obtenerEditorialPorNombre();
                    break;
                case 5:
                    editorialServicio.modificarEditorialPorID();
                    break;
                case 6:
                    editorialServicio.darAltaEditorial();
                    break;
                case 7:
                    editorialServicio.darBajaEditorial();
                    break;
                case 8:
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opc != 8);

    }

//MENU LIBROS
    public void menuLibro() throws Exception {
        int opc;
        do {
            System.out.println("----MENU LIBRO----\n"
                    + "1-Crear Libro\n"
                    + "2-Mostrar Todos Los Libros\n"
                    + "3-Buscar libro por ISBN\n"
                    + "4-Mostrar libros por nombre\n"
                    + "5-Mostrar todos los libros publicados por un autor\n"
                    + "6-Mostrar todos los libros publicados por una editorial\n"
                    + "7-Prestar un libro"
                    + "8-Volver al menu principal\n");

            System.out.println("Ingrese una opcion");

            opc = read.nextInt();

            switch (opc) {
                case 1:
                    libroServicio.crearLibro();
                    break;
                case 2:
                    libroServicio.mostrarTodosLosLibros();
                    break;
                case 3:
                    libroServicio.mostrarLibroPorISBN();
                    break;
                case 4:
                    System.out.println("Ingrese El ttulo del libro");
                    System.out.println(libroServicio.mostrarLibroPorTitulo(read.next()));
                    break;
                case 5:
                    System.out.println("ingrese nombre del autor");
                    libroServicio.mostrarLibrosDeUnAutor(read.next()).forEach(System.out::println);
                    libroServicio.mostrarTodosLosLibros();
                    break;
                case 6:
                    System.out.println("ingrese nombre editorial");
                    libroServicio.mostrarLibrosDeUnaEditorial(read.next()).forEach(System.out::println);
                    break;
                case 8:
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opc != 9);

    }
}
