
public class AdministradorFiguras {

	public void imprimir(Figura rr) {
		
		System.out.println("La Figura " + 
		 rr.getNombre() + " Tiene un area de: " +
		 rr.getArea() + " y un perimetro de: " +
		 rr.getPerimetro() );
	}
	

	public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo(10,20);
       AdministradorFiguras admin = new AdministradorFiguras();
       
       Rectangulo r2 = new Rectangulo(10,10);
       admin.imprimir(r1);
       
       Circulo c1 = new Circulo(10);
       
	   admin.imprimir(c1);	
	   
	   
	   
	   
	   Figura ff1 = null;
	   
	   Circulo cc1 = new Circulo(10);
	   
	   ff1 = r1;
	   
	   ff1.getArea();
	  
	//  System.out.println(((Circulo)ff1).getRadio());
	  
	  
	  MedioCirculo md1 = new MedioCirculo(10);
	  
	  System.out.println(md1.getArea());
	  System.out.println(md1.getPerimetro());
	   
		
		
		Figura f1 = new Figura("Una");
		System.out.println(f1.getEtiqueta());
		
		Circulo ccc1 = new Circulo(10);
		System.out.println(ccc1.getEtiqueta());
		
		MedioCirculo mc1 = new MedioCirculo(10);
		System.out.println(mc1.getEtiqueta());
		
		f1 = mc1;
		System.out.println(f1.getEtiqueta());
		
		admin.imprimir(mc1);
	}

}
