import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        // Nombre, Apellido, DNI, Correo, Password
        sistema.agregarUsuario(new Administrador("Admin", "Sistemas", "00000000A", "admin@g.com", "1234"));

        while (true) {
            System.out.println("=== LOGIN ===");
            System.out.print("Correo: ");
            String user = sc.nextLine();

            System.out.print("Password: ");
            String pass = sc.nextLine();

            Usuario u = sistema.login(user, pass);

            if (u == null) {
                System.out.println("Credenciales incorrectas\n");
                continue;
            }

            System.out.println("Te damos la bienvenida, " + u.getNombre());

            u.mostrarMenu(sistema);

            System.out.println();
        }
    }
}
