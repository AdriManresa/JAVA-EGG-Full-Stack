
package tienda;

import tienda.servicios.MainServicio;



public class Main {

    
    public static void main(String[] args) {
        MainServicio principalServicio = new MainServicio();
        try {
            principalServicio.menuPrincipal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
