package registro_empresa;

public class Usuario extends Persona {
    private String nombre_usuario;
    private String password;

    public Usuario(String nombre, String apellido, int edad, String nombre_usuario, String password) {
        super(nombre, apellido, edad);
        this.nombre_usuario = nombre_usuario;
        this.password = password;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
