package agenda_personal;

import java.time.LocalTime;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>();
    }

    public void agregarReunion(Reunion nuevaReuniones) {
        if (agendaDisponible(nuevaReuniones)) {
            reuniones.add(nuevaReuniones);
        } else {
            System.out.println("Error, ya hay una reunion en ese horario.");
        }
    }

    public boolean agendaDisponible(Reunion nueva_reunion) {
        return NoEsteOcupado(nueva_reunion.getHora());
    }

    public boolean NoEsteOcupado(LocalTime horario_nuevo) {
    for (Reunion r : reuniones) {
        if (r.getHora().equals(horario_nuevo)) {
            return false; // ya hay una reunión en este horario
        }
    }
    return true; // no hay reuniones en ese horario
}
}
