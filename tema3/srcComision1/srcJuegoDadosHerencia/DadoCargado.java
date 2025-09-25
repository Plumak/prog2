
public class DadoCargado extends Dado {

	int ladoCargado;
	double probabilidad;
	
	public DadoCargado(int ladoC) {
		super();
		this.ladoCargado=ladoC;
		probabilidad = 0.5;
	}
	

	 public double getProbabilidad() {
		return probabilidad;
	}


	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}


	public int getLadoCargado() {
		return ladoCargado;
	}


	public void setLadoCargado(int ladoCargado) {
		this.ladoCargado = ladoCargado;
	}


	public int tirar() {
		 double random = Math.random();
		 
		 if (random<probabilidad) {
		   return ladoCargado;
		 } else {
			 return super.tirar();
		 }
	 }
	 
	 public static void main(String[] args) {
		 Dado d1=new Dado();
		 DadoCargado d2 = new DadoCargado(1);
		 for(int i = 0; i< 100; i++) {
			 System.out.println(d1.tirar() + " - " + d2.tirar());
		 }
	 }
	 
}
