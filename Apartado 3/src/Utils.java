import java.util.Scanner;

public class Utils {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    public static boolean isValidAlias(String alias) {
        return alias != null && alias.matches("[a-zA-Z0-9]+");
    }

    public static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Introduzca un número entero válido:");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
