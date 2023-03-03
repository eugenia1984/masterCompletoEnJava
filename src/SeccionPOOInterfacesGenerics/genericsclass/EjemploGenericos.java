package SeccionPOOInterfacesGenerics.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Pipi", "Caballo"));
        transporteCaballos.add(new Animal("Trueno", "Caballo"));
        transporteCaballos.add(new Animal("Rayo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));

        Camion<Maquinaria> transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        // En vez de : Camion transAuto = new Camion(3); - uso Generics
        Camion<Automovil> transAuto = new Camion(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Fiat"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transporteCaballos);
        imprimirCamion(transMaquinas);
        imprimirCamion(transAuto);
        /*
        // Itero para mostrar la marca de transAuto
        System.out.println("\n* * * * * *  transAuto  * * * * *");
        for(Automovil a: transAuto) { // Itero en Automovil en vez de Object
            // Como uso Generic no tengo que hacer el cast
            // Automovil a = (Automovil) o;
            System.out.println("Tipo : " + a.getMarca());
        }
        */
    }

    public static <T> void imprimirCamion(Camion<T> camion) {
        System.out.println("* * * * * * * * * * * * * * * *");
        for(T a: camion) {
            // Al usar generic tengo que castear
            if(a instanceof Animal) {
                // Para poder usar el getNombre y getTipo
                System.out.println(((Animal)a).getNombre() + " tipo : " +((Animal)a).getTipo());
            } else if(a instanceof Automovil) {
                System.out.println("Tipo : " + ((Automovil)a).getMarca());
            } else if(a instanceof Maquinaria) {
                System.out.println("Tipo : " + ((Maquinaria)a).getTipo());
            }
        }
    }
}