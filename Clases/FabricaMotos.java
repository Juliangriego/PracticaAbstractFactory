package Clases;

public class FabricaMotos implements FabricaVehiculos {
    @Override
    public Moto nuevaMoto(String ma, String mo, String pa, int ci) {
        return new Moto(ma,mo,pa,ci);
    }

    @Override
    public Auto nuevoAuto(String ma, String mo, String pa, int cp) {
        return null;
    }
}
