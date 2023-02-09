package SeccionClaseMath;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        // Math.random() -> general un numero aleatorio entre 0 y 1(1 no inclusive, nunca llega a 1)
        double random = Math.random();
        System.out.println("Math.random() = " + random);

        // Número aleatorio entre 0 y 7 (sin incluir el 7)
        random *= 7;
        System.out.printf("random entre 0 y 7 = %s%n", random);

        // Para mostrar un color aleatorio
        double randomColores = Math.random();
        randomColores *= colores.length;
        System.out.println("colores = " + colores[(int)randomColores]);
    }
}