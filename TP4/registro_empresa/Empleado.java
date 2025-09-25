package registro_empresa;

public class Empleado extends Persona {
    private String nro_legajo;
    private int sueldo;
    private String cargo;
    public Empleado(String nombre, String apellido, int edad, String nro_legajo, int sueldo, String cargo) {
        super(nombre, apellido, edad);
        this.nro_legajo = nro_legajo;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
    public String getNro_legajo() {
        return nro_legajo;
    }
    public void setNro_legajo(String nro_legajo) {
        this.nro_legajo = nro_legajo;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        if(cargo.equalsIgnoreCase("empleado") || cargo.equalsIgnoreCase("manager"))
        this.cargo = cargo;
    }
    @Override
    public String toString(){
        return super.toString() + '\n' + "Cargo : " + cargo;

    }
}
