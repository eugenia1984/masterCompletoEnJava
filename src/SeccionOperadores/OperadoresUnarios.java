package SeccionOperadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;
        int j = +i; // j = 1 * j => -5
        System.out.println("j : " + j);
        
        int k = -i; // k = (-1)*i => 5
        System.out.println("k : " + k);

        j = 6;
        i = +i;
        System.out.println("j : "+ j); // es positivo

        k = -i;
        System.out.println("k :" + k);
    }
}