package SeccionArreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        // array de 4 elementos de tipo int
        // declaración
        String[] productos = new String[7];
        int[] numeros = new int[4];

        // inicialización del array-designar valores-
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[numeros.length-1] = 40;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "MacBook Pro";

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        // Ordeno los productos en forma alfabética
        // con el método sort() también puedo ordenar otro dato, como números
        Arrays.sort(productos);

        // Muestro los productos con el for each
        for(String producto: productos) {
            System.out.println("producto -  " + producto);
        }
    }
}