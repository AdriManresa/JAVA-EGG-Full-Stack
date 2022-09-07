
package mascotaap;

import java.util.Scanner;
import entidades.Mascota;

/**
 *
 * @author Adri
 */
public class MascotAAP {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //asigna el objeto
        //new hace nacer el objeto
        Mascota m1 = new Mascota();

        m1.apodo ="chiquito";
        m1.nombre =read.next();
        m1.tipo ="Perro";
        m1.edad =14;
        m1.raza= "Beagle";
        m1.cola=true;
        m1.color="tricolor";

        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);

    }
}
