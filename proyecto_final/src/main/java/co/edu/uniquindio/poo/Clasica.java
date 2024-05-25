package co.edu.uniquindio.poo;

public class Clasica extends Moto {

    public Clasica(String modelo, String placa, String velocidadMaxima, double tarifaHora, Propietario propietario){

        super(velocidadMaxima, placa, modelo, tarifaHora, propietario);
    }

    public String toString() {
        return "Clasica " + super.toString();
    }
}
