package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {

    public Carro(String placa, String modelo, double tarifaHora, Propietario propietario){

        super(placa, modelo, tarifaHora, propietario);
    } 

    public String toString() {
        return "Carro " + super.toString();
    }
}
