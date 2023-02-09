package SeccionOperadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArraysTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAutheticated = false;
        String[] userNames = {"eugenia", "admin"};
        String[] passwords = {"12345", "12345"};

        System.out.println("Ingrese el usuario : ");
        String userNameInput = scanner.next();
        System.out.println("Ingrese el password: ");
        String passwordInput = scanner.next();

        // iteramos con un for
        for(int i = 0; i < userNames.length; i++) {
            isAutheticated = (userNames[i].equals(userNameInput) && passwords[i].equals(passwordInput))? true : isAutheticated;
        }

        String mensaje = isAutheticated ? "Bienvenido, usuario: ".concat(userNameInput).concat("!") :
                "Usuario o contraseña incorrectas :( \nLo siento, requiere autenticación";
        System.out.println(mensaje);
    }
}