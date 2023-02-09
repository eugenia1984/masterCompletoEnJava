package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Ingresa un números entero: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\r\nIngrese un número entero a buscar: ");
        int num = sc.nextInt();
        int i = 0;
        while (i < arr.length && arr[i] != num) {
            i++;
        }

        if(i == arr.length) {
            System.out.println("Numero no encontrado");
        } else if(arr[i] == num) {
            System.out.println("Encontrado en la posición :" + i);
        }
    }
}