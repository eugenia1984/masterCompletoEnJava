package SeccionPOOClasesObjetos;

public class EjemploAuto {
    public static void main(String[] args) {
        Auto auto = new Auto("Peugeot", "208");
        Auto auto2 = new Auto("Mazda", "BT-58", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        // por más que tengan los mismos atributos son distintos objetos
        Auto auto3 = new Auto("Mazda", "BT-58", Color.ROJO, new Motor(3.0, TipoMotor.NAFTA));
        Auto auto4 = new Auto(); // lo creo con el constructor vacío

        // Completo con sus atributos
        Motor motorAuto = new Motor(2.0, TipoMotor.DIESEL);
        auto.setMotor(motorAuto);
        auto.setCapacidadTanque(new Estanque());
        auto.setColor(Color.ROJO);

        // Lo muestro por consola
        System.out.println("\n*** Auto ***\n" + auto.detalle());
        System.out.println("\n*** Auto2 ***\n" + auto2.detalle());
        System.out.println("\n*** Auto3 ***\n" + auto3.detalle());

        System.out.println(auto); // SeccionPOOClasesObjetos.Automovil@1b6d3586 sin toString
        System.out.println(auto.acelararFrenar(3000));

        System.out.println("Kilómeto por litro " + auto.calcularConsumo(300, 0.75f));
        System.out.println("Kilómeto por litro " + auto.calcularConsumo(300, 60));
    }
}