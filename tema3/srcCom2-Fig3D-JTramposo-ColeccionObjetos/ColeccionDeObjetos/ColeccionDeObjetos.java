package ColeccionDeObjetos;

public class ColeccionDeObjetos {
    final static int MAX = 10;
    Object[] elementos;
    int cantMaxima;
    int cantActual;

    public ColeccionDeObjetos() {
        this.cantActual = 0;
        this.cantMaxima = MAX;
        this.elementos = new Object[MAX];
    }

    public void agregar(Object elemNuevo) {
        if (cantActual == cantMaxima) {
            Object[] nuevo = new Object[this.cantMaxima * 2];
            for (int i = 0; i < this.cantActual; i++)
                nuevo[i] = this.elementos[i];
            
            this.elementos = nuevo;
            this.cantMaxima = cantMaxima * 2;
            
        }
        elementos[cantActual] = elemNuevo;
        cantActual++;
    }

    public Object obtener(int pos) {
//        if (pos < cantActual)
            return this.elementos[pos];
//        else
//            return null;
    }

    public int getCantidad() {
        return this.cantActual;
    }

    public static void main(String[] args) {
        ColeccionDeObjetos micoleccion = new ColeccionDeObjetos();
        // Guardo objetos de tipo String
        String hola = "Hola";
        micoleccion.agregar(hola);
        String hola1 = "Hola1";
        micoleccion.agregar(hola1);
        String hola2 = "Hola2";
        micoleccion.agregar(hola2);
        String hola3 = "Hola3";
        micoleccion.agregar(hola3);
        String hola4 = "Hola4";
        micoleccion.agregar(hola4);
        String hola5 = "Hola5";
        micoleccion.agregar(hola5);
        String hola6 = "Hola6";
        micoleccion.agregar(hola6);
        String hola7 = "Hola7";
        micoleccion.agregar(hola7);
        String hola8 = "Hola8";
        micoleccion.agregar(hola8);
        String hola9 = "Hola9";
        micoleccion.agregar(hola9);
        String hola10 = "Hola10";
        micoleccion.agregar(hola10);
        // Al agregar el elemento 11, se expande la capacidad de forma transparente para el que usa la colección
        String hola11 = "Hola11";
        micoleccion.agregar(hola11);
        String hola12 = "Hola12";
        micoleccion.agregar(hola12);

        // Recorro mi colección
        for (int i = 0; i < micoleccion.getCantidad(); i++) {
            System.out.println("Elemento " + i + ": " + micoleccion.obtener(i)); // Obtener retorna un Object, que tiene implementado el toString (si hay que llamar a otro metodo especifico hay q castear)
        }
    }


}
