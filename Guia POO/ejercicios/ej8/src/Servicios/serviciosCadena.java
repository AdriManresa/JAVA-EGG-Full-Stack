/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosCadena {

    Scanner read = new Scanner(System.in);

    public Cadena crearCadena() {
        Cadena cad = new Cadena();
        cad.setFrase(read.nextLine().toLowerCase());
        cad.setLongitud(cad.getFrase().length());
        return cad;
    }

    public void mostrarMenu(Cadena cad) {
        System.out.println("1-Crear cadena");
        System.out.println("2-Mostrar vocales de la cadena");
        System.out.println("3-Invertir frase");
        System.out.println("4-Buscar Vocales");
        System.out.println("5-Comparar longitud");
        System.out.println("6-Unir Frases");
        System.out.println("7-Cambiar letras A");
        System.out.println("8-Buscar letra");
        System.out.println("9-Salir");

    }

    public void mostrarVocales(Cadena cad) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int x = 0; x < cad.getFrase().length(); x++) {
            char actual = cad.getFrase().toLowerCase().charAt(x);

            switch (actual) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Total de vocales: " + (a + e + i + o + u));

        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);

    }

    public void invertirFrase(Cadena cad) {
        String cadena = cad.getFrase();
        String invertida = "";
        // Recorremos la original del final al inicio
        for (int i = cadena.length() - 1; i >= 0; i--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            invertida += cadena.charAt(i);
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);

    }

    public int vecesRepetido(Cadena cad, String letra) {
        String caracter = letra;
        String cadena = cad.getFrase();
        int pos = 0;
        int c = 0;
        pos = cadena.indexOf(caracter);
        while (pos != -1) {
            c++;
            pos = cadena.indexOf(caracter, pos + 1);
        }
        System.out.println("la letra " + caracter.toUpperCase() + " se encuentra repetida " + c + " veces");
        return c;

    }

    public String compararLongitud(Cadena cad, String frase) {
        String frase1 = cad.getFrase();
        String frase2 = frase;
        if (frase1.length() > frase2.length()) {
            System.out.println("La frase " + frase1 + " Es mas larga");
        } else {
            System.out.println("La frase " + frase2 + " Es mas larga");
        }
        return frase;
    }

    public String unirFrases(Cadena cad, String frase) {
        String frase1 = cad.getFrase();
        String fraseUnida;
        System.out.println("Ingresa una nueva frase");
        String frase2 = read.nextLine();

        fraseUnida = frase1 + " " + frase2;

        System.out.println("la frase unida quedaria como " + fraseUnida);
        return fraseUnida;
    }

    public String reemplazar(Cadena cad, char remplazo) {
        String newString = cad.getFrase().replace('a', remplazo);

        System.out.println("La frase quedaria como " + newString);

        return newString;

    }

    public void contiene(Cadena cad, String letra) {
        String frase = cad.getFrase();
        if (frase.contains(letra)) {
            System.out.println("La frase " + frase + " contiene la letra " + letra);
        } else {
            System.out.println("La frase  " + frase + "no contioene la letra "+ letra );
        }
    }
}

