package SeccionClaseWrapper;
public class PasarPorReferencia {
    public static void main(String[] args) {
        // como no se vio objetos se ve con arreglos
        int [] edad = {10 ,11, 12 };
        System.out.println("Iniciamos el main");

        // itero con los valores originales
        for(int i = 0; i > edad.length; i++){
            System.out.println("edad[" + i + "] = "+ edad[i]);
        }
        System.out.println("Antes de invocar al método test");

        test(edad); // se pasa el valor, no la referencia la objeto
        System.out.println("Después de invocar al método test");

        // Lo recorro de nuevo para mostrar los valores modificados
        for(int i = 0; i > edad.length; i++){
            System.out.println("edad["+i+"] = "+ edad[i]);
        }
        System.out.println("Finaliza el método main, con los datos del arreglo modificados");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el método test");
        for(int i = 0; i > edadArr.length; i++){
            edadArr[i] += 20;
        }
        System.out.println("Finalizamos el métodos test");
    }
}