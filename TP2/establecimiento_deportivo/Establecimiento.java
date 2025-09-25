package establecimiento_deportivo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Establecimiento {
    private ArrayList<Usuario> Usuario;
    private ArrayList<Turno> Turno;
    private ArrayList<Cancha> Cancha;

    public Establecimiento() {
        this.Usuario = new ArrayList<>();
        this.Turno = new ArrayList<>();
        this.Cancha = new ArrayList<>();
    }
}
