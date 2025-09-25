import java.util.ArrayList;

public class UsoArrayList {

	public static void main(String[] args) {
		ArrayList<Persona> cc = new ArrayList<Persona>();
		for(int i = 0; i<10; i++) {
			cc.add(new Persona(" per " +i) );
		}
		
		//cc.add("Hola");
	//	Persona p1 = cc.get(32);
		for (int j=0; j<cc.size(); j++) {
			System.out.println(cc.get(j));
		}
		
		System.out.println(cc.contains(new Persona(" per " + 35)));
		//cc.remove(35);
		System.out.println(cc.contains("Objeto 35"));
		
		
	}

}
