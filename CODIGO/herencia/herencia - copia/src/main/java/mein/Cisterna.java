
package mein;
import Logica.Vehiculo;

class Cisterna extends Vehiculo {
    private String tipoLiquido;
    private double capacidad;
    private String material;

    public Cisterna(String placa, String marca, int modelo, String tipoLiquido, double capacidad, String material) {
        super(placa, marca, modelo);
        this.tipoLiquido = tipoLiquido;
        this.capacidad = capacidad;
        this.material = material;
    }
    public String getTipoLiquido() {
        return tipoLiquido;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setTipoLiquido(String tipoLiquido) {
        this.tipoLiquido = tipoLiquido;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void VehiculoINFO() {
        System.out.println("Cisterna - Placa: " + getPlaca() + ", Marca: " + getMarca() + 
                ", Modelo: " + getModelo() + ", Líquido: " + tipoLiquido + 
                ", Capacidad: " + capacidad + "L, Material: " + material);
    }
}