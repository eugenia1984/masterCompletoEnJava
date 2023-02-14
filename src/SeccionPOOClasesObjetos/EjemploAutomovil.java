package SeccionPOOClasesObjetos;

import java.sql.SQLOutput;
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Date fecha = new Date();
        // Instancio un objeto de la clase Automovil
        Automovil auto = new Automovil("Peugeot", "208");
        Automovil auto2 = new Automovil("Mazda", "BT-58", Color.ROJO, 3.0);
        // por más que tengan los mismos atributos son distintos objetos
        Automovil auto3 = new Automovil("Mazda", "BT-58", Color.ROJO, 3.0);
        Automovil auto4 = new Automovil(); // lo creo con el constructor vacío

        // Completo con sus atributos
        auto.setColor(Color.ROJO);
        auto.setCilindrada(2.0);

        // Lo muestro por consola
        System.out.println("\n*** Auto ***\n" + auto.detalle());
        System.out.println("\n*** Auto2 ***\n" + auto2.detalle());
        System.out.println("\n*** Auto3 ***\n" + auto3.detalle());
        // comprobamos que no son iguales
        System.out.println("auto2 es igual a auto3? " + (auto2 == auto3));
        System.out.println("auto2 es igual a auto3 -con equals-? " + auto2.equals(auto3));
        System.out.println("auto4 y auto2 con iguales? " + auto4.equals(auto2)); /// valido que no sea null
        System.out.println("fecha es igual a auto2? " + fecha.equals(auto2)); // valido que sean del mismo tipo

        System.out.println(auto); // SeccionPOOClasesObjetos.Automovil@1b6d3586 sin toString
        System.out.println(auto.acelararFrenar(3000));

        System.out.println("Kilómeto por litro " + auto.calcularConsumo(300, 0.75f));
        System.out.println("Kilómeto por litro " + auto.calcularConsumo(300, 60));
    }
}