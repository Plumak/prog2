
public class Persona {

	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public boolean equals(Object o1) {
		Persona pOtro = (Persona)o1;
		if (pOtro.getNombre().equalsIgnoreCase(nombre)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Persona (" + nombre+")";
	}
	
	public static void main(String[] args) {
		Persona p1= new Persona("Ana");
		Persona p2 = new Persona("AnA");
		
		if (p1==p2) {
			System.out.println("IGuales ==");
		}else {
			System.out.println("Distintos ==");
		}
		
		if (p1.equals(p2)) {
			System.out.println("IGuales equals");
		}else {
			System.out.println("Distintos equals");
		}
			
		//p1 = p2;
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
