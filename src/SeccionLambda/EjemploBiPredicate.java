package SeccionLambda;

import SeccionLambda.models.Usuario;

import java.util.function.BiPredicate;

public class EjemploBiPredicate {
    public static void main(String[] args) {
        /** EXpresiones boleanas en expresiones lambda. Similar al Predicate, pero recibe 2 parámetros **/

        // Primer ejemplo de String con equals
        BiPredicate<String, String> t = (a,b) -> a.equals(b);
        System.out.println(t.test("hola", "hola"));
        // Ejemplo simplificado
        BiPredicate<String, String> t2 = String::equalsIgnoreCase;
        System.out.println(t2.test("Hola", "hola"));

        // Segundo ejemplo con Integer
        BiPredicate<Integer, Integer> t3 = (i,j) -> j > i;
        boolean resultado1 = t3.test(4,4);
        System.out.println("resultado1 4 > 4  =>  " + resultado1);

        // Tercer ejemplo
        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        user1.setNombre("María");
        user2.setNombre("María");
        BiPredicate<Usuario, Usuario> t4 = (u1, u2) -> u1.getNombre().equals(u2.getNombre());
        System.out.println("Ejemplo de usuarios : " + t4.test(user1, user2));
    }
}