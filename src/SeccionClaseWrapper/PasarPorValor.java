package SeccionClaseWrapper;
public class PasarPorValor {
    public static void main(String[] args) {
        // toda variable PRIMITIVA siempre se PASA POR VALOR
        // y no por referencia (no es un objeto)
        int i = 10;
        System.out.println("Iniciamos el main con i = " + i);
        test(i); // se pasa el valor, no la referencia la objeto
        System.out.println("Finalizamos el main con i = " + i); // 10
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finalizamos el métodos test con i = " + i);
    }
}