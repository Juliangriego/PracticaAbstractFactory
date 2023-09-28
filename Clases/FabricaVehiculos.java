package Clases;

import Clases.Auto;
import Clases.Moto;

public interface FabricaVehiculos {
    Moto nuevaMoto(String ma, String mo, String pa, int ci);
    Auto nuevoAuto(String ma, String mo, String pa, int cp);
}
