/**
 * Clase para permitir la creación de vehículos de tipo moto clasica
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

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
