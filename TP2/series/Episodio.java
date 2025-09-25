package series;
public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean seVio;
    private int calificacion;
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
    public boolean getSeVio() {
        return seVio;
    }
    public void setSeVio(boolean seVio) {
        this.seVio = seVio;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    // constructor con 2 valores default y los demas por parametro //
   public Episodio(String titulo, String descripcion, boolean seVio, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seVio = false;
        this.calificacion = -1;
   }
   public void marcarVisto(){
        this.seVio = true;
        }
   public void ingresarCalificacion(int calificacion){
    if (seVio && calificacion >= 0 && calificacion <=5){
			this.calificacion = calificacion;
		}
	else if (seVio && calificacion < 0 || calificacion >5) {
			System.err.println("valor incorrecto");
		}
		 
		else {
			System.err.println("no se puede calificar sin mirar");
		}
		
		
	}
   }
