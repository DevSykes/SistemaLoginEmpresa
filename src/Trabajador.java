import java.util.Scanner;

public class Trabajador extends Usuario {

    public Trabajador(String nombre, String apellido, String dni, String correo, String password) {
        super(nombre, apellido, dni, correo, password);
    }

    @Override
    public void mostrarMenu(SistemaLogin sistema) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU TRABAJADOR ===");
            System.out.println("1. Fichar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    Fichaje.fichar(this.getCorreo());
                    break;
                case 0:
                    System.out.println("Cerrando sesión de trabajador...");
                    break;
            }

        } while (opcion != 0);
    }
}
