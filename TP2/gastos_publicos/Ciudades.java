package gastos_publicos;
import java.util.ArrayList;
public class Ciudades {
    private int habitantes;
    private String nombre;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastos;
     public Ciudades(int habitantes, String nombre, double imp1, double imp2, double imp3, double imp4, double imp5, double gastos) {
     this.habitantes = habitantes;
     this.nombre = nombre;
     this.imp1 = imp1;   
     this.imp2 = imp2;   
     this.imp3 = imp3;   
     this.imp4 = imp4;   
     this.imp5 = imp5;
     this.gastos = gastos;
    }
    public boolean deficit(){
        if (recaudacion() >= gastos){
            return false;
        }
        else{
            return true;
        }
    }
    public double recaudacion(){
        double suma = imp1+imp2+imp3+imp4+imp5;
        return suma;
    }
    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImp1() {
        return imp1;
    }

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}
