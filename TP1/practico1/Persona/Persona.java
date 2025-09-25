package Persona;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    // atributos //
   private String nombre;
   private String apellido;
    private int edad;
    private LocalDate fecha_de_nacimiento;
    private String dni; // Obligatorio //
    private String sexo;
    private double peso;
    private double altura;

    // Seteamos valores por default //
public Persona(String dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.fecha_de_nacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = "Femenino";
        this.peso = 1.0;
        this.altura = 1.0;
    }
    public Persona(String dni,String nombre, String apellido, int edad, LocalDate fecha_de_nacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
    // HACEMOS LAS RESPONSABILIDADES CON METODOS //
    public double masaCorporal(){
        return this.peso/(Math.pow(altura,2));
    }
    public boolean estaEnForma(){
        return this.masaCorporal() >= 18.5 && this.masaCorporal() <= 25;
    }
    public boolean diaDeCumpleanios() {
    LocalDate hoy = LocalDate.now();
    return this.fecha_de_nacimiento.getDayOfMonth() == hoy.getDayOfMonth() &&
           this.fecha_de_nacimiento.getMonth() == hoy.getMonth();
}

    public boolean esMayorEdad(){
        return this.edad >= 18;
    }
    public boolean puedeVotar(){
        return this.edad >= 16;
    }
   public boolean esCoherente() {
    int edadReal = Period.between(this.fecha_de_nacimiento, LocalDate.now()).getYears();
    return this.edad == edadReal;
}
    // GETERS Y SETERS // 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
     public LocalDate getFechaNacimiento() {
        return fecha_de_nacimiento;
    }
    public void setFechaNacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
}