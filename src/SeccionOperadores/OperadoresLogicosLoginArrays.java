package SeccionOperadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArrays {
    public static void main(String[] args) {
        boolean isAutheticated = false;
        // DEclaro y adigno los valores
        String[] userNames = {"eugenia", "admin"};
        String[] passwords = {"12345", "12345"};
        /*
        // 1ro creo una nueva instancia de array y 2do doy dimension
        // el array no es dinámico
        String[] userNames = new String[2];
        String[] passwords = new String[2];
        userNames[0] = "eugenia";
        userNames[1] = "admin";
        passwords[0] = "12345";
        passwords[1] = "12345";
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario : ");
        String userNameInput = scanner.next();
        System.out.println("Ingrese el password: ");
        String passwordInput = scanner.next();

        // iteramos con un for
        for(int i = 0; i < userNames.length; i++) {
            if(userNames[i].equals(userNameInput) && passwords[i].equals(passwordInput) ) {
                isAutheticated = true;
            }
        }

        if(isAutheticated) {
            System.out.println("Bienvenido, usuario: ".concat(userNameInput).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrectas :(");
            System.out.println("Requiere autenticación");
        }
    }
}