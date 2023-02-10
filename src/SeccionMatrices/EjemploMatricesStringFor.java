package SeccionMatrices;

public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2]; // 3 filas - 2 columnas
        /* Le asigno valores - Inicializo */
        // Fila 1
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        // Fila 1
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        // Fila 1
        nombres[2][0] = "Jose";
        nombres[2][1] = "Ana";

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