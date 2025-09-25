package sueldos;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private int sueldo_fijo;
    public Empleado(String nombre, String apellido, String dni, int sueldo_fijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo_fijo = sueldo_fijo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getSueldo_fijo() {
        return sueldo_fijo;
    }
    public void setSueldo_fijo(int sueldo_fijo) {
        this.sueldo_fijo = sueldo_fijo;
    }
    public int calcularSueldo(){
        return sueldo_fijo;
    }
}
