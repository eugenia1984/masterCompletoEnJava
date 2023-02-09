package SeccionIntroduccion;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        // interactivo con ventana emergente
        String numeroStr = JOptionPane.showInputDialog(null, "Ingresa un número entero: ");

        int numeroDecimal = 0; // asigno un valor por defecto
        // Manejo de errores con try-catch
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args); // invoco la método para volver a pedir el numero
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario); // 111110100
        // antepongo ob para que sea binario
        int numeroBinario = 0b111110100;
        // lo interpreta como binario pero escribe como decimal
        System.out.println("numeroBinario = " + numeroBinario); // 500
        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal); // 764
        // sistema octal
        // antepongo un 0
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal); // 500
        String mensajeHexadecimal = "hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal); // 1f4
        // sistema hexadecimal, antepongo 0x
        int numeroHex = 0x1f4; // 500
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = mensajeBinario;
        // += para concatenar strings
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}