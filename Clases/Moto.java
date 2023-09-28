package Clases;

public class Moto extends Vehiculo{

    int cilindrada;
    public Moto(){}
    public Moto(String ma, String mo, String pa, int ci) {
        super(ma, mo, pa);
        this.cilindrada = ci;
    }
}
