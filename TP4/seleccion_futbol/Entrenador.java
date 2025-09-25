package seleccion_futbol;

import java.time.LocalDate;

public class Entrenador extends Integrante {
    private String id_federacion;
public Entrenador(String titulo, int anos_exp,String nombre, String apellido, String nro_pasaporte, LocalDate nacimiento, boolean viajando, boolean esta_en_pais_origen, boolean esta_concentrando, String id_federacion){
     super(nombre,apellido,nro_pasaporte,nacimiento,viajando,esta_en_pais_origen,esta_concentrando);
    this.id_federacion = id_federacion;
}
public String getId_federacion() {
    return id_federacion;
}
public void setId_federacion(String id_federacion) {
    this.id_federacion = id_federacion;
}
}
