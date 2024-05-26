/**
 * Clase para permitir la creación de vehículos de tipo moto
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

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
