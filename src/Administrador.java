import java.util.Scanner;

public class Administrador extends Usuario {
    private Scanner sc = new Scanner(System.in);

    public Administrador(String nombre, String apellido, String dni, String correo, String password) {
        super(nombre, apellido, dni, correo, password);
    }

    @Override
    public void mostrarMenu(SistemaLogin sistema) {
        int opcion = -1;

        do {
            System.out.println("\n=== MENU ADMINISTRADOR ===");
            System.out.println("1. Dar de alta trabajador");
            System.out.println("2. Ver registros de jornada");
            System.out.println("3. Dar de baja trabajador");
            System.out.println("4. Ver datos de trabajador");
            System.out.println("5. Ver todos los trabajadores");
            System.out.println("6. Cambiar contraseña de un trabajador");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer SIEMPRE después de leer un número
            } catch (Exception e) {
                System.out.println("Error: Por favor ingrese un número válido.");
                sc.nextLine(); // Limpiar buffer en caso de error de entrada
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Password: ");
                    String pass = sc.nextLine();

                    sistema.agregarUsuario(new Trabajador(nombre, apellido, dni, correo, pass));
                    System.out.println("Trabajador creado correctamente");
                    break;

                case 2:
                    LecturaFichajes.leerFichajes();
                    break;

                case 3:
                    System.out.print("Ingrese DNI del trabajador a dar de baja: ");
                    String dniEliminar = sc.nextLine();
                    if (sistema.eliminarUsuario(dniEliminar)) {
                        System.out.println("Trabajador eliminado correctamente");
                    } else {
                        System.out.println("No se encontró trabajador con ese DNI");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese DNI del trabajador para ver datos: ");
                    String dniVer = sc.nextLine();
                    Usuario usuario = sistema.getUsuarioPorDni(dniVer);
                    if (usuario != null) {
                        System.out.println(usuario);
                    } else {
                        System.out.println("No se encontró trabajador con ese DNI");
                    }
                    break;

                case 5:
                    System.out.println("Lista de todos los trabajadores:");
                    for (Usuario u : sistema.getUsuarios()) {
                        System.out.println(u);
                    }
                    break;

                case 6:
                    System.out.print("Ingrese DNI del trabajador para cambiar contraseña: ");
                    String dniCambiar = sc.nextLine();
                    Usuario usuarioCambiar = sistema.getUsuarioPorDni(dniCambiar);
                    if (usuarioCambiar != null) {
                        System.out.print("Ingrese nueva contraseña: ");
                        String nuevaPass = sc.nextLine();
                        usuarioCambiar.setPassword(nuevaPass);
                        System.out.println("Contraseña actualizada correctamente");
                    } else {
                        System.out.println("No se encontró trabajador con ese DNI");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menú de administrador...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    } //
}
