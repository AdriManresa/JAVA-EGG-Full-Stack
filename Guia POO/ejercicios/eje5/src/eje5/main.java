
package eje5;

import Entidades.cuentaBancaria;
import Servicios.serviciosCuentaBancaria;

public class main {


    public static void main(String[] args) {

        serviciosCuentaBancaria sBank = new serviciosCuentaBancaria();
        
        cuentaBancaria newoperation = sBank.crearCuenta();
        
        /*ingresar dinero*/
        sBank.ingreso(newoperation);
        /*Retirar dinero*/
        sBank.retirar(newoperation);
        /*Extraccion rapida*/
        sBank.extraccionRapida(newoperation);
        /*Consulta*/
        sBank.consultarDatos(newoperation);
        sBank.consultarSaldo(newoperation);
    }
    
}
