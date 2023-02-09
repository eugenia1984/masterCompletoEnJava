package SeccionArreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInvertido(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        System.out.println("***** Invertido *****");
        for(int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
            System.out.println("Para i(" + i + ") : " + arreglo[i]);
        }
    }
    public static void main(String[] args) {

       String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Chromecast 4ta generación", "MacBook Pro"};

       int total = productos.length;
        System.out.println("**************** Como esta *****************");
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice : " + i + " : " + productos[i]);
        }

       Collections.reverse(Arrays.asList(productos));

       System.out.println("********* En forma inversa con Collections.reverse **********");
       for(int i = 0; i < total; i++) {
           System.out.println("Para indice : " + i + " : " + productos[i]);
       }

       // arregloInvertido(productos);

    }
}