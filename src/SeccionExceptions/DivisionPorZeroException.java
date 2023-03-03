package SeccionExceptions;

public class DivisionPorZeroException extends Exception {
    public DivisionPorZeroException(String mensaje) {
        super(mensaje);
    }
}