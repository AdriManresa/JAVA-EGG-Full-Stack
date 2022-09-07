/*Solo deben estas los ATRIBUTOS CONSTRUCTORES GETTER, SETTER toString*/
package Entidades;

/**
 *
 * @author Adri
 */
public class Libro {
    /*ATRIBUTOS*/
    private int numPaginas;
    private int ISBN;
    private String autor;
    private String nombreLibro;
    
    /*CONSTRUCTOR*/

    public Libro() {
    }

    public Libro(int numPaginas, int ISBN, String autor, String nombreLibro) {
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
        this.autor = autor;
        this.nombreLibro = nombreLibro;
    }
/*GETTERS AND SETTERS*/
    
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public String toString() {
        return "Libro{" + "numPaginas=" + numPaginas + ", ISBN=" + ISBN + ", autor=" + autor + ", nombreLibro=" + nombreLibro + '}';
    }  
}
