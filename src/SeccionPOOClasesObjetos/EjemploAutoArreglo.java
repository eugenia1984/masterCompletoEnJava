package SeccionPOOClasesObjetos;

import java.util.Arrays;

public class EjemploAutoArreglo {
    public static void main(String[] args) {
        Persona conductorAuto = new Persona("Maria", "Martinez");
        Persona conductorAuto2 = new Persona("Ana", "Costa");

        Auto auto = new Auto("Peugeot", "208");
        Auto auto2 = new Auto("Mazda", "BT-58", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        Auto auto3 = new Auto("Mazda", "BT-58", Color.ROJO, new Motor(3.0, TipoMotor.NAFTA));
        Auto auto4 = new Auto("Audi", "A3");

        // Agrego atributos a auto
        Motor motorAuto = new Motor(2.0, TipoMotor.DIESEL);
        auto.setMotor(motorAuto);
        auto.setCapacidadTanque(new Estanque());
        auto.setColor(Color.ROJO);
        auto.setConductor(conductorAuto);
        // Agrego atributos a auto2
        auto2.setConductor(conductorAuto2);
        // Agrego atributos a auto4
        auto4.setConductor(new Persona("Agustin", "Perez"));

        // Lo muestro por consola
        System.out.println("\n*** Auto ***\n" + auto.detalle());
        System.out.println("\n*** Auto2 ***\n" + auto2.detalle());
        System.out.println("\n*** Auto3 ***\n" + auto3.detalle());
        System.out.println("\n*** Auto4 ***\n" + auto4.detalle());

        // HAgo un array con mis autos
        Auto[] autos = new Auto[4];
        autos[0] = auto;
        autos[1] = auto2;
        autos[2] = auto3;
        autos[3] = auto4;

        // Muestro el array con el método toString
        Arrays.sort(autos);
        for(int i = 0 ; i < autos.length; i++) {
            System.out.println(autos[i].toString());
        }
    }
}