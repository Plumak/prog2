
public class Serie {

	private String titulo,descripcion,genero,creador;

	private Temporada[] temporadas;
	
	private int maxCantidad;
	private int cantidadTemporadas;
	
	public Serie(String titulo, String creador, int maxCantidad) {
		this.titulo = titulo;
		this.creador = creador;
		temporadas = new Temporada[maxCantidad];
		this.maxCantidad = maxCantidad;
		cantidadTemporadas = 0;
		
	}
	
	public int cantidadEpisodios() {
		int suma = 0;
		for(int i = 0; i<cantidadTemporadas;i++) {
			Temporada taux = temporadas[i];
			suma = suma + taux.cantidadEpisodios();
		}
		return suma;
	}

	public int cantidadEpisodiosVistos() {
		int suma = 0;
		for(int i = 0; i<cantidadTemporadas;i++) {
			Temporada taux = temporadas[i];
			suma = suma + taux.cantidadEpisodiosVistos();
		}
		return suma;
	}
	
	public boolean seVioCompleta() {
		return (this.cantidadEpisodios() == this.cantidadEpisodiosVistos());
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	public void agregarTemporada(Temporada tt) {
		if (cantidadTemporadas<maxCantidad) {
			temporadas[cantidadTemporadas]=tt;
			cantidadTemporadas++;
		}
	}
	
	public Temporada getTemporada(int pos) {
		if(pos>=0 && pos<cantidadTemporadas) {
			return temporadas[pos];
		} else {
			return null;
		}
	}
	
	public void agregarEpisodios(Episodio ee, int temp) {
		Temporada tt = this.getTemporada(temp);
		if (tt!=null) {
			tt.agregarEpisodio(ee);
		}
	}
	
	
	public double getPromedioCalificaciones() {
		double suma = 0;
		for(int i =0; i<cantidadTemporadas;i++) {
			Temporada taux = temporadas[i];
			suma = suma + taux.getPuntajePromedio()*
					      taux.cantidadEpisodiosVistos();
		}
		return suma/ this.cantidadEpisodiosVistos();
	}
	
}
