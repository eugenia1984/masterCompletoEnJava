package SeccionMatrices;

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        // Lo mismo que antes, pero de forma simplificada
        // String[][] nombres = new String[3][2];
        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Jose", "Ana"}};

        /* Recorro con for, para mostrarlos */
        System.out.println("*** Recorro con un for ***");
        for(int i = 0; i < nombres.length; i++) {
            for(int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] +" ");
            }
            System.out.println();
        }

        /* Recorro con for Each, para mostrarlos */
        System.out.println("*** Recorro con un forEach ***");
        for(String[] fila: nombres) {
            for(String nombre: fila) {
                System.out.print(nombre +" ");
            }
            System.out.println();
        }
    }
}