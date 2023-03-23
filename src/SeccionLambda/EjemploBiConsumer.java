package SeccionLambda;

import SeccionLambda.models.Usuario;
import java.util.function.BiConsumer;

public class EjemploBiConsumer {
    public static void main(String[] args) {
        /** Biconsumer: tiene 2 argumentos **/
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre+ " tiene " + edad + " años.");
        consumidorBi.accept("Pepe", 20);

        // Dos Ejemplos de uso con BiConsumer
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        // En forma más extensa
        BiConsumer<Usuario, String> asignarNombre1 = (persona, nombre) -> {
            persona.setNombre(nombre);
        };
        asignarNombre1.accept(usuario1, "Agustín");
        System.out.println("\nNombre de usuario1: " + usuario1.getNombre());

        // En forma más resumida
        BiConsumer<Usuario, String> asignarNombre2 = Usuario::setNombre;
        asignarNombre2.accept(usuario2, "Martin");
        System.out.println("\nNombre de usuario2: " + usuario2.getNombre());
    }
}