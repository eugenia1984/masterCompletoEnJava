package SeccionString;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        // se crea la instancia en la literal, de forma directa, sin el constructor: new String()
        String course1 = "Programación Java";
        String professor = "Andrés Guzmán";

        String detail = course1 + " con el profesor: " + professor;
        System.out.println("detail = " + detail);

        int number1 = 10;
        int number2 = 5;
        // con los () cambio la preferencia, primero va a suma
        System.out.println(detail + (number1 + number2));
        // También es importante el orden empieza sumando y luego concatena
        // va de izquierda a derecha
        System.out.println(number1 + number2 + detail );
        // Concatenación con el método .concat()
        String detail2 = course1.concat(" con ").concat(professor);
        System.out.println("detail2 = " + detail2);
        // Concatenando con + se crea otra instancia del String Biulder
        // y se concatena, es mejor con concat()
    }
}