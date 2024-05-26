package co.edu.uniquindio.poo;

public abstract class Moto extends Vehiculo {
    
    private final String velocidadMaxima;
    
    //Método constructor
    public Moto(String velocidadMaxima, String placa, String modelo, double tarifaHora, Propietario propietario){

        super(placa, modelo, tarifaHora, propietario);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    //Método get
    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return super.toString() + ", velocidadMaxima=" + velocidadMaxima;
    }
    
}
