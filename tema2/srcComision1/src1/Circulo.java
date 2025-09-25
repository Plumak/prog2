
public class Circulo {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return radio*radio*Math.PI;
	}
	
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
	
	public double getDiametro() {
		return radio*2;
	}
	
	public String getNombre() {
		return "Circulo";//NO HACER ESTO
	}
}
