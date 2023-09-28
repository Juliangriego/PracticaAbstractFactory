package Clases;

public abstract class Vehiculo {

    String marca;
    int kilometraje;
    String modelo;
    String patente;
    boolean encendido;

    Vehiculo(){}
    Vehiculo (String ma, String mo, String pa){
        this.marca = ma;
        this.modelo = mo;
        this.patente = pa;
        this.kilometraje = 0;
        this.encendido = false;
    }

    public String getPatente(){return this.patente;}
}
