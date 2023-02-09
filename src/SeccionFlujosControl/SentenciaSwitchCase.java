package SeccionFlujosControl;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 3;
        int mes = 0;
        String nombreMes = "";

        // El valor a comprobar puede ser int, double, float,
        // char, String, enum
        switch (num) {
            case 0:
                System.out.println("num es 0");
                break;
            case 1:
                System.out.println("num es 1");
                break;
            case 2:
                System.out.println("num es 2");
                break;
            case 3:
                System.out.println("num es 3");
                break;
            default:
                System.out.println("num es 4 o un número entero mayor a 4");
        }
        try {
            System.out.println("Ingrese un número enero (del 1 al 12), para decirle que mes es: ");
            mes = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Debe ingresar un entero entre 1 y 12");
            main(args);

        }

        // Switch para determinar el mes
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Numero incorrecto";
        }
        System.out.println("El mes es: " + nombreMes);
    }
}