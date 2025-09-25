//CLASE VS INSTANCIA
//CREANDO CLASES NUEVAS CUNADO SOLO CAMBIA EL VALOR DE UNA VARIABLE
//mal mal mal
public class DadoCargado5 extends Dado {
	
	
	 public int tirar() {
		 double random = Math.random();
		 
		 if (random<0.5) {
		   return 5;
		 } else {
			 return super.tirar();
		 }
	 }
	 
	 
	 public static void main(String[] args) {
		 Dado d1=new Dado();
		 DadoCargado5 d2 = new DadoCargado5();
		 for(int i = 0; i< 100; i++) {
			 System.out.println(d1.tirar() + " - " + d2.tirar());
		 }
	 }

}