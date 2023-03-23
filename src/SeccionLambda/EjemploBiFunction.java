package SeccionLambda;

import java.util.function.BiFunction;

public class EjemploBiFunction {
    public static void main(String[] args) {
        /** BiFunction recibe dos argumento sy tiene return **/
        // Primer ejemplo
        BiFunction<String, String, String> f1 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r1 = f1.apply("buen ","día");
        System.out.println(r1);

        // Segundo ejemplo con compareTo
        BiFunction<String, String, Integer> f2 = (x,y) -> x.compareTo(y);
        System.out.println(f2.apply("sol", "sol"));
        // Simplificado
        BiFunction<String, String, Integer> f3 = String::compareTo;
        System.out.println(f3.apply("Sol", "sol"));

        // Tercer ejemplo con concat
        BiFunction<String, String, String> f4 = (a,b) -> a.concat(b);
        System.out.println(f4.apply("Buenas ", "tardes"));
        // Simplificado
        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("Buenas ", "noches"));

    }
}