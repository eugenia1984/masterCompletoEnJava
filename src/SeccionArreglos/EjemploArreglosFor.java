package SeccionArreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        // recorro array con for
        int total = productos.length;
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice : " + i + " : " + productos[i]);
        }

        // asigno valores
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "MacBook Pro";

        // Ordeno los productos en forma alfabética
        // con el método sort() también puedo ordenar otro dato, como números
        Arrays.sort(productos);

        // Muestro los productos con el for each
        for(String producto: productos) {
            System.out.println("producto -  " + producto);
        }

        // Recorro array con un while
        int j = 0;
        while(j < total) {
            System.out.println("Con WHILE - " + j + " : " + productos[j]);
            j++;
        }
        // El for es más optimizado que el while

        // Recorro array con un do while
        int k = 0;
        do {
            System.out.println("Con DO WHILE - " + k + " : " + productos[k]);
            k++;
        } while(k < total);

    }
}