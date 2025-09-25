
public class Episodio {

	private String titulo;
	private String descripcion;
	
	private int calificacion;
	
	public boolean seVio() {
		/*if (calificacion >=0) {
			return true;
		} else {
			return false;
		}
		*/
		return (calificacion>=0);
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(int calif) {
		if (calif>5) {
			calificacion = 5;
		} else {
			if(calif>=0) {
				calificacion = calif;
			} else {
			calificacion = -1;
			}
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
