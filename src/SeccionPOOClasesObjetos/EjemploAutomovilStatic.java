package SeccionPOOClasesObjetos;


public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        // Modifico capacidadTanqueEstatico
        Automovil.setCapacidadTanqueEstatico(45);

        // Instancio objetos de la clase Automovil
        Automovil auto = new Automovil("Peugeot", "208");
        Automovil auto2 = new Automovil("Mazda", "BT-58", Color.AZUL, 3.0);
        auto2.setTipo(TipoAutomovil.COUPE);
        // por más que tengan los mismos atributos son distintos objetos
        Automovil auto3 = new Automovil("Mazda", "BT-58", Color.GRIS, 3.0);
        auto3.setTipo(TipoAutomovil.PICKUP);

        // Completo con atributos a auto
        auto.setColor(Color.ROJO);
        auto.setCilindrada(2.0);
        auto.setTipo(TipoAutomovil.HATCHBACK);

        // modifico el colorPatente
        //Como es de la clase cambia en TODOS los objetos
        Automovil.setColorPatente(Color.NARANJA);

        System.out.println("\nAutomovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("\nKilometros por litros = " + Automovil.calcularConsumoEstatico(300,60));

        // Atributos constantes
        System.out.println("Velocidad maxima en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima en ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        // Muestro por consola los objetos
        System.out.println("\n***** Auto *****\n" + auto.detalle());
        System.out.println("\n***** Auto2 *****\n" + auto2.detalle());
        System.out.println("\n***** Auto3 *****\n" + auto3.detalle());

        // El enum TipoAutomovil
        TipoAutomovil tipoCoupe = auto2.getTipo();
        System.out.println("\nTipo coupé : " + tipoCoupe);
    }
}