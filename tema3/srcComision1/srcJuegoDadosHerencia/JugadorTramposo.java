
public class JugadorTramposo extends Jugador {

	DadoCargado[] cargados;
	public JugadorTramposo(String nombre) {
		super(nombre);
		cargados = new DadoCargado[2];
		cargados[0] = new DadoCargado(5);
		//cargados[0].setProbabilidad(1);
		cargados[1] = new DadoCargado(6);
	}

	
	// TIRAR LOS DADOS
	public int tirarDados(Cubilete cubil) {
		//SACAR LOS DADOS
		Dado[] daditos = cubil.getDados();
		//PONER LOS CARGADOS
		cubil.setDados(cargados);
		//TIRAR LOS DADOS
		int valor = cubil.tirar();
		//VOLVER A GUARDAR DADO ANTERIORES
		cubil.setDados(daditos);
		return valor;
	}
}
