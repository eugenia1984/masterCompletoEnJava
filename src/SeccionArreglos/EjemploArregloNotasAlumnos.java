package SeccionArreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vamos a calcular el promedio de notas de 7 alumnos
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumaNotasMatematica = 0, sumaNotasHistoria = 0, sumaNotasLenguaje= 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];


        System.out.println("Ingresa las 7 notas de Matemática: ");
        for(int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = sc.nextDouble();
        }

        System.out.println("Ingresa las 7 notas de Historia: ");
        for(int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = sc.nextDouble();
        }

        System.out.println("Ingresa las 7 notas de Lenguaje: ");
        for(int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = sc.nextDouble();
        }

        for(int i = 0; i < 7; i++) {
            sumaNotasMatematica += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        // calculo los promedios
        double promedioMatematica = sumaNotasMatematica/7;
        double promedioHistoria = sumaNotasHistoria/7;
        double promedioLenguaje = sumaNotasLenguaje/7;
        double promedioTotal = (promedioMatematica + promedioHistoria + promedioLenguaje) / 3;

        System.out.println("El promedio de las notas de Matemáticas es: "+ promedioMatematica);
        System.out.println("El promedio de las notas de Historia es: "+ promedioHistoria);
        System.out.println("El promedio de las notas de Lenguaje es: "+ promedioLenguaje);
        System.out.println("El promedio general es: " + promedioTotal);

    }
}