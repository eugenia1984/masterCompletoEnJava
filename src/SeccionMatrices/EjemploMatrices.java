package SeccionMatrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        // Creo la matriz numeros de dimension 2 filas y 4 columnas
        int[][] numeros = new int[2][4];

        // completo la matriz con valores
        // Primer fila
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        // Segunda fila
        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        numeros[1][3] = 8;

        System.out.println("Número de filas : " + numeros.length);
        System.out.println("Número de columnas : " + numeros[0].length);
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Último elemento de la matriz: " + numeros[numeros.length-1][numeros[1].length-1]);

        int num1 = numeros[0][0];
        int num2 =numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];
        // muestro
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
    }
}