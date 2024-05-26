package co.edu.uniquindio.poo;

public class Hibrida extends Moto {
    
    //Método constructor
    public Hibrida(String modelo, String placa, String velocidadMaxima,double tarifaHora, Propietario propietario){

        super(velocidadMaxima, placa, modelo, tarifaHora, propietario);
    }
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Hibrida " + super.toString();
    }
}
