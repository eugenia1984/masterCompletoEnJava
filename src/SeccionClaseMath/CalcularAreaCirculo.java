package SeccionClaseMath;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = 0.00;
        double area = 0.00;
        try {
            System.out.println("Ingresa el radio del circulo para calcular el área: ");
            radio = sc.nextDouble();
            area = Math.PI * Math.sqrt(radio);
            // redondeo a dos decimales
            area = (Math.round(area * 100.0) / 100.0);
            System.out.println("El area es = " + area);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}