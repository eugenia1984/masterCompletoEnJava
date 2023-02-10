package SeccionMatrices;

public class EjemploMatricesTrasponerMatriz {
    public static void main(String[] args) {
        int[][] a,b;
        a = new int[8][4];
        b = new int[4][8];

        // Relleno la matriz a y la muestro
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Relleno la matriz b como transpuesta de a
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("**** Matriz transpuesta ****");

        // Muestro la matriz b
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}