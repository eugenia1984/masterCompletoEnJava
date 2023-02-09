package SeccionFlujosControl;

public class SentenciaForEach {
    public static void main(String[] args) {
        // es para iterar sobre arrays
        int[] numeros = {1, 3, 5, 7, 9, 11, 12, 14};
        String[] nombres = {"Ana", "Pedro", "Luis", "Juan", "Gabriela"};
        // recorro array de numeros
        for(int num : numeros) {
            System.out.println("num = " + num);
        }
        // recorro array de strings
        for(String nombre : nombres) {
            System.out.println(nombre + " ");
        }
    }
}