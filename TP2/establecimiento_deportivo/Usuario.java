package establecimiento_deportivo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {
    private String dni;
    private String nombre; 
    private ArrayList<Turno> historialTurnos;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.historialTurnos = new ArrayList<>();
    }
      public boolean esSocio() {
        LocalDateTime haceDosMeses = LocalDateTime.now().minusMonths(2);
        int contador = 0;
        for (Turno t : historialTurnos) {
            if (t.getHora().isAfter(haceDosMeses)) {
                contador++;
            }
        }
      //  return contador >= 4;
       if(contador >=4){
                return true;
            }
            else{
                return false;
            }
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public ArrayList<Turno> getHistorialTurnos() {
        return historialTurnos;
    }
    public void setHistorialTurnos(ArrayList<Turno> historialTurnos) {
        this.historialTurnos = historialTurnos;
    }
}
