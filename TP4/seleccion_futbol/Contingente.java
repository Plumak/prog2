package seleccion_futbol;
import java.util.ArrayList;

public class Contingente {
    private String pais;
    private ArrayList<Integrante> integrantes;
    public Contingente(String pais, ArrayList<Integrante> cuerpo_tecnico) {
        this.pais = pais;
        this.integrantes = new ArrayList<>();
    }
    public void agregarFutbolista(Integrante nuevo_integrante){
        integrantes.add(nuevo_integrante);
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
   public void integrantesDisponibles() {
    for (Integrante i : integrantes) {
        if (i.estaDisponible(i)) {
            System.out.println(i.getNombre() + " " + i.getApellido() + " está disponible");
        }
    }
}

}
