/**
 * Clase para permitir la creación de propietarios de vehículos
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

public class Propietario {
    
    private final String nombre;
    private final String apellido;
    private Vehiculo vehiculo;
    
    //Método constructor
    public Propietario(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Métodos get
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Propietario:" + nombre +  apellido;
    }
}
