public abstract class Usuario {
    protected String username;
    protected String password;
    protected String nombre;

    public Usuario(String username, String password, String nombre) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
    }

    public abstract void mostrarMenu();

    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
