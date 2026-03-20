import java.util.ArrayList;

public class SistemaLogin {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Añadir usuario
    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    // Login
    public Usuario login(String username, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    // Buscar usuario por username
    public Usuario buscarUsuario(String username) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    // Eliminar usuario
    public void eliminarUsuario(String username) {
        usuarios.removeIf(u -> u.getUsername().equals(username));
    }

    // Ver todos los usuarios
    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.getUsername() + " - " + u.nombre);
        }
    }
}