package SeccionArreglos;

import java.util.Scanner;

public class EjemplosArreglosEliminarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("ingrese un número: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");

        System.out.println("Ingrese una posición a eliminar (entre 0 y 9 ) : ");
        int posicion = sc.nextInt();
        for(int i = posicion; i < arr.length-1 ; i++ ) {
            arr[i] = arr[i+1];
        }

        int[] arr2 = new int[arr.length-1];
        System.arraycopy(arr, 0, arr2, 0, arr2.length);

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(i+ " -> " +arr2[i]);
        }
    }
}