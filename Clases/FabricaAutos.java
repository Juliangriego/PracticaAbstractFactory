package Clases;

import Clases.Auto;
import Clases.FabricaVehiculos;
import Clases.Moto;

public class FabricaAutos implements FabricaVehiculos {
    @Override
    public Moto nuevaMoto(String ma, String mo, String pa, int ci) {
        return null;
    }

    @Override
    public Auto nuevoAuto(String ma, String mo, String pa, int cp) {
        return new Auto(ma,mo,pa,cp);
    }
}
