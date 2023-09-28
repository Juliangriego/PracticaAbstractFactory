import Clases.FabricaMotos;
import Clases.FabricaVehiculos;
import Clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        ArrayList<Vehiculo> listaGeneral = new ArrayList<Vehiculo>();
        Scanner sc = new Scanner (System.in);
        int op;

        String ma,mo,pa;
        int ci,cp;

        FabricaVehiculos fabrica;
        do{
            escribir("¿Desea ingresar moto (1), auto (2) o salir (3)?");
             op = sc.nextInt();
            switch(op){
                case 1:
                     fabrica = new FabricaMotos();

                     escribir("Ingrese marca"); ma = sc.nextLine();
                     escribir("Ingrese modelo"); mo = sc.nextLine();
                     escribir("Ingrese patente"); pa = sc.nextLine();
                     escribir("Ingrese cilindrada"); ci = sc.nextInt();
                    listaGeneral.add(fabrica.nuevaMoto(ma,mo,pa,ci));
                    break;
                case 2:
                    fabrica = new FabricaAutos();

                    escribir("Ingrese marca"); ma = sc.nextLine();
                    escribir("Ingrese modelo"); mo = sc.nextLine();
                    escribir("Ingrese patente"); pa = sc.nextLine();
                    escribir("Ingrese cantidad de puertas"); cp = sc.nextInt();
                    listaGeneral.add(fabrica.nuevaMoto(ma,mo,pa,cp));
                    break;
                default:
                    break;
            }

        } while (op<3);

        for (Vehiculo aux : listaGeneral){
            escribir(aux.getPatente());
        }
    }
    static void escribir(String texto){
        System.out.println(texto);
    }

}
