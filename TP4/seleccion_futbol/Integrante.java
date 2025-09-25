package seleccion_futbol;

import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String apellido;
    private String nro_pasaporte;
    private LocalDate nacimiento;
    private boolean viajando;
    private boolean esta_en_pais_origen;
    private boolean esta_concentrando;

    public Integrante(String nombre, String apellido, String nro_pasaporte, LocalDate nacimiento, boolean viajando,
            boolean esta_en_pais_origen, boolean esta_concentrando) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro_pasaporte = nro_pasaporte;
        this.nacimiento = nacimiento;
        this.viajando = viajando;
        this.esta_en_pais_origen = esta_en_pais_origen;
        this.esta_concentrando = esta_concentrando;
    }

    public boolean isViajando() {
        return viajando;
    }

    public void setViajando(boolean viajando) {
        this.viajando = viajando;
    }

    public boolean isEsta_en_pais_origen() {
        return esta_en_pais_origen;
    }

    public void setEsta_en_pais_origen(boolean esta_en_pais_origen) {
        this.esta_en_pais_origen = esta_en_pais_origen;
    }

    public boolean isEsta_concentrando() {
        return esta_concentrando;
    }

    public void setEsta_concentrando(boolean esta_concentrando) {
        this.esta_concentrando = esta_concentrando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNro_pasaporte() {
        return nro_pasaporte;
    }

    public void setNro_pasaporte(String nro_pasaporte) {
        this.nro_pasaporte = nro_pasaporte;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    public boolean estaDisponible(Integrante integrante) {
    return (esta_en_pais_origen && !esta_concentrando);
}

}
