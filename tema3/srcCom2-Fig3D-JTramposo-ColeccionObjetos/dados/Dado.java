
public class Dado {

	  private int cantidadCaras;
	  private int ultimoValor;
	  
	  public Dado() {
		  cantidadCaras = 6;
		  tirar();
	  }
	  
	  public Dado(int caras) {
		  cantidadCaras = caras;
		  tirar();
	  }
	  
	  public int getCantidadCaras() {
		  return cantidadCaras;
	  }
	  
	  // EL SET cantidad de caras
	  
	  public int tirar() {
		  ultimoValor = (int) ((Math.random()*cantidadCaras)+1);
		  return ultimoValor;
	  }
	  
	  public int getUltimoValor() {
		  return ultimoValor;
	  }

	  @Override
	  public boolean equals(Object otro) {
		// Si son de diferente tipo respondo false
		try {
			Dado otroDado = (Dado)otro;
			//if (this.getCantidadCaras() == otroDado.getCantidadCaras())
			//	return true;
			//else
			//	return false;
			return this.getCantidadCaras() == otroDado.getCantidadCaras();
		}
		catch (Exception e) {
			return false;
		}
	  }

	  public String toString() {
		return "cantidad de caras: " + this.getCantidadCaras() + " ultimo valor: " + this.getUltimoValor();
	  }
	  
	  
	  
	  
}
