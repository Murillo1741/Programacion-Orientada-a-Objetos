package mein;
import Logica.Persona;

class Cliente extends Persona {
    
    private boolean esJuridico;
    
    public Cliente(String nombre, String documento, String telefono, boolean esJuridico) {
        
        super(nombre, documento, telefono);
        this.esJuridico = esJuridico;
    }
    
    
    public boolean isEsJuridico() {
        return esJuridico;
    }

    public void setEsJuridico(boolean esJuridico) {
        this.esJuridico = esJuridico;
    }

    
    @Override
    public void MostrarINFO(){
        
    super.MostrarINFO();
    System.out.println("Tipo Cliente: " + (esJuridico ? "Jurídico" : "Natural"));
   
    }

    void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
