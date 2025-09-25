package practico3.ejercicio1.fabricaDeMuebles;

public class Mueble {
	
	public static final double MARGENVENTA= 1.35;
	private int stock;
	private double peso;
	private double costoFabricacion;
	private String tipoMadera;
	private String nombreProducto;
	private String color;
	
	public Mueble(int stock,double peso, double costoFabricacion, String tipoMadera,String nombreProducto, String color) {
		
		this.stock = stock;
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.tipoMadera = tipoMadera;
		this.nombreProducto = nombreProducto;
		this.color = color;
	}
	
	public int getStock () {
		return stock;
	}
	
	public double calcularPrecioDeVenta () {
		return costoFabricacion * MARGENVENTA;
	}


	public String getnombreProducto() {
		return nombreProducto;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public String getColor() {
		return color;
	}

}
