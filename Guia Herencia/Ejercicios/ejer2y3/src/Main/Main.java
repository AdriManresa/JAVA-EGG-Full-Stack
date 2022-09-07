package Main;

import Contantes.Constantes;
import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int sumaTelevisores = 0;
        int sumaLavarropas = 0;
        int sumaProductos = 0;

        ArrayList<Electrodomesticos> list = new ArrayList();

        for (int i = 0; i <= 4; i++) {
            if (i % 2 == 0) {
                Televisor tele = new Televisor(1000, true, i, "Negro", "A", 100);
                System.out.println(Constantes.CREAR_TELEVISOR);
                list.add(tele);
            } else {
                Lavadora lava = new Lavadora(20, 500, "blanco", "A", 50);
                System.out.println(Constantes.CREAR_LAVADORA);
                list.add(lava);
            }
        }

        Iterator<Electrodomesticos> it = list.iterator();

        int cont = 0;

        while (it.hasNext()) {
            System.out.println("Contador " + cont);
            int precio;
            Electrodomesticos elec = it.next();
            if (elec instanceof Televisor) {
                Televisor tele = (Televisor) elec;
                tele.precioFinal();
                sumaTelevisores += tele.getPrecio();
                precio = tele.getPrecio();
            } else{
                Lavadora lava = (Lavadora) elec;
                lava.precioFinal();
                sumaLavarropas += lava.getPrecio();
                precio = lava.getPrecio();
            }
            cont++;
            sumaProductos += precio;
        }


        System.out.println("Valores finales\n" +
                "Suma Televisores: " + sumaTelevisores + "\n" +
                "Suma Lavarropas: " + sumaLavarropas + "\n" +
                "Suma total: " + sumaProductos);
    }

}
