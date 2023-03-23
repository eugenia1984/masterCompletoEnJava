package SeccionLambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        /** Consumer:
         * Es una expresión lambda que permite pasar por argumento
         * un solo parámetro(del tipo del genérico)
         * Y se le puede implementar alguna función a lo que se pasa por parámetro
         * Es un método VOID, sin return.
         * -> es un CONSUMIDOR del PARÁMETRO del MÉTODO
         */

        /** Consumer: una EXPRESIÓN LAMBDA se traduce a una INTERFAZ FUNCIONAL **/
        // Si la expresión lambda tiene solo una línea de código se omiten las {}
        Consumer<String> consumidor1 = saludo -> System.out.println(saludo);
        // más resumido
        Consumer<String> consumidor3 = System.out::println;

        // Como la expresión lambda tiene más de una línea de código, van las {}
        // fecha o (Date fecha) o (fecha) porque al ser uno solo, puedo omitir ()
        // Y como el Date esta indicado en <> lo puedo omitir
        Consumer<Date> consumidor2 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                System.out.println(f.format(fecha));
        };

        consumidor1.accept("Hola");
        consumidor2.accept(new Date());
        consumidor3.accept("Saludo resumido");

        // Ejemplo de uso, imprimir array de nombres
        List<String> nombres = Arrays.asList("Andrés", "Luz", "Marcos", "Ana");
        nombres.forEach(consumidor3);
    }
}