package SeccionArreglos;

public class EjemploArreglosCombinados2 {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        // completo el array a
        for(int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        // completo el array b, con múltiplos de 5
        for(int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;
        }

        // completo el array c con los números de a y b
        int aux = 0;
        for(int i = 0; i < b.length; i+=2) {
            for(int j = 0; j < 2 ; j++ ) {
                c[aux++] = a[i+j];
            }
            for(int j = 0; j < 2 ; j++ ) {
                c[aux++] = b[i+j];
            }
        }

        // muestro los arrays
        System.out.println("******** array a ************");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n******** array b ************");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n******** array c ************");
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}