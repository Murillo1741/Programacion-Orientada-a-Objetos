package mein;
import Logica.Vehiculo;

class Liviano extends Vehiculo {
    private String tipoZona;

    public Liviano(String placa, String marca, int modelo, String tipoZona) {
        super(placa, marca, modelo);
        this.tipoZona = tipoZona;
    }
    public String gettipoZona() {
        return tipoZona;
    }

    public void settipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }


    @Override
    public void VehiculoINFO() {
        System.out.println("Vehículo Liviano - Placa: " + getPlaca() + ", Marca: " + getMarca() + 
                ", Modelo: " + getModelo() + ", Zona: " + tipoZona);
    }
}