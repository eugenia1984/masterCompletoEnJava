package SeccionHilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        /** Para agregarle el ruido cuando entra a la nueva trea **/
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Timer timer = new Timer();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        /** TimerTask es una clase ABSTRACT que implementa la Interfaz Runnable **/
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if(i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea " + i + " periodica en: " + new Date() +
                            ", nombre del Thread : " + Thread.currentThread().getName());
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
            // 5000 es el delay con el que empieza a correr la tarea
            // 10000 es el intervalo de tiempo entre tarea y tarea, si la anterior no finaliza se acomodan
        }, 5000, 10000);


        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos...");
    }
}