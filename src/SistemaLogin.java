import java.util.ArrayList;

public class SistemaLogin {

    private final ArrayList<Usuario> usuarios = new ArrayList<>();

    // Añadir usuario
    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    // Login por correo y password
    public Usuario login(String correo, String password) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public Usuario getUsuarioPorDni(String dni) {
        for (Usuario u : usuarios) {
            if (u.getDni().equals(dni)) {
                return u;
            }
        }
        return null;
    }

    // Eliminar usuario por DNI
    public boolean eliminarUsuario(String dni) {
        return usuarios.removeIf(u -> u.getDni().equals(dni));
    }

    // Ver todos los usuarios
    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " " + u.getApellido() + " - DNI: " + u.getDni() + " - Email: " + u.getCorreo());
        }
    }

    // Obtener lista completa de usuarios
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
