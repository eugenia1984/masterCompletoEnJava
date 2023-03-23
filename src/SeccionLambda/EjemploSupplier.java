package SeccionLambda;

import SeccionLambda.models.Usuario;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EjemploSupplier {
    public static void main(String[] args) {
        /** Supplier -> devuelve un valor **/

        // Modo más extenso
        Supplier<String> proveedor1 = () -> {
            return "Hola mundo lambda supplier - versión extensa -";
        };
        System.out.println(proveedor1.get());

        // Modo simplificado:
        Supplier<String> proveedor2 = () -> "Hola mundo lambda supplier - versión simplificada -";
        System.out.println(proveedor2.get());

        // Ejemplo creo un usuario con Supplier
        // En vez de: Supplier<Usuario> creaUsuario = () -> new Usuario();
        // Expresión lambda que crea el objeto
        Supplier<Usuario> creaUsuario = Usuario::new;

        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Mark");
        System.out.println("\nNombre usuario: " + usuario.getNombre());
    }
}