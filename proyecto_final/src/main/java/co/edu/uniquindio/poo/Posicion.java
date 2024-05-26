/**
 * Clase para permitir la creación de posiciones i, j para cada puesto del parqueadero
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

public class Posicion {
    
    private final int i;
    private final int j;
    
    //Método constructor
    public Posicion(int i, int j){

        this.i = i;
        this.j = j;
    }
    
    //Métodos get
    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Posicion [i=" + i + ", j=" + j + "]";
    }
}
