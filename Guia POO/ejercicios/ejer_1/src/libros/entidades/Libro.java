package libros.entidades;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Libro {

    Scanner read = new Scanner(System.in);

    /*ATRIBUTOS**/
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    /*CONTRUCTOR VACIO*/
    public Libro() {

    }

    /*CONSTUCTOR*/
    public Libro(int isbn, String Titulo, String Autor, int numpaginas) {
        this.ISBN = isbn;
        this.titulo = Titulo;
        this.autor = Autor;
        this.numPaginas = numpaginas;
    }

    //getter y setter
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    /**
     *
     * @param ISBN
     * @param numeroPaginas
     * 
     */
    public void cargarLibro(int ISBN, int numeroPaginas) {
        System.out.println("Ingresa el ISBN");
        this.ISBN = read.nextInt();
        System.out.println("Ingresa El numero de paginas");
        this.numPaginas = read.nextInt();
    }
     public void cargarLibro(String titulo,String autor){
         System.out.println("Ingresa el nombre del libro");
         this.titulo =read.next();
         System.out.println("Ingresa el nombre del autor");
         this.autor = read.next();
     }
     

    @Override
    public String toString() {
        return "El libro " + titulo.toUpperCase() +" tiene como numero de ISBN  "+ ISBN + " Un total de " + numPaginas +" paginas "+" Y su autor es " + autor.toUpperCase() ;
    }
    



}
