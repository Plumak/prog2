package series;
import java.util.ArrayList;

public class Series{
    private int cant_temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;
    
    public Series (String titulo, String descripcion, String creador, String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList <>();
		
	}
    public int getCant_temporadas() {
        return cant_temporadas;
    }

    public void setCant_temporadas(int cant_temporadas) {
        this.cant_temporadas = cant_temporadas;
    }
public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

public int cant_episodios_vistos_serie(){
    int total = 0;
    for(Temporada t : temporadas){
        total+= t.cant_episodios_vistos_por_temporada();
    }
    return total;
}
public double promedioCalificacionSerie(){
    int suma=0;
    for(Temporada t : temporadas){
        suma+= t.promedioCalificacionTemporada();
    }
    double promedio = suma / temporadas.size();
    return promedio;
}
public int contadorEpisodiosTotales(){
    int suma=0;
    for(Temporada t : temporadas){
        suma+= t.contadorEpisodiosTemporada();
    }
    return suma;
}
public boolean vioTodosLosEpisodios(){
    boolean los_vio = false;
    if(cant_episodios_vistos_serie() == contadorEpisodiosTotales()){
        los_vio = true;
    }
    return los_vio;
}
}