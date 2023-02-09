package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int numero;
        int posicion = 0;

        for(int i = 0; i < arr.length-1; i++) { // asi el ultimo queda reservado
            System.out.print("Ingrese un número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("Ingrese un número a insertar: ");
        numero = sc.nextInt();
        // obtengo la posición
        while(posicion < 6 && numero > arr[posicion]) {
            posicion++;
        }
        // desplazo los elementos
        for(int i = arr.length-2; i >= posicion; i--) {
            arr[i+1] = arr[i];
        }
        // asignamos
        arr[posicion] = numero;
        System.out.println("El nuevo arreglo ordenado es: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}