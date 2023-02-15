package SeccionPOOClasesObjetos;

public class EjemploAutoRelacionesObjetos {
    public static void main(String[] args) {
        // instancio a un objeto de tipo Persona para asignar conductor a un auto
        Persona conductorAuto = new Persona("Maria", "Martinez");
        // Inicializo un array de Ruedas para asignarlo a auto
        Rueda[] ruedasAuto = new Rueda[5];
        ruedasAuto[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasAuto[4] = new Rueda("Yokohama", 16, 7.5);

        Auto auto = new Auto("Peugeot", "208");
        Auto auto2 = new Auto("Mazda", "BT-58", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        // por más que tengan los mismos atributos son distintos objetos
        Auto auto3 = new Auto("Mazda", "BT-58", Color.ROJO, new Motor(3.0, TipoMotor.NAFTA));

        // Completo con sus atributos
        Motor motorAuto = new Motor(2.0, TipoMotor.DIESEL);
        auto.setMotor(motorAuto);
        auto.setCapacidadTanque(new Estanque());
        auto.setColor(Color.ROJO);
        auto.setConductor(conductorAuto);
        auto.setRuedas(ruedasAuto);

        // Agrego las ruedas el auto2 con el metodo addRuedas
        Rueda[] ruedas2 = new Rueda[5];
        for(int i =0; i < ruedas2.length; i++) {
            auto2.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        // Lo muestro por consola
        System.out.println("\n*** Auto ***\n" + auto.detalle());
        System.out.println("Ruedas de Auto: ");
        for(Rueda rueda: ruedasAuto) { // muestro las ruedas con un for each
            System.out.print(rueda);
        }
        System.out.println("\n*** Auto2 ***\n" + auto2.detalle());
        System.out.println("\n*** Auto3 ***\n" + auto3.detalle());
    }
}