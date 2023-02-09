package SeccionIntroduccion;

public class PrimitivosBoleanos {
    public static void main(String[] args) {
        boolean datoLogico1 = false;
        System.out.println("datoLogico = " + datoLogico1);
        boolean datoLogico2 = Boolean.TRUE;
        System.out.println("datoLogico2 = " + datoLogico2);
        // para comprobar en condicionales u operdores relacionales
        double d = 98765.43e-3;
        System.out.println("d = " + d);
        float f = 1.2345e2f;
        System.out.println("f = " + f);
        boolean datoLogico3 = d > f;
        System.out.println("Es d mayor a f ? = " + datoLogico3);
    }
}