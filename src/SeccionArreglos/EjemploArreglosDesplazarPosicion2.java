package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int elemento, posicion;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9): ");
        posicion = sc.nextInt();

        for(int i = arr.length-2; i >= posicion; i--) {
            arr[i+1] = arr[i];
        }
        arr[posicion] = elemento;

        System.out.println("El arreglo: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}