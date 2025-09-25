package sistema_encuestas;

import java.util.ArrayList;

public class Empleado {
    private String dni;
    private String nombre;
    private ArrayList <Encuesta> encuestasRealizadas;
    public Empleado(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        this.encuestasRealizadas = new ArrayList<>();
    }
    public int cantEncuestasRealizadas(){
        return encuestasRealizadas.size();
    }
    public void agregarEncuesta(Encuesta e) {
    this.encuestasRealizadas.add(e);
}
}
