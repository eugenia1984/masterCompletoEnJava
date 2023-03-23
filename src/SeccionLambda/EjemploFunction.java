package SeccionLambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        /**
         * Combinación entre el Consumer (que recibe un argumento) y
         * el Supplier (que retorna/devuelve algún resultado)
         * **/
        Function<String, String> f1 = param -> {
            return "Hola que tal" + param;
        };

        // Simplificado
        Function<String, String> f2 = nombre -> "Hola que tal, " + nombre;

        /** Function es una Interfaz con el método .apply() **/
        String resultado = f2.apply("Carlos");
        System.out.println(resultado);

        /** Ejemplo de referencia de métodos **/
        Function<String, String> f3 = param -> param.toUpperCase();
        // Simplificado
        Function<String, String> f4 = String::toUpperCase;
        System.out.println(f4.apply("Pipi"));
    }
}