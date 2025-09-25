package registro_empresa;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Persona> personas;
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPersona(Persona nueva_persona){
        personas.add(nueva_persona);
    }
    public void imprimirPersonas(){
        for(Persona p : personas)
         p.getNombre() + p.getApellido() + p.getEdad() + p.getCargo();
    }
}
