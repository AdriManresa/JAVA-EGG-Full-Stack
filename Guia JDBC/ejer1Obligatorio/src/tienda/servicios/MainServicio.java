package tienda.servicios;

import java.util.Locale;
import java.util.Scanner;

public class MainServicio {

    protected ProductoServicio productoServicio;
    protected FabricanteServicio fabricanteServicio;
private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    public MainServicio() {
        productoServicio = new ProductoServicio();
        fabricanteServicio = new FabricanteServicio();
    }

    public void menuPrincipal() {
        try {
            Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
            String cerrarMenu = "", mostrar = "";
            do {
                System.out.print("Quiere ver el menu? Y/N ");
                mostrar = leer.next();
                if (mostrar.compareToIgnoreCase("y") == 0) {
                    mostrarMenu();
                }
                System.out.print("Ingrese la opcion que desee: ");
                cerrarMenu = leer.next();
                casosMenu(cerrarMenu.charAt(0));
            } while (cerrarMenu.compareToIgnoreCase("q") != 0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void mostrarMenu() {
        System.out.print("a) Lista el nombre de todos los productos que hay en la tabla producto.\n"
                + "b) Lista los nombres y los precios de todos los productos de la tabla producto. \n"
                + "c) Listar aquellos productos que su precio esté entre 120 y 202. \n"
                + "d) Buscar y listar todos los Portátiles de la tabla producto. \n"
                + "e) Listar el nombre y el precio del producto más barato. \n"
                + "f) Ingresar un producto a la base de datos.\n"
                + "g) Ingresar un fabricante a la base de datos\n"
                + "h) Editar un producto con datos a elección\n"
                + "q) SALIR\n");
    }

    private void casosMenu(char letra) throws Exception {
        switch (letra) {
            case 'a':
                productoServicio.imprimirProductosPorNombre();
                break;
            case 'b':
                productoServicio.imprimirProductos();
                break;
            case 'c':
                productoServicio.imprimirProductosRangoPrecio();
                break;
            case 'd':
                productoServicio.mostrarPortatiles();
                break;
            case 'e':
                productoServicio.mostrarMasBarato();
                break;
            case 'f':
                productoServicio.ingresarProducto();
                break;
            case 'g':
              fabricanteServicio.añadirFabricante();
                break;
            case 'h':
                /*System.out.println("Ingrese el codigo del producto");
                int cod = read.nextInt();
                productoServicio.buscarPorCodigo(cod);*/
               productoServicio.modificarProducto();
                break;
            case 'q':
                System.out.println("Se terminó el programa");
                break;
            default:
                System.out.println("Ingrese otra opcion!");
        }
    }



}
