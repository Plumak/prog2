package empresa_agricola;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Producto> productos;
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void agregarProducto(Producto p) {
        productos.add(p);
    }
     public void mostrarEtiquetas() {
        System.out.println("Etiquetas de la empresa: " + nombre);
        for (Producto p : productos) {
            // Aquí se llama automáticamente al getEtiqueta() correcto según el tipo de producto
            System.out.println(p.getEtiqueta());
        }
}
}
