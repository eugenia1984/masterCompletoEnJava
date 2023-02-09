package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 5 enteros: ");
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        // para calcular el máximo
        int max = 0;
        for(int i = 0; i < arr.length; i++ ){
            max = (arr[max] > arr[i])? max: i;
        }
        System.out.println("El valor máximo ingresado es: " + arr[max]);

    }
}