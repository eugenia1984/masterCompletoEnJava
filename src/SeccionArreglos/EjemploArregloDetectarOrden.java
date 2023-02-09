package SeccionArreglos;

import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        System.out.println("Ingrese 7 números: ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean esAscendente = false;
        boolean esDescendente = false;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) { // en forma descendente
                esDescendente = true;
            }
            if(arr[i] < arr[i+1]) { // en forma ascendente
                esAscendente = true;
            }
        }

        if(esAscendente == true && esDescendente == true) {
            System.out.println("Arreglo desordenado");
        }

        if(esAscendente == false && esDescendente == false) {
            System.out.println("Son todos iguales");
        }

        if(esAscendente == true && esDescendente == false) {
            System.out.println("Arreglo ascendente");
        }

        if(esAscendente == false && esDescendente == true) {
            System.out.println("Arreglo descendente");
        }
    }
}