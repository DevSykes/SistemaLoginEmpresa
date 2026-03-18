public class Trabajador extends Usuario {

    public Trabajador(String username, String password, String nombre) {
        super(username, password, nombre);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== MENU TRABAJADOR ===");
        System.out.println("1. Fiichar");
        System.out.println("0. Salir");
    }
}