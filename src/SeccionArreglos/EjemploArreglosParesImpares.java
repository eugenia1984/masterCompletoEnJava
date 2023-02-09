package SeccionArreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a, pares, impares;
        int totalPares = 0;
        int totalImpares = 0;

        a = new int[10];

        System.out.println("Ingrese 10 números enteros: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // como todavía no se cuantos pares e impares tengo
        // no puedo darle la dimensión a mis otros arrays
        for(int i = 0; i < a.length; i++) {
            if(a[i]%2==0) {
                totalPares+=1;
            } else {
                totalImpares+=1;
            }
        }
        // Ahora si puedo dar dimension a mis arrays de pares e impares
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int arrPar = 0;
        int arrImpar= 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i]%2==0) {
                pares[arrPar++] = a[i];
            } else {
                impares[arrImpar++] = a[i];
            }
        }

        System.out.println("\n*** PARES ****");
        for(int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n*** IMPARES ****");
        for(int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

    }
}