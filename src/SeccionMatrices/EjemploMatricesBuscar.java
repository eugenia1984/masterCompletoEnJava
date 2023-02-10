package SeccionMatrices;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {35, 98, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoABuscar = 15;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar:  for( i = 0; i < matrizDeEnteros.length; i++){
            for( j = 0; j < matrizDeEnteros[i].length; j++){
                if(matrizDeEnteros[i][j] == elementoABuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado) {
            System.out.println("Encontrado " + elementoABuscar +
                    "en las coordenadas: " + i + " - "+ j);
        } else {
            System.out.println("No se encontró " + elementoABuscar);
        }
    }
}