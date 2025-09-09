package mein;

class Conductor extends Empleado {
    private String licencia;

    public Conductor(String nombre, String documento, String telefono, String licencia) {
        super(nombre, documento, telefono, "Conductor");
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public void MostrarINFO() {
        super.MostrarINFO();
        System.out.println("Licencia: " + licencia);
    }
}
