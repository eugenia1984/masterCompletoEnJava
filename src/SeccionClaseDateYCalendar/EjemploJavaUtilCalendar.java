package SeccionClaseDateYCalendar;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Calendar es abstract no se puede instanciar con new
        Calendar calendario = Calendar.getInstance();

        // Setteo una nueva fecha con el método set()
        // el mes empieza en 0 que es enero -> Calendar.JANUARY : 0
        calendario.set(2020, Calendar.JANUARY, 25, 19, 20, 10);
        // otro modo es asignando el valor parte por parte
        /*
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25); // de 0 a 24
        // con Calendar.HOUR de 1 a 12, es para AM y PM
        // calendario.set(Calendar.Hour, 7);
        // calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE; 20);
        calendario.set(Calendar.SECOND, 55);
        calendario.set(Calendario.MILLISECOND, 125);
        */
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);
    }
}