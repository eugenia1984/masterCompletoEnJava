package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Ingresa una palabra: ");
            arr[i] = sc.next();
        }

        System.out.println("\r\nIngrese una palabra a buscar: ");
        String palabra = sc.next();
        int i = 0;
       for(; i < arr.length && !arr[i].equalsIgnoreCase(palabra); i++) { }

        if(i == arr.length) {
            System.out.println("Numero no encontrado");
        } else if(arr[i].equals(palabra)) {
            // de no usar equals() puede ser: compareTo(nombre.toLowerCase()) == 0
            System.out.println("Encontrado en la posición :" + i);
        }
    }
}