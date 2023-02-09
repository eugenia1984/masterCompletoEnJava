package SeccionOperadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        // pre-incremento, se incrementa y luego se asigna
        int j = ++i; // i = i+1

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //post-incremento, se asigna y luego se incremente
        i= 2;
        System.out.println("Valor inicial de i: "+ i);
        j = i++;
        System.out.println("i (post incremento): " + i);
        System.out.println("j = " + j);

        // Pre-decremento
        i = 3;
        j = --i;
        System.out.println("i (pre decremento): "+i);
        System.out.println("j: "+j);

        // Post-decremento
        i = 4;
        j = i--;
        System.out.println("i(post decremento) : "+i);
        System.out.println("j: "+j); // 4

        System.out.println("(++j) = " + (++j)); // 5
        System.out.println("(++j) = " + (j++)); // 5
        System.out.println("j = " + j); // 6

    }
}