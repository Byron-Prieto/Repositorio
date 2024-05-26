package co.edu.uniquindio.poo;

public class Clasica extends Moto {
    
    //Método constructor
    public Clasica(String modelo, String placa, String velocidadMaxima, double tarifaHora, Propietario propietario){

        super(velocidadMaxima, placa, modelo, tarifaHora, propietario);
    }
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Clasica " + super.toString();
    }
}
