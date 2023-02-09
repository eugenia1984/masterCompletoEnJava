package SeccionClaseDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        // dia mes nro HH:mm:ss
        // Mon Feb 06 14:30:01 ART 2023

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM YYYY");
        SimpleDateFormat df2 = new SimpleDateFormat("dd - MM - YYYY");
        SimpleDateFormat df3 = new SimpleDateFormat("dd 'de'  MM, YYYY"); // interpolo String con comilla simple
        // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        // dd días
        // MM mes en número
        // MMM mes con las 3 letras
        // MMMM mes en palabra
        // YYYY años

        // método format
        String fechaStr = df.format(fecha);
        String fechaStr2 = df2.format(fecha);
        String fechaStr3 = df3.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        System.out.println("fechaStr2 = " + fechaStr2);
        System.out.println("fechaStr3 = " + fechaStr3);
    }
}