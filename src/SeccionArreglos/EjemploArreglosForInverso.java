package SeccionArreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

       String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Chromecast 4ta generación", "MacBook Pro"};
        /*
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "MacBook Pro";
         */

        // recorro array con for inverso (en orden decreciente)
        int total = productos.length;
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice : " + (total-1-i) + " : " + productos[total-1-i]);
        }

        // Otro modo
        for(int i = total-1 ; i > 0; i--) {
            System.out.println("Para i(" + i + ") : " + productos[i]);
        }

    }
}