
package mein;
import Logica.Vehiculo;
        
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan David", "103466", "3204851171", false);
        c1.MostrarINFO();
        
         Empleado Emple1 = new Empleado("Diver sebastian", "325678", "1034663285","Gerente");
        Emple1.MostrarINFO();

        Conductor cond1 = new Conductor("Migel Reina", "120560", "3114393603", "C2");
        cond1.MostrarINFO();
      
        Vehiculo v1 = new Camion("CDR125", "nisan", 2020, 4);
        v1.VehiculoINFO();

        Vehiculo v2 = new Furgon("XYZ987", "Chevrolet", 2022, true);
        v2.VehiculoINFO();
        
        Vehiculo v3 = new Liviano("COP230", "volvo", 2000, "40m*m");
        v3.VehiculoINFO();

        Vehiculo v4 = new Cisterna("MPO450", "volks", 2017, "gasolina",235.70,"metal" );
        v4.VehiculoINFO();
        
        Minuta b1 = new Minuta("2025-09-06", "Ruta iniciada correctamente.");
        b1.mostrarMinuta();
    }
}