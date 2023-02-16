package SeccionPOOSobrecarga;

public class Calculadora {
    private Calculadora() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int... argumentos) { // para tener argumentos variables
        int total = 0;
        for(int i: argumentos) {
            total += i;
        }
        return total;
    }
    public static float sumar(float x, float y) {
        return x + y;
    }

    public static float sumar(int i, float j) {
        return i + j;
    }
    public static float sumar(float a, int... argumentos ) { // otro ejemplo con parametros variables
        float total = a;
        for(int i : argumentos) {
            total +=i;
        }
        return total;
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch(NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}