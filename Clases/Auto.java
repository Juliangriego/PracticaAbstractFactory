package Clases;

public class Auto extends Vehiculo {

    int cantidadPuertas;

    public Auto(){}
    public Auto(String ma, String mo, String pa, int cp) {
        super(ma, mo, pa);
        this.cantidadPuertas = cp;
    }

}
