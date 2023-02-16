package SeccionPOOSobrecarga;
import static SeccionPOOSobrecarga.Calculadora.sumar;
// Al importarlo se puede usar como método propio de la clase, no es necesario: Calculadora.sumar()

public class EjemploSobrecarga {
    public static void main(String[] args) {
        // No puedo instanciar porque es con constructor PRIVATE
        System.out.println("Suma int: " + sumar(10, 5)); // 15
        System.out.println("Sumar float : " + sumar(10.0F, 5F)); // 15.0
        System.out.println("Sumar float-int : " + sumar(10F, 5)); // 15.0
        System.out.println("Sumar int-float : " + sumar(10, 5.0F)); // 15.0
        System.out.println("Sumar double : " + sumar(10.0, 5.0)); // 15.0
        System.out.println("Sumar String : " + sumar("10", "5")); // 15
        System.out.println("Sumar tres int: " + sumar(10, 5, 3)); // 18

        // Conversión automática
        System.out.println("Sumar long : " + sumar(10L, 5L)); // Se almacena en un FLOAT -> 15.0
        System.out.println("Sumar int : " + sumar(10, '@')); // Char @ : 64 -> 10 + 64 : 74 Se almacena en ENTERO

        // Uso el que tiene parametros variables
        System.out.println("Sumar 4 elementos: " + sumar(1, 2, 3, 4)); // 10
        System.out.println("Suman float + n int: " + sumar(10.5F, 5, 9, 15)); // 39.5
    }
}