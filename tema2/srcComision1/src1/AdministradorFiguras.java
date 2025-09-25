
public class AdministradorFiguras {

	public void imprimir(Rectangulo rr) {
		
		System.out.println("La Figura " + 
		 rr.getNombre() + " Tiene un area de: " +
		 rr.getArea() + " y un perimetro de: " +
		 rr.getPerimetro());
	}
	
	public void imprimir(Circulo rr) {
		
		System.out.println("La Figura " + 
		 rr.getNombre() + " Tiene un area de: " +
		 rr.getArea() + " y un perimetro de: " +
		 rr.getPerimetro());
	}
	public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo(10,20);
       AdministradorFiguras admin = new AdministradorFiguras();
       
       admin.imprimir(r1);
       
       Circulo c1 = new Circulo(10);
       
	   admin.imprimir(c1);	
	}

}
