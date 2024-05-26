/**
 * Clase para permitir la creación de vehículos de tipo carro
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

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
