/**
 * Clase para verificar que cada vehiculo puede ocupar
 * solo un puesto, cada puesto puede estar ocupado solo por un vehículo y
 * para obtener la lista de vehículos que están ocupando un puesto
 * 
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero("", 10, 10.0, 12.0, 15.0);

        // Crear propietarios
        Propietario propietario1 = new Propietario("Juan", " Perez");
        Propietario propietario2 = new Propietario("Maria", "Gomez");
        Propietario propietario3 = new Propietario("Luis", "Lopez");

        // Crear vehículos con propietarios
        Moto clasica = new Clasica("", "MCL123", "", 10.0, propietario1);
        Moto hibrida = new Hibrida("", "MHB456", "", 12.0, propietario2);
        Vehiculo carro = new Carro("CAR789", "", 15.0, propietario3);

        // Ocupar puestos con los vehículos
        parqueadero.ocuparPuesto(0, clasica);
        parqueadero.ocuparPuesto(1, hibrida);
        parqueadero.ocuparPuesto(2, carro);

        // Verificar que los vehículos ocupan solo un puesto
        System.out.println("Verificar que cada vehículo ocupa solo un puesto:");
        for (int i = 0; i < 3; i++) {
            Vehiculo vehiculo = parqueadero.getVehiculoEnPuesto(i);
            System.out.println("Puesto " + i + " está ocupado por: " + (vehiculo != null ? vehiculo.getPlaca() : "ninguno"));
        }

        // Intentar ocupar un puesto ya ocupado
        System.out.println("\nIntentar ocupar un puesto ya ocupado:");
        parqueadero.ocuparPuesto(0, hibrida);

        // Verificar que cada puesto puede estar ocupado solo por un vehículo
        System.out.println("\nVerificar que cada puesto puede estar ocupado solo por un vehículo:");
        for (int i = 0; i < 3; i++) {
            Vehiculo vehiculo = parqueadero.getVehiculoEnPuesto(i);
            System.out.println("Puesto " + i + " está ocupado por: " + (vehiculo != null ? vehiculo.getPlaca() : "ninguno"));
        }

        // Obtener y mostrar lista de vehículos que están ocupando un puesto
        System.out.println("\nVehículos que están ocupando un puesto:");
        ArrayList<String> vehiculosOcupandoPuestos = parqueadero.obtenerVehiculosRegistrados();
        for (String vehiculo : vehiculosOcupandoPuestos) {
            System.out.println(vehiculo);
        }
    }     
}
