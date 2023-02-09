package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int elemento, posicion, ultimo;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9): ");
        posicion = sc.nextInt();

        ultimo = arr[arr.length-1];
        for(int i = arr.length-2; i >= posicion; i--) {
            arr[i+1] = arr[i];
        }
        int[] arr2 = new int[arr.length+1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[posicion] = elemento;

        arr2[arr2.length-1] = ultimo;

        System.out.println("El arreglo: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
    }
}