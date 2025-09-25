package agenda_personal;

public class Asistente {
    private String nombre;
    private String nro_telefono;
    private String mail;
    public Asistente(){
        this.nombre = nombre;
        this.nro_telefono = nro_telefono;
        this.mail = mail;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNro_telefono() {
        return nro_telefono;
    }
    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
}
