public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String correo;
    protected String password;

    public Usuario(String nombre, String apellido, String dni, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.password = password;
    }

    // parámetro para que coincida con Administrador
    public abstract void mostrarMenu(SistemaLogin sistema);

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public String getCorreo() { return correo; }
    public String getPassword() { return password; }

    // Setter para cambiar la contraseña
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "TRABAJADOR -> Nombre: " + nombre + " " + apellido + " | DNI: " + dni + " | Correo: " + correo;
    }

}
