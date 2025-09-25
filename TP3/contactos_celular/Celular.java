package contactos_celular;

import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;
    private ArrayList<Contacto> contactos_repetidos;
    private int cant_contactos;
    private int cant_contactos_repetidos;
    private double promedio_edad;

    public Celular(int cant_contactos, int cant_contactos_repetidos, int promedio_edad) {
        this.contactos = new ArrayList<>();
        this.contactos_repetidos = new ArrayList<>();
        this.cant_contactos = cant_contactos();
        this.cant_contactos_repetidos = cant_contactos_repetidos();
        this.promedio_edad = promedio_edad();
    }

    public void agregarContacto(Contacto contacto) {
        if (contacto != null) {
            if (contacto_repetido(contacto)) {
                contactos_repetidos.add(contacto);
            } else {
                contactos.add(contacto);
            }

        }
    }

    public boolean contacto_repetido(Contacto contacto) {
        boolean repetido = false;
        for (Contacto c : contactos) {
           /*  if (contacto.getNombre().equalsIgnoreCase(c.getNombre())
                    && contacto.getApellido().equalsIgnoreCase(c.getApellido())
                    && contacto.getNro_telefono().equals(c.getNro_telefono())) {
                repetido = true;
            } */
           if(contactos.contains(contacto)){
            repetido = true;
           }
        }
        return repetido;
    }

    public double promedio_edad() {
        double suma = 0;
        for (Contacto c : contactos) {
            suma += c.calcularEdad();
        }
        double resultado = suma / contactos.size();
        return resultado;
    }

    public int cant_contactos() {
        return contactos.size();
    }

    public int cant_contactos_repetidos() {
        return contactos_repetidos.size();
    }

}