package Main;

import Utils.Orquestador;

public class Main extends Orquestador {

    public static void main(String[] args) {
        Orquestador orquestador = new Orquestador();
        try {
            orquestador.menuPrincipal();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
