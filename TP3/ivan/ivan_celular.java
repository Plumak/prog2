import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;
    private ArrayList<Contacto> contactosRepetidos;

    public Celular() {
        contactos = new ArrayList<>();
        contactosRepetidos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    // Método para mostrar los contactos repetidos
    public void mostrarContactosRepetidos() {
        for (Contacto contacto : this.contactosRepetidos) {
            System.out.println(contacto);
        }
    }

    public void buscarContactosRepetidos() {
        for (int c1 = 0; c1 < contactos.size(); c1++) { // recorro la lista de contactos con c1
            for (int c2 = c1 + 1; c2 < contactos.size(); c2++) { // recorro la lista de contactos con c2, empezando
                                                                 // desde c1 + 1
                if (contactos.get(c1).equals(contactos.get(c2))) { // si el contacto en la posicion c1 es igual al
                                                                   // contacto en la posicion c2
                    contactosRepetidos.add(contactos.get(c1)); // agrego el contacto en la posicion c1 a la lista de
                                                               // contactos repetidos
                }
            }
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular();
        Contacto c1 = new Contacto("Juan", "123456");
        Contacto c2 = new Contacto("Ana", "654321");
        Contacto c3 = new Contacto("JuaN", "123456"); // Repetido
        Contacto c4 = new Contacto("Luis", "111222");
        Contacto c5 = new Contacto("JUAN", "123456"); // Repetido

        celular.agregarContacto(c1);
        celular.agregarContacto(c2);
        celular.agregarContacto(c3);
        celular.agregarContacto(c4);
        celular.agregarContacto(c5);

        System.out.println("Contactos en el celular:");
        celular.mostrarContactos();

        celular.buscarContactosRepetidos();
        System.out.println("\nContactos repetidos:");
        celular.mostrarContactosRepetidos();
    }

}
