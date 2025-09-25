package practico3.ejercicio1.fabricaDeMuebles;

import java.util.ArrayList;

public class Fabrica {
	
	private ArrayList <Mueble> muebles;
	
	public Fabrica () {
		this.muebles = new ArrayList<>();
	}
	
	public void agregarMueble(Mueble nuevoMueble) {
		muebles.add(nuevoMueble);
	}
	
	public double calcularMontoTotalDeVenta () {
		double importe=0.0;
		for (Mueble mueble : muebles) {
			if(mueble.getStock() > 0) {
			importe += mueble.calcularPrecioDeVenta() * mueble.getStock();		
			}
		}
		return importe;
	}
	
	public double calcularMontoTotalDeCosto () {
		double importe=0.0;
		for (Mueble mueble : muebles) {
			if(mueble.getStock() > 0) {
			importe += mueble.getCostoFabricacion();		
			}
		}
		return importe;
	}
}
