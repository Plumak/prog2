
public class Coleccion {
	
	Object[] elementos;
	int contador;
	int maxCapacidad;
	public Coleccion() {
		maxCapacidad=100;
		elementos = new Object[maxCapacidad];
	    contador = 0;
	}
	
	public int getTamanio() {
		return contador;
	}
	public void agregar(Object algo) {
		
		if (contador==maxCapacidad) {
		
			maxCapacidad= maxCapacidad*2;
			Object[] aux=new Object[maxCapacidad];
			for(int i = 0; i<elementos.length; i++) {
				aux[i]=elementos[i];
			}
			elementos=aux;
			
		}
		elementos[contador] = algo;
		contador ++;
		
	}
	public Object  getElemento(int pos) {
		if (pos>=0 && pos<contador) {
			return elementos[pos];
		} else {
			return null;
		}
	}

	public void borrar(int pos) {
		if (pos>=0&& pos<contador) {
			for(int i = pos; i<contador-1;i++) {
				elementos[i]=elementos[i+1];
			}
			contador--;
		}
	}
	
	public void borrar(Object o1) {
		int pos = this.getPosicion(o1);
		if(pos!=-1) {
			this.borrar(pos);
		}
	}
	
	public int getPosicion(Object aux) {
		for(int i =0; i<contador;i++) {
			Object ele = elementos[i];
			if (ele.equals(aux)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean esta(Object aux) {
		int pos = this.getPosicion(aux);
		return (pos!=-1);
	}
	
	
	public static void main(String[] args) {
		Coleccion cc = new Coleccion();
		for(int i = 0; i<100; i++) {
			cc.agregar("Objeto " + i );
		}
		
		for (int j=0; j<cc.getTamanio(); j++) {
			System.out.println(cc.getElemento(j));
		}
		
		System.out.println(cc.esta("Objeto 35"));
		cc.borrar(35);
		System.out.println(cc.esta("Objeto 35"));
	}
}
