package SeccionString;

public class EjemploString {
    public static void main(String[] args) {
        // se crea la instancia en la literal, de forma directa, sin el constructor: new String()
        String course1 = "Programación Java";
        String course2 = new String("programación java");
        boolean isEqual = course1 == course2;
        System.out.println("isEqual = " + isEqual); // false
        isEqual = course1.equalsIgnoreCase(course2);
        System.out.println("isEqual = " + isEqual); // true
        String course3 = "Programación Java";
        isEqual = course1 == course3; // reasigno el objeto en la nueva referencia
        System.out.println("isEqual = " + isEqual); // true
        // es mejor utilizar .equals()
    }
}