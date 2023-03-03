package SeccionExceptions;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un numero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un numero denominador: ");

        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch(NumberFormatException nfe) {
            System.out.println("Se debe ingresar un numero - " + nfe.getMessage());
        } catch(FormatoNumeroException e) {
            System.out.println("Se detecto una excepción, ingrese un número válido - " + e.getMessage());
            e.printStackTrace(System.out);
        } catch(DivisionPorZeroException ae) {  // al ser CHECKED hay que manejarla
            System.out.println("No se puede dividir por cero - " + ae.getMessage());
        } catch(Exception e) { // es mas particular
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + e.getMessage());
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin excepción");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación");
    }
}