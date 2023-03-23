package SeccionLambda;

import SeccionLambda.aritmetica.Aritmetica;
import SeccionLambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        // Aritmetica suma = (a,b) -> a+b;
        Aritmetica suma = Double::sum; // simplificada
        Aritmetica resta = (a,b) -> a-b;

        Calculadora calcu = new Calculadora();
        System.out.println("10 + 5 = " + calcu.computar(10,5, suma));
        System.out.println("10 - 5 = " + calcu.computar(10, 5, resta));
        // implementando la expresión lambda al vuelo
        System.out.println("10 x 5 = " + calcu.computar(10,10, (a,b) -> a * b));

        System.out.println(calcu.computarConBiFunction(10, 5, (a,b) -> a+b));
    }
}