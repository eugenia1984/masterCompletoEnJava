package SeccionOperadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (condicion)? siEsTrue : siEsFalse;
        // es un if else abreviado en una línea
        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencia = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matemáticas, entre 0 a 10: ");
        matematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de ciencia, entre 0 a 10: ");
        ciencia = sc.nextDouble();
        System.out.println("Ingrese la nota de historia, entre 0 a 10: ");
        historia = sc.nextDouble();
        // calculo el promedio
        promedio = (matematicas + ciencia + historia) / 3;
        // obtengo el estado, dependiendo del promedio
        estado = promedio >= 6.00 ? "Aprobado" : "Desaprobado";
        System.out.println("Estado = " + estado); // Aprobado

    }
}