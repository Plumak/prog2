public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }

    @Override
    public boolean equals(Object obj) {
        Contacto otro = (Contacto) obj; // convierto el obj a otro (Contacto)
        if (this.nombre.equalsIgnoreCase(otro.nombre) && this.telefono.equalsIgnoreCase(otro.telefono)) { // si
                                                                                                          // this.nombre
                                                                                                          // es igual a
                                                                                                          // otro.nombre
                                                                                                          // y
                                                                                                          // this.telefono
                                                                                                          // es igual a
                                                                                                          // otro.telefono
            return true; // retorno true
        }
        return false; // si no, retorno false
    }

}
