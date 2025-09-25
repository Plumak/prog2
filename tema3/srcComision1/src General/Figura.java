
public class Figura {
    private String nombre;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    public double getArea() {
    	return 0;
    }
    
    public double getPerimetro() {
    	return 0;
    }
    
    public String getEtiqueta() {
    	return "Figura:"+nombre+"("+this.getArea()+ 
    			","+this.getPerimetro()+")";
    }
}
