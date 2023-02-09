package SeccionClaseDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        // tiene que coincidir con el patron yyyy-MM-dd
        System.out.println("Ingrese una fecha con formato yyyy-MM-dd: ");
        try {
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fechaActual = new Date();

            if(fecha.after(fechaActual)) {
                System.out.println("La fecha ingresada es mayor que la actual.");
            } else if(fecha.before(fechaActual)) {
                System.out.println("La fecha ingresada es menor a la actual.");
            } else {
                System.out.println("La fecha ingresada es igual a la actual.");
            }

            if(fecha.compareTo(fechaActual) > 0) {
                System.out.println("-compareTo - La fecha ingresada es mayor que la actual.");
            } else if(fecha.compareTo(fechaActual) < 0) {
                System.out.println("-compareTo - La fecha ingresada es menor a la actual.");
            } else {
                System.out.println("-compareTo - La fecha ingresada es igual a la actual.");
            }
        } catch (ParseException e) {
            // e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser: yyyy-MM-dd");
            // Para salir con System.exit
            // System.exit(1);
            main(args); // otra opción es volver a invocar al main
        }
    }
}