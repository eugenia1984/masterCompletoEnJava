package SeccionArreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numerosReordenados = new int[10];
        int total = numeros.length;
        int total2 = numerosReordenados.length;

        // for para completar con valores
        for(int i = 0; i < total; i++) {
            numeros[i] = i + 1;
        }
        // For para mostrarlo 1ro - ultimo - 2do - anteúltimo...
        // Y también llenar el array numerosReordenados
        int aux = 0;
        for(int i = 0; i < total/2; i++) {
            numerosReordenados[aux++] = numeros[i];
            numerosReordenados[aux] = numeros[total-1-i];
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[total-1-i] + " ");

        }

        System.out.println("");
        System.out.println("************************");

        // for para completar con valores
        for(int i = 0; i < total2; i++) {
            System.out.print(numerosReordenados[i] + " - ");
        }
    }
}