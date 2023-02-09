package SeccionArreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosOrdenamientoBurbuja {

    public static void main(String[] args) {

       String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Chromecast 4ta generación", "MacBook Pro"};

       int total = productos.length;

       // Ordenamos con método burbuja
        int contador = 0;

       for(int i = 0; i < total; i++) { // recorre cada elemento
            for(int j = 0;  j < total; j++) {
                if(productos[i].compareTo(productos[j]) < 0) {
                    // intercambiamos las posiciones
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
       }

       System.out.println("contador = " + contador);
       System.out.println("********* Ordenamos con método burbuja **********");
       for(int i = 0; i < total; i++) {
           System.out.println("Para indice : " + i + " : " + productos[i]);
       }

    }
}