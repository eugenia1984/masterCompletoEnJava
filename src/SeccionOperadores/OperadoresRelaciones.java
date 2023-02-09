package SeccionOperadores;

public class OperadoresRelaciones {
    public static void main(String[] args) {
        int i = 3;
        byte b = 7;
        float f = 127e-7F;
        double d = 2.1412e3;
        boolean bool = false;

        // Igual a -> ==
        boolean result1 = i == b; // false
        System.out.println("result1 = " + result1);
        boolean result4 = bool == true; // false
        System.out.println("result4 = " + result4);

        // ! -> negación para invertir
        boolean result2 = !result1; // true
        System.out.println("result2 = " + result2);
        
        // Distinto a -> !=
        boolean result3 = i != b; // true
        System.out.println("result3 = " + result3); 
        boolean result5 = bool != true; // true
        System.out.println("result5 = " + result5);

        // Mayor que -> >
        boolean result6 = i > b; // false
        System.out.println("result6 = " + result6);

        // Menor que -> <
        boolean result7 = i < b; // true
        System.out.println("result7 = " + result7);
        
        // Mayor o igual -> >=
        boolean result8 = f >= 127e-7F; // true
        System.out.println("result8 = " + result8);
        
        // Menor o igual -> <=
        boolean result9 = d <= 2.1412e3; // true
        System.out.println("result9 = " + result9);

        // Primero siempre se evalua la relación
        // y luego se asigna el valor
    }
}