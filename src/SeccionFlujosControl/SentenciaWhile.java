package SeccionFlujosControl;

public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        boolean prueba = true;
        boolean prueba2 = false;

        while(i<5) { // ejecuto el bloque mientras se cumpla la condición
            System.out.println("i : "+i);
            i++;
        }

        while(prueba) { // siempre es true, loop infinito
            if(i == 7) { // aca corto el loop
                prueba = false;
            }
            System.out.print("i = " + i + " / ");
            i++;
        }

        do {
            System.out.println("\nSe ejecuta al menos una sola vez");
        } while(prueba2); // como es false nunca se ejecuta
    }
}