
package mein;
import Logica.Vehiculo;

class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String placa, String marca, int modelo, int numeroEjes) {
        super(placa, marca, modelo);
        this.numeroEjes = numeroEjes;
    }
    public int getnumeroEjes() {
        return numeroEjes;
    }

    public void setnumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public void VehiculoINFO() {
        System.out.println("Camión - Placa: " + getPlaca() + ", Marca: " + getMarca() + 
                ", Modelo: " + getModelo() + ", Ejes: " + numeroEjes);
    }
}
