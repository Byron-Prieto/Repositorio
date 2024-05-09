package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private final String placa;
    private final String modelo;
    private Propietario propietario;

    public Vehiculo(String placa, String modelo){

        this.placa = placa;
        this.modelo = modelo;
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
}
