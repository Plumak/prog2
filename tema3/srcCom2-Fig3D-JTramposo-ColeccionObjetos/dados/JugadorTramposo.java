public class JugadorTramposo extends Jugador{

    Dado[] dadosCargados;
    int cantAgregados;

    public JugadorTramposo(String nombre, int cantDados) {
        super(nombre);
        this.dadosCargados = new Dado[cantDados];
        this.cantAgregados = 0;

    }

    public void agregarDado(Dado dado) {
        if (this.cantAgregados < this.dadosCargados.length) {
            this.dadosCargados[this.cantAgregados] = dado;
            this.cantAgregados++;
        }
    }

    public int tirarDados(Cubilete cubilete){
        // Sacar los originales
        Dado[] originales = cubilete.getDados();
        // Poner los cargados
        cubilete.setDados(this.dadosCargados);
        // Tirar
        int total = super.tirarDados(cubilete);

        // Volver los dados originales
        cubilete.setDados(originales);

        return total;
    }


}
