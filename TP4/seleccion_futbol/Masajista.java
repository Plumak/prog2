package seleccion_futbol;

import java.time.LocalDate;

public class Masajista extends Integrante {
    private String titulo;
    private int anos_exp;
    public Masajista(String titulo, int anos_exp,String nombre, String apellido, String nro_pasaporte, LocalDate nacimiento, boolean viajando, boolean esta_en_pais_origen, boolean esta_concentrando){
        super(nombre,apellido,nro_pasaporte,nacimiento,viajando,esta_en_pais_origen,esta_concentrando);
        this.titulo = titulo;
        this.anos_exp = anos_exp;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnos_exp() {
        return anos_exp;
    }
    public void setAnos_exp(int anos_exp) {
        this.anos_exp = anos_exp;
    }
}
