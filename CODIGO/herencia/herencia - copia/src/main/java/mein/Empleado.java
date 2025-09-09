package mein;
import Logica.Persona;

class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String documento, String telefono, String cargo) {
        super(nombre, documento, telefono);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void MostrarINFO() {
        super.MostrarINFO();
        System.out.println("Cargo: " + cargo);
    }
}
