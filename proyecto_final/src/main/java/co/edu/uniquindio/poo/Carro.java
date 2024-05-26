package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    
    //Método constructor
    public Carro(String placa, String modelo, double tarifaHora, Propietario propietario){

        super(placa, modelo, tarifaHora, propietario);
    } 
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Carro " + super.toString();
    }
}
