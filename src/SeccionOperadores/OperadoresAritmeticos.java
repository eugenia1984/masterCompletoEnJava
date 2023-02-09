package SeccionOperadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // int i = 5, j = 4;
        int i = 5;
        int j = 4;

        // operador suma : +
        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j : " + i + j); // 54 lo concatena
        System.out.println("i + j : " + (i + j)); // 9 primero hace lo de los ()
        System.out.println( i + j + ": i + j  "); // 9 lo suma

        // operador resta: -
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j : " + (i-j)); // si o si con los (), sino no concatena

        // operador multiplicación: *
        int multi= i*j;
        System.out.println("multiplicación = i * j : " + multi);

        // operador división: /
        int div = i / j;
        System.out.println("div = " + div); // 1 redondea a entero
        // tengo que castear, si no casteo i y j me dara 1.0
        float div2 = (float)i/(float)j;
        System.out.println("div2 = " + div2); // 1.25
        
        // operador resto
        int resto = i % j;
        System.out.println("resto = " + resto); // 1

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if(numero % 2 == 0 ) {
            System.out.println("Numero par: " + numero);
        } else {
            System.out.println("Numero impar: " + numero);
        }
        
    }
}