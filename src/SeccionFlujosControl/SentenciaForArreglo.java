package SeccionFlujosControl;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        // String[] nombres = new String[6];
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lola", "Bea", "Pato", "Pepa" };
        int count = nombres.length;

        for(int i = 0; i < count; i++) {
            // Para que no imprima Andres ni Pepe
            if(nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].equalsIgnoreCase("pepe")) {
               continue;
            }
            System.out.print(nombres[i] + " ");
        }
    }
}