package SeccionClaseWrapper;

class Persona {
    // atributo
    private String nombre;

    // modifico el nombre
    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    // getter
    public String leerNombre() {
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // Instancio un objeto de la clase persona
        Persona persona = new Persona();
        persona.modificarNombre("Maria");
        System.out.println("El nombre de persona es : " + persona.leerNombre()); // Maria
        test(persona); // aca si me modifica el nombre en mi persona, me cambia el objeto
        System.out.println("El nombre de persona es : " + persona.leerNombre()); // Pepe
    }

    public static void test(Persona persona) {
        System.out.println("Inicializamos el métodos test");
        // modifica el nombre
        persona.modificarNombre("Pepe");
        System.out.println("Finalizamos el métodos test");
    }
}