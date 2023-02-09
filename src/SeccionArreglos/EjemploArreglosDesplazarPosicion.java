package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int ultimo;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un número: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        ultimo = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = ultimo;

        System.out.println("El arreglo: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}