
public class Temporada {

	private Episodio[] episodios;
	private int cantidadEpisodios;
	private int tope;
	public Temporada(int maxCapacidad) {
		tope = maxCapacidad;
		episodios = new Episodio[tope];
		// en cada lugar d elos 150 hay un null
		//no se crearon objetos, se creo un arreglo
		cantidadEpisodios = 0;
	}
	
	public int cantidadEpisodios() {
		return cantidadEpisodios;
	}
	
	public void agregarEpisodio(Episodio ee) {
		if (cantidadEpisodios<tope) {
		  episodios[cantidadEpisodios]= ee;
		  cantidadEpisodios++;
		}
		
	}
	
	public Episodio getEpisodio(int pos) {
		if (pos>=0 && pos<tope) {
			return episodios[pos];
		} else {
			return null;
		}
	}
	
	public int cantidadEpisodiosVistos() {
		int suma = 0;
		for(int i =0; i<cantidadEpisodios; i++) {
			Episodio eaux = episodios[i];
			if (eaux.seVio()) {
				suma++;
			}
		}
		return suma;
	}
	
	public double getPuntajePromedio() {
		int suma =0;
		for(int i = 0; i<cantidadEpisodios; i++) {
			Episodio eaux = episodios[i];
			if (eaux.seVio()) {
				suma = suma + eaux.getCalificacion();
			}
		}
		
		return  suma / this.cantidadEpisodiosVistos();
	}
}
