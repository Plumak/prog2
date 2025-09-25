package practico3.ejercicio1.fabricaDeMuebles;

public class Main {
	    public static void main(String[] args) {
	        Fabrica fabrica = new Fabrica();
	        
	        fabrica.agregarMueble(new Silla(39, 5.0, 1000, "Pino", "Silla clásica", "Negro"));
	        fabrica.agregarMueble(new Mesa(20, 2.0, 2000, "Roble", "Mesa comedor", "Marrón"));
	        fabrica.agregarMueble(new Banco(36, 5.0, 8000, "Pino", "Silla clásica", "Negro"));
	        fabrica.agregarMueble(new Mesa(82, 2.0, 2000, "Roble", "Mesa comedor", "Marrón"));

	        System.out.println("Total costo: $" + fabrica.calcularMontoTotalDeCosto());
	        System.out.println("Total venta: $" + fabrica.calcularMontoTotalDeVenta());
	    }
	}


