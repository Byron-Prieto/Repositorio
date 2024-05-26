package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.YearMonth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    private Parqueadero parqueadero;
    
    //Crear un parqueadero para las siguientes pruebas
    @BeforeEach
    public void setUp() {
        int cantidadPuestos = 30;
        double tarifaClasica = 10.0;
        double tarifaHibrida = 12.0;
        double tarifaCarro = 15.0;
        parqueadero = new Parqueadero("Parqueadero", cantidadPuestos, tarifaClasica, tarifaHibrida, tarifaCarro);
    }
    
    //Test para verificar que funcionen los métodos de ocupar y liberar puesto
    @Test
    public void testOcuparYLiberarPuesto() throws InterruptedException {
        Propietario propietario1 = new Propietario("Byron", "Prieto");
        Clasica clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario1);
        parqueadero.ocuparPuesto(0, clasica);
        assertTrue(parqueadero.getVehiculoEnPuesto(0) != null);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);
        assertNull(parqueadero.getVehiculoEnPuesto(0));
    }
    
    //Test para verificar que funcione el método de generar un reporte diario
    @Test
    public void testGenerarReporteDiario() throws InterruptedException {
        Propietario propietario2 = new Propietario("Esteban", "Mendez");
        Propietario propietario3 = new Propietario("Pablo", "Arango");
        Propietario propietario4 = new Propietario("Carlos", "Gomez");
        Clasica clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario2);
        Hibrida hibrida = new Hibrida("", "MHB456", "", parqueadero.getTarifaHibrida(), propietario3);
        Carro carro = new Carro("CAR789", "", parqueadero.getTarifaCarro(), propietario4);

        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);

        parqueadero.ocuparPuesto(1, hibrida);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(1);

        parqueadero.ocuparPuesto(2, carro);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(2);

        LocalDate hoy = LocalDate.now();
        String reporte = parqueadero.generarReporteDiario(hoy);
        System.out.println(reporte);

        assertTrue(reporte.contains("Total Clasica"));
        assertTrue(reporte.contains("Total Hibrida"));
        assertTrue(reporte.contains("Total Carro"));
    }
    
    //Test para verificar que funcione el método para cambiar las tarifas
    @Test
    public void testCambiarTarifas() {
        parqueadero.setTarifaClasica(15.0);
        parqueadero.setTarifaHibrida(18.0);
        parqueadero.setTarifaCarro(20.0);

        assertEquals(15.0, parqueadero.getTarifaClasica());
        assertEquals(18.0, parqueadero.getTarifaHibrida());
        assertEquals(20.0, parqueadero.getTarifaCarro());
    }
    
    //Test para verificar que se almacene el registro de todos los  
    //vehículos que hayan usado el parqueadero en una lista
    @Test
    public void testHistorialVehiculos() throws InterruptedException {
        Propietario propietario5 = new Propietario("Jorge", "Torres");
        Propietario propietario6 = new Propietario("Daniel", "Castillo");
        Clasica clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario5);
        Hibrida hibrida = new Hibrida("", "MHB456", "", parqueadero.getTarifaHibrida(), propietario6);

        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);

        parqueadero.ocuparPuesto(1, hibrida);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(1);

        assertEquals(2, parqueadero.getHistorialVehiculos().size());
    }
    
    //Test para verificar que funcione el método de generar un reporte mensual
    @Test
    public void testGenerarReporteMensual() throws InterruptedException {
        Propietario propietario7 = new Propietario("Tomas", "Moreno");
        Clasica clasica = new Clasica("", "MCL123", "", parqueadero.getTarifaClasica(), propietario7);
        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(1000);
        parqueadero.liberarPuesto(0);

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
    } 
}

