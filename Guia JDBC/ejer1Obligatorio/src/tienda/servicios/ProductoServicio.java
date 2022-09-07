/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Adri
 */
public class ProductoServicio {

    private final ProductoDAO productoDAO;
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public ProductoServicio() {
        productoDAO = new ProductoDAO();
    }

    public Producto buscarPorCodigo(int cod) throws Exception {
        try {
            if (cod < 0) {
                throw new Exception("Codigo invalido");
            }
            Producto productoModificado = productoDAO.obtenerProductoPorCodigo(cod);
            if (productoModificado == null) {
                throw new Exception("El producto es invalido");
            }
            return productoModificado;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw new Exception("Error de sistema");
        }
    }

    public void ingresarProducto() throws Exception {
        try {
            System.out.println("Ingrese el nombre del producto");
            String nombre = read.next();
            System.out.println("Ingrese el precio del producto");
            double precio = read.nextDouble();
            System.out.println("Ingrese el codigo del fabricante");
            int codigoFabricante = read.nextInt();
            crearProducto(nombre, precio, codigoFabricante);
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarProducto(Producto producto) throws Exception {
        try {
            System.out.println("Ingrese el nombre del producto");
            String nombre = read.next();
            System.out.println("Ingrese el precio del producto");
            double precio = read.nextDouble();
            System.out.println("Ingrese el codigo del fabricante");
            int codigoFabricante = read.nextInt();
            productoDAO.modificarProductos(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void crearProducto(String nombre, Double precio, int fabricante) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre es obligatorio");
            }
            if (precio == null) {
                throw new Exception("El precio es obligatorio");
            }
            if (fabricante < 0) {
                throw new Exception("El Fabricante es obligatorio");
            }
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(fabricante);

            productoDAO.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {
        try {
            List<Producto> productos = productoDAO.obtenerProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos");
            } else {
                System.out.println("LISTA DE PRODUCTOS");
                for (Producto producto : productos) {
                    System.out.println("Codigo producto: " + producto.getCodigo() + " Nombre Producto " + producto.getNombre()
                            + " Precio " + producto.getPrecio() + " Codigo fabricante "
                            + producto.getCodigoFabricante() + " nombre fabricante " + producto.getCodigoFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto() throws Exception {
        try {
            System.out.println("Ingrese el codigo del producto");
            int cod1 = read.nextInt();
            System.out.println("Ingrese el nombre del producto");
            String nombre = read.next();
            System.out.println("Ingrese el precio del producto");
            double precio = read.nextDouble();
            System.out.println("Ingrese el codigo del fabricante");
            int codF = read.nextInt();

            validarModificado(cod1, nombre, precio,codF);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void validarModificado(int cod, String nombre, double precio, int codigofabricante) throws Exception {
        try {
            if (cod <= 0) {
                throw new Exception("El codigo es invalido");
            }
            validar(nombre, precio);
            Producto productoModificado = buscarPorCodigo(cod);
            productoModificado.setCodigo(cod);
            productoModificado.setPrecio(precio);
            productoModificado.setNombre(nombre);
            productoModificado.setCodigoFabricante(codigofabricante);
            productoDAO.modificarProductos(productoModificado);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void validar(String nombre, double precio) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre es invalido");
        }
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor que 0");
        }
    }

    public void imprimirProductosPorNombre() throws Exception {
        try {

            List<String> productos = productoDAO.obtenerProductoNombre();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos");
            } else {
                System.out.println("LISTA DE PRODUCTOS");
                System.out.printf("%-10s\n", "NOMBRE");
                for (String producto : productos) {
                    System.out.printf("%-10s\n", producto);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosRangoPrecio() throws Exception {
        try {
            List<Producto> productos = productoDAO.obtenerProductoPorRangoPrecio();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos");
            } else {
                System.out.println("LISTA DE PRODUCTOS");
                System.out.printf("%-35s%-10s%-5s\n", "NOMBRE", "PRECIO", "FABRICANTE");
                for (Producto producto : productos) {
                    System.out.printf("%-35s%-10.2f%-5s\n", producto.getNombre(), producto.getPrecio(), producto.getCodigoFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPortatiles() throws Exception {
        try {
            Collection<Producto> productosEntre = productoDAO.mostrarTodosLosPortatiles();
            if (productosEntre.isEmpty()) {
                throw new Exception("No existen productos");
            } else {
                System.out.println("LISTA DE PRODUCTOS");
                System.out.printf("%-10s\n", "NOMBRE");
                for (Producto producto : productosEntre) {
                    System.out.println("Nombre: " + producto.getNombre() + " .Precio: " + producto.getPrecio());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarMasBarato() throws Exception {
        Collection<Producto> productosEntre = productoDAO.mostrarNombrePrecioProductoMasBarato();
        for (Producto producto : productosEntre) {
            System.out.println("Nombre: " + producto.getNombre() + " .Precio: " + producto.getPrecio());
        }
    }

}
