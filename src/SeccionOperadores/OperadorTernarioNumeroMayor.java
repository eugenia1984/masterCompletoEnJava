package SeccionOperadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int num1, num2, num3;
        System.out.println("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese un tercer numero: ");
        num3 = sc.nextInt();

        // Calculamos el mayor
        max = (num1 > num2)? num1 : num2;
        max = (max > num3)? max: num3;
        System.out.println("El máximo entre "+num1+", "+num2+", "+num3+" es = " + max);

    }
}