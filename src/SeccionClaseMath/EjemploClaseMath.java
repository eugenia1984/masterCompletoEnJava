package SeccionClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        // Es una clase que no se puede instanciar
        // Solo invocamos sus métodos
        int absoluto = Math.abs(-3);
        System.out.println("Math.abs() -> valor absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("Math.max() -> valor máximo entre dos números: " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Math.min() -> valor mínimo entre dos números: " + min);

        double techo = Math.ceil(3.5);
        System.out.println("math.ciel() -> redondear un decimal hacia arriba " + techo); // 4.0

        double piso = Math.floor(3.5);
        System.out.println("math.floor() -> redondear un decimal hacia abajo " + piso); // 3.0

        long redondeoConEntero = Math.round(3.5);
        System.out.println("Math.round() -> redondeo con entero = " + redondeoConEntero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // logaritmo natural
        double log = Math.log(10);
        System.out.println("logaritmo natural de 10 = " + log);

        // Potencia
        double potencia = Math.pow(10, 3); // 10 al cubo -> 1000.0
        System.out.println("Math.pow() -> potencia = " + potencia);

        // Raiz cuadrada
        double raiz = Math.sqrt(9); // 3.0
        System.out.println("Math.sqrt() -> raíz cuadrada = " + raiz);

        /* Métodos para trigonometría */
        // Pasando de radianes a grados
        double grados = Math.toDegrees(1.57);
        System.out.println("Math.toDegrees() -> de radianes a grados = " + grados);
        // Pasando de grados a radianes
        double radianes = Math.toRadians(89.95437383553926);
        System.out.println("Math.toRadians() -> de grados a radianes = " + radianes);

        /* Funciones de trigonometría */
        System.out.println("sin(90): " + Math.sin(Math.toRadians(90.00))); // 1.00
        System.out.println("cos(180): " + Math.cos(Math.toRadians(180.00))); // 1.00
    }
}