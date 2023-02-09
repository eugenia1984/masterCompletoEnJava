package SeccionOperadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1412e3;
        boolean m = false;

        // AND (&&) todas las condiciones deben cumplirse -> true
        boolean boolean1 = i == j && k > l; //  (i == j) && (k > l) -> F && F
        System.out.println("boolean1 = " + boolean1); // false

        boolean boolean2 = i == i && k > l; //  (i == j) && (k > l) -> V && F
        System.out.println("boolean2 = " + boolean2); // false

        // OR (||) al menos una condición debe cumplirse -> true
        boolean boolean3 = i == i || k > l; //   V || F
        System.out.println("boolean3 = " + boolean3); // true

        // si tengo && y ||, primero evalúo lo de && y luego lo de ||
    }
}