package mein;
import Logica.Vehiculo;

class Furgon extends Vehiculo {
    private boolean refrigerado;

    public Furgon(String placa, String marca, int modelo, boolean refrigerado) {
        super(placa, marca, modelo);
        this.refrigerado = refrigerado;
    }
    public boolean getrefrigerado() {
        return refrigerado;
    }

    public void setrefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }


    @Override
    public void VehiculoINFO() {
        System.out.println("Furgón - Placa: " + getPlaca() + ", Marca: " + getMarca() + 
                ", Modelo: " + getModelo() + ", Refrigerado: " + refrigerado);
    }
}
