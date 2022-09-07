package ejer_1;
import java.util.Scanner;
import libros.entidades.Libro;
/**
 *
 * @author Adri
 */
public class ejer1Libro {
/**
     * @param args the command line arguments
     */
    
/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
    public static void main(String[] args) {
       Scanner read =new Scanner(System.in);
       
       Libro libro1 = new Libro();
       
        
        //Cargar libros
        libro1.cargarLibro(0, 0);
        libro1.cargarLibro(null, null);
        //mostrar libro
        System.out.println(libro1.toString());
    }
    
}
