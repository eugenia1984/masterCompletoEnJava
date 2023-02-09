package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int numero, ultimo;
        int posicion = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("Ingrese un número a insertar: ");
        numero = sc.nextInt();

        ultimo = arr[arr.length - 1];
        // obtengo la posición
        while(posicion < 6 && numero > arr[posicion]) {
            posicion++;
        }
        // desplazo los elementos
        for(int i = arr.length-2; i >= posicion; i--) {
            arr[i+1] = arr[i];
        }

        // creo un nuevo arreglo
        int[] arr2 = new int[arr.length+1];
        // me copio los datos del arreglo que ya tengo
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        // asignamos
        if(numero > ultimo) {
            arr2[arr2.length - 1] = numero;
        } else {
            arr2[arr2.length - 1] = ultimo;
            arr2[posicion] = numero;
        }

        System.out.print("El nuevo arreglo ordenado es: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}