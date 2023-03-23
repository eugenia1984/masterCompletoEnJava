package SeccionLambda;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        /** Predicate -> siempre devuelve BOOLEAN **/
        // Ejemplo 1 con operador lógico
        Predicate<Integer> test = num -> num > 10;
        boolean resultado = test.test(7);
        System.out.println("resultado de 7 > 10 => " + resultado);
        boolean resultado2 = test.test(11);
        System.out.println("resultado de 11 > 10 => " + resultado2);

        // Ejemplo 2 con equals
        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("RULE_USER : "+ test2.test("RULE_USER"));
        System.out.println("ROLE_ADMIN: " + test2.test("ROLE_ADMIN"));
    }
}