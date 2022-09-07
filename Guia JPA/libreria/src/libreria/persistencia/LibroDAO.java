package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Adri
 */
public class LibroDAO extends DAO<Libro> {

    /*inserta el libro en la base de datos*/
    public Libro GuardarLibro(Libro libro) throws Exception {
        try {
            super.guardar(libro);
            return libro;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al guardar el libro");
        }

    }

    /*Actualiza la informacion en la base de datos*/
    public void ActualizarLibro(Libro libro) throws Exception {

        try {
            super.editar(libro);

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al actualizar libro");
        }

    }

    /*Elimina la informacion en la base de datos*/
    public void EliminarLibro(Libro libro) throws Exception {

        try {
            super.eliminar(libro);

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al eliminar libro");
        }

    }

    public List<Libro> obtenerTodosLosLibros() {
        conectar();
        List listaLibros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return listaLibros;

    }

    public Libro obtenerLibrosporISBN(Long isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> obtenerLibrosPorAutor(String nombre) {
        conectar();
        List<Libro> listaLibros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return listaLibros;
    }

    public List<Libro> obtenerLibrosPorEditorial(String nombre) {
        conectar();
        List<Libro> listaLibros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return listaLibros;

    }

    public Libro obtenerLibroPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;

    }
}
