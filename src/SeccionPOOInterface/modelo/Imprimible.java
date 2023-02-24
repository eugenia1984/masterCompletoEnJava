package SeccionPOOInterface.modelo;
/** INTERFAZ:
 * - no tiene atributos, puede tener constantes
 * - ningún método está implementado
 * **/
public interface Imprimible {
    final static String TEXTO_DEFECTO =  "Imprimiendo un valor por defecto";

    // Al ser DEFAULT si la clase que lo implementa no tiene el @Override, va a implementar este
    default String imprimir() {
        return TEXTO_DEFECTO;
    }
    // En vez de : String imprimir();

   static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}