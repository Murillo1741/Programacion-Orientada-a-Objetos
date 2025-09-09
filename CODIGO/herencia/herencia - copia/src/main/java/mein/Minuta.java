
package mein;

class Minuta {
    private String fecha;
    private String observacion;

    public Minuta(String fecha, String observacion) {
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void mostrarMinuta() {
        System.out.println("Fecha: " + fecha + " - Observación: " + observacion);
    }
}