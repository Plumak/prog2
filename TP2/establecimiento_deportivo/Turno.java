package establecimiento_deportivo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Turno {
    // atributos //
    private String usuario;
    private LocalDateTime hora;
    private int precio;

    public Turno(String usuario, LocalDateTime hora) {
        this.usuario = usuario;
        this.hora = hora;
        this.precio = calcularPrecio();
    }

    public int calcularPrecio() {
        int precio = cancha.getPrecio();
        if (usuario.esSocio()) {
            return ((precio / 100) * 90);
        } else {
            return precio;
        }
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
