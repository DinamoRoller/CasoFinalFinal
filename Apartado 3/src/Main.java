import java.util.*;


public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menú:");
            System.out.println("1. Cargar un usuario");
            System.out.println("2. Publicar un tweet");
            System.out.println("3. Ordenar usuarios por email (ascendente)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int option = Utils.leerEntero(scanner);

            switch (option) {
                case 1:
                    // Lógica para cargar un usuario
                    break;
                case 2:
                    // Lógica para publicar un tweet
                    break;
                case 3:
                    // Lógica para ordenar usuarios por email
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
