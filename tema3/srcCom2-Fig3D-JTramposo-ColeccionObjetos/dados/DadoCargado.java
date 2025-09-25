public class DadoCargado extends Dado {

    int valorCargado;
    double limiteCarga;

    public DadoCargado(int valorCargado, double limiteCarga) {
        this.valorCargado = valorCargado;
        this.limiteCarga = limiteCarga;
    }

    public DadoCargado(int valorCargado, double limiteCarga, int cantCaras) {
        super(cantCaras);
        this.valorCargado = valorCargado;
        this.limiteCarga = limiteCarga;
    }

    

    public int getValorCargado() {
        return valorCargado;
    }

    public void setValorCargado(int valorCargado) {
        this.valorCargado = valorCargado;
    }

    public double getLimiteCarga() {
        return limiteCarga;
    }

    public void setLimiteCarga(double limiteCarga) {
        this.limiteCarga = limiteCarga;
    }

    public int tirar() {
        if (Math.random() > this.getLimiteCarga())
            return super.tirar();
            //return this.tirar(); // noooo, llamado recursivo
        else
            return valorCargado;
    }

    public static void main(String[] args) {
        DadoCargado d = new DadoCargado(6, 0.5, 6);
        for ( int i = 0; i < 20; i++)
         System.out.println(d.tirar());
    }



}
