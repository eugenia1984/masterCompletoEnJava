package SeccionClaseMath;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        // es más flexible el objeto Random
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        Random randomObj = new Random();
        
        // nextInt()
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        // aleatorio entre 0-7, sin incluir el 7
        randomInt = randomObj.nextInt(7);
        System.out.println("randomInt entre 0 y 7 (7 no incluido) = " + randomInt);
        // aleatorio entre 15-25, sin incluir 25
        randomInt = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt entre 15 y 25 (25 no incluido) = " + randomInt);

        // nextLong()
        int randomLong = randomObj.nextInt();
        System.out.println("randomLong = " + randomLong);
        
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomLong = " + randomLong);
        System.out.println("colores = " + colores[randomInt]);
    }
}