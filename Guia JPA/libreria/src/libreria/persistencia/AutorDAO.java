package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor> {

    @Override
    public void editar(Autor autor) {
        super.editar(autor);
    }

    public Autor GuardarAutor(Autor autor) throws Exception {
        try {
            super.guardar(autor);
            return autor;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al guardar el Autor");
        }
    }

    public List<Autor> mostrarTodosLosAutores() {
        conectar();
        List<Autor> listaAutores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return listaAutores;
    }

    public Autor obtenerAutorPorid(int id_autor) throws Exception {
        if (id_autor >= 0) {
            if (id_autor <= 0) {
                throw new Exception("El id no es valido");
            }
        } else {
            throw new Exception("El id es valido");
        }
        conectar();

        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id_autor").setParameter("id_autor", id_autor).getSingleResult();
        System.out.println(autor.getNombre());
        desconectar();
        return autor;
    }

    public Autor obtenerAutorPorNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre ingresado es invalido");
        }
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }

}
