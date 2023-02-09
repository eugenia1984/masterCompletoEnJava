package SeccionClaseDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
public class EjemploJavaUtilDate2 {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd 'de'  MM, YYYY"); // interpolo String con comilla simple
        // método format
        String fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0; i <1000000; i++) {
            j +=i;
        }
        System.out.println("j " + j) ;

        Date fecha2 = new Date();
        // .getTime() desde 1 JAN 1970
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal + " milisegundos.");
        System.out.println("fechaStr = " + fechaStr);
    }
}