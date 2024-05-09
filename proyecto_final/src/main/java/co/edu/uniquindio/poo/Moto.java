package co.edu.uniquindio.poo;

public abstract class Moto extends Vehiculo {
    
    private final String velocidadMaxima;

    public Moto(String velocidadMaxima, String placa, String modelo){

        super(placa, modelo);
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
