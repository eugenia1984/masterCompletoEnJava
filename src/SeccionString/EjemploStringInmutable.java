package SeccionString;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        // se crea la instancia en la literal, de forma directa, sin el constructor: new String()
        String course1 = "Programación Java";
        String professor = "Andrés Guzmán";
        // El String es inmutable, si se modifica se retorna una nueva instancia
        // Concat retorna una nueva instancia de un nuevo objeto
        String result = course1.concat(professor);
        // se comprueba que no modifica a course1
        System.out.println("Course : "+course1);
        System.out.println("Result: " + result);
        System.out.println(course1.equals(result)); // false, es nueva instancia

        // Expresión lambda (función flecha)
        // El método transform () de cadena de Java se utiliza para aplicar
        // una función a esta cadena. La función debe aceptar un solo
        // argumento de cadena y devolver un objeto. Este método de
        // utilidad se agregó a la clase String en la versión Java 12.
        /*
        El método de transformación se define de la siguiente manera:
        public <R> R transform(Function<? super String, ? extends R> f) {
            return f.apply(this);
         }
         el Function es una interfaz funcional que acepta un argumento
         y produce un objeto de resultado.
         */
        /*
        course1.transform(c -> {
            return c + " con " + professor;
        });
         */

        // Método .replace()
        // retorna nueva instancia, no varia el String original
        String result2 = result.replace("a", "A");
        System.out.println("result2 = " + result2);
    }
}