
public class Figura3D {

	String nombre;
    double alto;
    Figura base;
	
	public double getVolumen() {
		return this.getAlto()*base.getArea();
	}
	
	public double getSuperficie() {
		return base.getArea()*2+base.getPerimetro()*this.getAlto();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	
}
