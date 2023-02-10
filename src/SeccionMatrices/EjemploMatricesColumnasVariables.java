package SeccionMatrices;

public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {
        // no le defino la cantidad de columnas, queda variable
        int[][] matriz = new int[3][];

        matriz[0] = new int[2]; // 2 columnas
        matriz[1] = new int[3]; // 3 columnas
        matriz[2] = new int[4]; // 4 columnas
        System.out.println("Matriz length : " + matriz.length);
        System.out.println("Fila 0 length : " + matriz[0].length);
        System.out.println("Fila 1 length : " + matriz[1].length);
        System.out.println("Fila 2 length : " + matriz[2].length);

        /* Relleno la matriz */
        for(int i =0; i <matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }

        /* Muestro la matriz*/
        for(int i =0; i <matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}