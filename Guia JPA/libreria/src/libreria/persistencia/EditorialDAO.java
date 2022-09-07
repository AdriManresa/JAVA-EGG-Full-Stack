package libreria.persistencia;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO<Editorial> {
        private final Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        
    public Editorial GuardarEditorial(Editorial editorial) throws Exception {
        
        try {
            super.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al guardar la Editorial");
        }
        
    }
    
    public List<Editorial> obtenerTodosLasEditoriales() {
        conectar();
        List listaEditoriales = em.createQuery("SELECT l FROM Editorial l").getResultList();
        desconectar();
        return listaEditoriales;
    }
    
    public Editorial obtenerEditorialPorId(int id_editorial) throws Exception {
        
        if (id_editorial >= 0) {
            if (id_editorial <= 0) {
                throw new Exception("El id no es valido");
                
            }
        }else{
            throw new Exception("El id es valido");
        }
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id_editorial").setParameter("id_editorial", id_editorial).getSingleResult();
        System.out.println("NOMBRE: "+ editorial.getNombre());
        desconectar();
        return editorial;
    }
    public Editorial obtenerEditorialPorNombre(String nombre) throws Exception{
        if (nombre == null|| nombre.trim().isEmpty()) {
            throw new Exception("El nombre ingresado es invalido");   
        }
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
    


}
