package SeccionString;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String course = null;
        // valido para no tener el NullPointerException
        boolean isNull = course == null;
        System.out.println("isNull = " + isNull); // true

        // Lo niego para que no sea nulo, sino al ejecutarse
        // voy a tener NullPointerException
        if(!isNull) {
            System.out.println(course.toUpperCase());
            System.out.println(course.concat(" desde cero!"));
            System.out.println("Bienvenidos al curso".concat(course));
        }

        // asi no me lanza el error pero me da nulo
        System.out.println("Bienvenidos al curso : " + course);

        // Le asign un valo si es null
        if(course == null) {
            course= "Programacion Java";
        }
        System.out.println("Bienvenidos al curso : "+ course);

        // El caso de que es un String vacío
        course = "";
        // evalúo si es vacío
        // puedo también decir si es mayor a 0, ahi no es vacío
        boolean isEmpty = course.length() == 0; // true
        System.out.println("isEmpty = " + isEmpty);
        // Como es vacío no se ejecuta
        if(!isEmpty) {
            System.out.println(course.toUpperCase());
            System.out.println("Bienvenidos al curso: "+course);
        }

        // Método .isEmpty() del String
        boolean isEmpty2 = course.isEmpty(); // true
        System.out.println("isEmpty2 = " + isEmpty2);

        // Método .isBlank(), es más estricto que .isEmpty(),
        // valida que no sea null, que sea distinto de Empty
        // y que tenga contenido distinto a un espacio en blanco
        // boolean isBlank = course.isBlack();
        // Esta a partir de Java 11
        // la forma más estricta de validar es con isBlank()
    }
}