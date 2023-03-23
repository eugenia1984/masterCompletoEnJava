package SeccionLambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    public double computar(double a, double b, Aritmetica lambda) {
        return  lambda.operacion(a,b);
    }

    /** Las expresiones lambda no soportan sobrecarga de métodos,
     * por lo que se cambia el nombre de esta función **/
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}