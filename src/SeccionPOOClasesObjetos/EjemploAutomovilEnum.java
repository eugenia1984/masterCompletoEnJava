package SeccionPOOClasesObjetos;


public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        // Modifico capacidadTanqueEstatico
        Automovil.setCapacidadTanqueEstatico(45);

        Automovil auto = new Automovil("Peugeot", "208");
        Automovil auto2 = new Automovil("Mazda", "BT-58", Color.AZUL, 3.0);
        auto2.setTipo(TipoAutomovil.COUPE);
        // por más que tengan los mismos atributos son distintos objetos
        Automovil auto3 = new Automovil("Mazda", "BT-58", Color.GRIS, 3.0);
        auto3.setTipo(TipoAutomovil.PICKUP);
        auto.setColor(Color.ROJO);
        auto.setCilindrada(2.0);
        auto.setTipo(TipoAutomovil.HATCHBACK);
        // modifico el colorPatente, como es de la clase cambia en TODOS los objetos
        Automovil.setColorPatente(Color.NARANJA);
        System.out.println("\nAutomovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("\nKilometros por litros = " + Automovil.calcularConsumoEstatico(300,60));

        // Muestro por consola los objetos
        System.out.println("\n***** Auto *****\n" + auto.detalle());
        System.out.println("\n***** Auto2 *****\n" + auto2.detalle());
        System.out.println("\n***** Auto3 *****\n" + auto3.detalle());

        // El enum TipoAutomovil
        TipoAutomovil tipoCoupe = auto2.getTipo();
        System.out.println("\nTipo coupé : " + tipoCoupe);
        // Desde Java 13 en adelante hay un switch mejorado no va el break y en vez de : va ->
        /********* SWITCH CON ENUM *********/
        switch(tipoCoupe) {
            case CONVERTIBLE:
                System.out.println("El automóvil es deportivo y descapotable de dos puestas.");
                break;
            case COUPE:
                System.out.println("Es un automóvil pequeño de dos puestas y típicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automóvil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automóvil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automóvil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automóvil más grande, con maleta grande");
                break;
        }

        /******* Array de TipoAutomovil *******/
        TipoAutomovil[] tipos = TipoAutomovil.values();
        // Recorro con un forEach
        for(TipoAutomovil tipo : tipos) {
            System.out.print(tipo + " => " + tipo.name() + " , "+
                    tipo.getNombre() + " , "+
                    tipo.getDescripcion() + " , "+
                    tipo.getNumeroPuertas());
            System.out.println();
        }

    }
}