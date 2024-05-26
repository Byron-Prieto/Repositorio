package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private final String placa;
    private final String modelo;
    private Propietario propietario;
    private double tarifaHora;

    //Método constructor
    public Vehiculo(String placa, String modelo, double tarifaHora, Propietario propietario){

        this.placa = placa;
        this.modelo = modelo;
        this.tarifaHora = tarifaHora;
        this.propietario = propietario;
    }

    //Métodos get y set    
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    } 

    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [placa=" + placa + ", modelo=" + modelo + ", tarifaHora=" + tarifaHora + ", propietario=" + propietario + "]";
    }
    
}
