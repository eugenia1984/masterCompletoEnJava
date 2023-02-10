package SeccionMatrices;

public class EjemploMatrizSimetrica {
    public static void main(String[] args) {
        /*
        De la diagonal principal es como un espejo
        de la diagonal inferior.
        Es simétrica si es igual a su transpuesta.
        La fila es igual a la columna
        */
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        boolean esSimetrica = true;
        int i, j;
        i = 0;
        while( i < matriz.length && esSimetrica == true) {
            j=0;
            while(j < i && esSimetrica == true) {
                if(matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                }
                j++;
            }
            i++;
        }

        /*
        // con el for
        boolean esSimetrica = true;
        salir: for(int i=0;  < matriz.length; i++) {

            for(int j = 0; j < i; j++) {
                if(matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break salir;
                }
            }
        }
        */
        System.out.println("Es simetrica? " + esSimetrica);
    }
}