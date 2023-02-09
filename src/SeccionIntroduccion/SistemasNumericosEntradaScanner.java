package SeccionIntroduccion;

import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        // Instancio un objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // Pido los datos por consola
        System.out.println("Ingresa un número entero: ");

        int numeroDecimal = 0; // asigno un valor por defecto

        try {
            /* obtengo el dato ingresado y asigno en la variable */
            numeroDecimal = scanner.nextInt(numeroDecimal);
        } catch(Exception e) {  // InputMismatchException
            System.out.println("Error, debe ingresar un número entero");
            main(args); // invoco la método para volver a pedir el numero
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        // += para concatenar strings
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        System.out.println(mensaje);
    }
}