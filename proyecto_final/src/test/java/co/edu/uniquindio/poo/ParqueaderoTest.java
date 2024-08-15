/**
 * Clase para probar el funcionamiento del código
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto 
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    private Parqueadero parqueadero;
    
    //Crear un parqueadero antes de realizar cada una de las siguientes pruebas
    @BeforeEach
    public void setUp() {

        //Asignar las tarifas para cada tipo de vehículo
        int cantidadPuestos = 30;
        double tarifaClasica = 10.0;
        double tarifaHibrida = 12.0;
        double tarifaCarro = 15.0;

        //Crear parqueadero
        parqueadero = new Parqueadero("Parqueadero", cantidadPuestos, tarifaClasica, tarifaHibrida, tarifaCarro);
    }
    
    //Test para verificar que funcionen los métodos de ocupar y liberar puesto
    @Test
    public void testOcuparYLiberarPuesto() throws InterruptedException {

        //Crear propietario
        Propietario propietario1 = new Propietario("Byron", "Prieto");

        //Crear vehículo
        Clasica clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario1);

        //Ocupar puesto
        parqueadero.ocuparPuesto(0, clasica);

        //Verificar que el puesto se haya ocupado
        assertTrue(parqueadero.getVehiculoEnPuesto(0) != null);
        Thread.sleep(1000);

        //Liberar puesto
        parqueadero.liberarPuesto(0);

        //Verificar que el puesto se haya liberado
        assertNull(parqueadero.getVehiculoEnPuesto(0));
    }
    
    //Test para verificar que funcione el método de generar un reporte diario
    @Test
    public void testGenerarReporteDiario() throws InterruptedException {
        
        //Crear propietarios
        Propietario propietario2 = new Propietario("Esteban", "Mendez");
        Propietario propietario3 = new Propietario("Pablo", "Arango");
        Propietario propietario4 = new Propietario("Carlos", "Gomez");
        
        //Crear vehículos
        Moto clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario2);
        Moto hibrida = new Hibrida("", "MHB456", "", parqueadero.getTarifaHibrida(), propietario3);
        Vehiculo carro = new Carro("CAR789", "", parqueadero.getTarifaCarro(), propietario4);
        
        //Ocupar y liberar puestos
        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);

        parqueadero.ocuparPuesto(1, hibrida);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(1);

        parqueadero.ocuparPuesto(2, carro);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(2);
        
        //Generar reporte diario
        LocalDate hoy = LocalDate.now();
        String reporte = parqueadero.generarReporteDiario(hoy);
        System.out.println(reporte);
        
        //Verificar que el reporte contenga el desglosado de carro, hibrida y clasica
        assertTrue(reporte.contains("Total Clasica"));
        assertTrue(reporte.contains("Total Hibrida"));
        assertTrue(reporte.contains("Total Carro"));
    }
    
    //Test para verificar que funcione el método para cambiar las tarifas
    @Test
    public void testCambiarTarifas() {
        
        //Ajustar las tarifas del parqueadero
        parqueadero.setTarifaClasica(15.0);
        parqueadero.setTarifaHibrida(18.0);
        parqueadero.setTarifaCarro(20.0);
        
        //Verificar que se hayan actualizado las tarifas
        assertEquals(15.0, parqueadero.getTarifaClasica());
        assertEquals(18.0, parqueadero.getTarifaHibrida());
        assertEquals(20.0, parqueadero.getTarifaCarro());
    }
    
    //Test para verificar que se almacene el registro de todos los  
    //vehículos que hayan usado el parqueadero en una lista
    @Test
    public void testHistorialVehiculos() throws InterruptedException {

        //Crear propietarios
        Propietario propietario5 = new Propietario("Jorge", "Torres");
        Propietario propietario6 = new Propietario("Daniel", "Castillo");

        //Crear vehículos
        Moto clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario5);
        Moto hibrida = new Hibrida("", "MHB456", "", parqueadero.getTarifaHibrida(), propietario6);
        
        //Ocupar y liberar puestos
        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);

        parqueadero.ocuparPuesto(1, hibrida);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(1);
        
        //Verificar que se almacenen los vehículos que han usado el parqueadero
        assertEquals(2, parqueadero.getHistorialVehiculos().size());
    }
    
    //Test para verificar que funcione el método de generar un reporte mensual
    @Test
    public void testGenerarReporteMensual() throws InterruptedException {

        //Crear propietario
        Propietario propietario7 = new Propietario("Tomas", "Moreno");

        //Crear Vehículo
        Moto clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario7);

        //Ocupar y liberar puesto
        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);
        
        //Generar reporte mensual
        YearMonth mesActual = YearMonth.now();
        double totalMensual = parqueadero.generarReporteMensual(mesActual);
        assertTrue(totalMensual > 0);
        System.out.println(totalMensual);
    }
    
    //Test para verificar que funcionen los métodos de obtener el
    //vehículo y el propietario de un vehículo en un puesto
    @Test
    public void testPropietarioYVehiculoEnPuesto(){
        int cantidadPuestos = 10;
        double tarifaClasica = 10.0;
        double tarifaHibrida = 12.0;
        double tarifaCarro = 15.0;

        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero("", cantidadPuestos, tarifaClasica, tarifaHibrida, tarifaCarro);

        // Crear propietarios
        Propietario propietario1 = new Propietario("Juan", "Perez");
        Propietario propietario2 = new Propietario("Maria", "Gomez");
        Propietario propietario3 = new Propietario("Luis", "Lopez");

        // Crear vehículos con propietarios
        Moto clasica = new Clasica("", "MCL123", "", tarifaClasica, propietario1);
        Moto hibrida = new Hibrida("", "MHB456", "", tarifaHibrida, propietario2);
        Vehiculo carro = new Carro("CAR789", "", tarifaCarro, propietario3);

        // Ocupar puestos con los vehículos
        parqueadero.ocuparPuesto(0, clasica);
        parqueadero.ocuparPuesto(1, hibrida);
        parqueadero.ocuparPuesto(2, carro);

        // Verificar propietarios
        assertEquals(propietario1, parqueadero.getPropietarioVehiculoEnPuesto(0));
        assertEquals(propietario2, parqueadero.getPropietarioVehiculoEnPuesto(1));
        assertEquals(propietario3, parqueadero.getPropietarioVehiculoEnPuesto(2));
        assertEquals(clasica, parqueadero.getVehiculoEnPuesto(0));
        assertEquals(hibrida, parqueadero.getVehiculoEnPuesto(1));
        assertEquals(carro, parqueadero.getVehiculoEnPuesto(2));
    }
    
    //Test para verificar que funcionen los métodos
    //de obtener posición y verificar disponibilidad 
    @Test
    public void testObtenerPosicionYVerificarDisponibilidad(){

        int cantidadPuestos = 30;
        double tarifaClasica = 10.0;
        double tarifaHibrida = 12.0;
        double tarifaCarro = 15.0;
        
        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero("", cantidadPuestos, tarifaClasica, tarifaHibrida, tarifaCarro);

        //Crear propietario
        Propietario propietario1 = new Propietario("Juan", "Perez");

        //Crear vehículo
        Moto clasica = new Clasica("", "MCL123", "", tarifaClasica, propietario1);

        //Ocupar puesto
        parqueadero.ocuparPuesto(0, clasica);
        
        //Obtener la posición i, j de un puesto
        System.out.println(parqueadero.getPosicion(29));

        //Verificar si un puesto está disponible
        System.out.println(parqueadero.verificarPuestoDisponible(0));

        //Liberar puesto
        parqueadero.liberarPuesto(0);

        //Verificar si un puesto está disponible
        System.out.println(parqueadero.verificarPuestoDisponible(0));
    } 
    
    //Test para verificar que cada vehiculo puede ocupar solo un puesto,
    //cada puesto puede estar ocupado solo por un vehículo y para obtener 
    //la lista de vehículos que están ocupando un puesto
    @Test
    public static void main(String[] args) {

        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero("", 10, 10.0, 12.0, 15.0);

        // Crear propietarios
        Propietario propietario1 = new Propietario("Juan Perez", "12345678");
        Propietario propietario2 = new Propietario("Maria Gomez", "87654321");
        Propietario propietario3 = new Propietario("Luis Lopez", "11223344");

        // Crear vehículos
        Moto clasica = new Clasica("", "MCL123", "", 10.0, propietario1);
        Moto hibrida = new Hibrida("", "MHB456", "", 12.0, propietario2);
        Vehiculo carro = new Carro("CAR789", "", 15.0, propietario3);

        // Ocupar puestos
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

