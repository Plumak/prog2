package contactos_celular;

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String nro_telefono;
    private String direccion;
    private String mail;
    private String ciudad;
    private int edad;

    public Contacto(String nombre, String apellido, LocalDate fecha_nacimiento, String nro_telefono, String direccion,
            String mail, String ciudad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nro_telefono = nro_telefono;
        this.direccion = direccion;
        this.mail = mail;
        this.ciudad = ciudad;
        this.edad = calcularEdad();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return edad = hoy.getYear() - fecha_nacimiento.getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNro_telefono() {
        return nro_telefono;
    }

    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
