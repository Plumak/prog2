package seleccion_futbol;
import java.time.LocalDate;

public class Futbolista extends Integrante {
    private String posicion;
    private String pierna_habil;
    private int cant_goles;
     public Futbolista(String nombre, String apellido, String nro_pasaporte, LocalDate nacimiento, boolean viajando, boolean esta_en_pais_origen, boolean esta_concentrando, String posicion, String pierna_habil, int cant_goles){
     super(nombre,apellido,nro_pasaporte,nacimiento,viajando,esta_en_pais_origen,esta_concentrando);
        this.posicion = posicion;
        this.pierna_habil = pierna_habil;
        this.cant_goles = cant_goles;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPierna_habil() {
        return pierna_habil;
    }
    public void setPierna_habil(String pierna_habil) {
        this.pierna_habil = pierna_habil;
    }
    public int getCant_goles() {
        return cant_goles;
    }
    public void setCant_goles(int cant_goles) {
        this.cant_goles = cant_goles;
    }
}
