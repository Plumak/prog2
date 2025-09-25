package agenda_personal;

import java.util.ArrayList;
import java.time.LocalTime;

public class Reunion {
    private String lugar;
    private String tema;
    private double duracion;
    private LocalTime hora;
    private ArrayList<Asistente>asistentes;

    public Reunion(String lugar, String tema, double duracion, LocalTime hora){
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
        
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }
    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    public void agregarAsistentes(Asistente nuevo_asistente){
       asistentes.add(nuevo_asistente);
    }
}
