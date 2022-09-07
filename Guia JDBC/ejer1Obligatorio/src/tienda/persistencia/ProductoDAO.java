package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;

/**
 *
 * @author Adri
 */
public final class ProductoDAO extends DAO {

    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto valido");
            }
            String sql = "INSERT INTO Producto (nombre,precio,codigo_fabricante)" + "VALUES ( ' "
                    + producto.getNombre() + " ' ,  "
                    + producto.getPrecio() + " , "
                    + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El producto no puede ser nulo");
            }
            String template = "INSERT INTO producto VALUES (NULL, '%s','%s','%s');";
            String sql = String.format(template, producto.getNombre(), producto.getPrecio(), producto.getCodigoFabricante());
            System.out.println("Consulta:");
            System.out.println(sql);

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Hubo un error al guardar el producto");
        }
    }
    /*modificar el producto sql*/
    /*public static String MODIFICAR_PRODUCTOS(Producto producto) {
        return "UPDATE producto SET " + "nombre= " + producto.getNombre()
                + "codigo_fabricante= " + producto.getCodigo() + "precio= "
                + producto.getPrecio() + "WHERE codigo = "
                + producto.getCodigoFabricante() + ";";
    }*/

    public void modificarProductos(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET nombre= '" + producto.getNombre()
                + "',codigo_fabricante= " + producto.getCodigoFabricante() + ",precio= "
                + producto.getPrecio() + "WHERE codigo = "
                + producto.getCodigo() + ";";

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El producto no puede ser nulo");
            }
            String template = "DELETE FROM producto WHERE codigo = '%s';";
            String sql = String.format(template, producto.getCodigo());
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Hubo un error al eliminar el producto");
        }
    }

    public List<Producto> obtenerProducto() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";

            consultarDatabase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            while (resultSet.next()) {
                producto = new Producto();
                producto.setCodigo(resultSet.getInt(1));
                producto.setNombre(resultSet.getString(2));
                producto.setPrecio(resultSet.getDouble(3));
                producto.setCodigoFabricante(resultSet.getInt(4));
                productos.add(producto);
            }
            return productos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener productos");
        } finally {
            desconectarDatabase();
        }
    }

    public List<Producto> obtenerProductoPorRangoPrecio() throws Exception {
        try {
            String sql = "SELECT * FROM producto p INNER JOIN fabricante f ON p.codigo_fabricante=f.codigo WHERE precio BETWEEN 120 AND 202 ORDER BY p.nombre ASC;";

            consultarDatabase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;
            while (resultSet.next()) {
                producto = new Producto();
                fabricante = new Fabricante();
                producto.setCodigo(resultSet.getInt(1));
                producto.setNombre(resultSet.getString(2));
                producto.setPrecio(resultSet.getDouble(3));
                fabricante.setCodigo(resultSet.getInt(5));
                fabricante.setNombre(resultSet.getString(6));
                producto.setCodigoFabricante(resultSet.getInt(7));
                productos.add(producto);
            }
            return productos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener productos");
        } finally {
            desconectarDatabase();
        }
    }
    
    /*Funcion para obtener el codigo*/
    public static String OBTENER_ID(int cod) {
        return "SELECT * FROM producto WHERE codigo = " + cod + ";";
    }
    
    public Producto obtenerProductoPorCodigo(int cod) throws Exception {
        try {
             String sql = OBTENER_ID(cod);
        
        consultarDatabase(sql);
        
        Producto productoModificado = new Producto();
       while (resultSet.next()) {

                productoModificado.setCodigo(resultSet.getInt(1));

                productoModificado.setNombre(resultSet.getString(2));

                productoModificado.setPrecio(resultSet.getDouble(3));

                productoModificado.setCodigoFabricante(resultSet.getInt(4));
            }

            return productoModificado;

        } catch (Exception e) {
            System.out.println(e.toString());
            throw new Exception("Error al obtener el producto");
        }finally{
            desconectarDatabase();
        }
       
    }


    public List<String> obtenerProductoNombre() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto ORDER BY nombre ASC;";

            consultarDatabase(sql);

            List<String> nombreProductos = new ArrayList<>();
            String nombreProducto;
            while (resultSet.next()) {
                nombreProducto = resultSet.getString(1);
                nombreProductos.add(nombreProducto);
            }
            return nombreProductos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener productos");
        } finally {
            desconectarDatabase();
        }
    }

    public List<Producto> mostrarTodosLosPortatiles() throws Exception {
        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {

            String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%portátil%'";

            consultarDatabase(sql);

            Producto producto = null;

            while (resultSet.next()) {

                producto = new Producto();

                producto.setNombre(resultSet.getString(1));
                producto.setPrecio(resultSet.getDouble(2));

                ListaProductos.add(producto);
            }

            return ListaProductos;

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarDatabase();
        }

    }

    public List<Producto> mostrarNombrePrecioProductoMasBarato() throws Exception {

        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;";

            consultarDatabase(sql);

            Producto producto = null;

            while (resultSet.next()) {

                producto = new Producto();

                producto.setNombre(resultSet.getString(1));
                producto.setPrecio(resultSet.getDouble(2));

                ListaProductos.add(producto);
            }
            return ListaProductos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDatabase();
        }
    }

}
