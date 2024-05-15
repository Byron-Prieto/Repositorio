package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private final String placa;
    private final String modelo;
    private Propietario propietario;
    private double tarifaHora;

    public Vehiculo(String placa, String modelo, double tarifaHora){

        this.placa = placa;
        this.modelo = modelo;
        this.tarifaHora = tarifaHora;
    }

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
}
