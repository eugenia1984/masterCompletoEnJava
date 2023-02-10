package SeccionMatrices;

public class EjemploMatricesMatrizMarco {
    public static void main(String[] args) {
        int[][] matrizIdentidad = new int[6][6];

        for(int i =0; i < matrizIdentidad.length; i++) {
            for(int j = 0; j < matrizIdentidad[i].length; j++) {
                if(i == 0 || i ==  matrizIdentidad.length -1
                || j == 0 || j == matrizIdentidad.length -1 || i == j ) {
                    matrizIdentidad[i][j] = 1;
                }
            }
        }

        // Muestro
        System.out.println("**** Matriz Marco ****");
        for(int i =0; i < matrizIdentidad.length; i++) {
            for(int j = 0; j < matrizIdentidad[i].length; j++) {
                System.out.print(matrizIdentidad[i][j] + "\t");
            }
            System.out.println();
        }
    }
}