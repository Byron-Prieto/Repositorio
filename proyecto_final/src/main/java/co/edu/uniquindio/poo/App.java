package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.lang.Thread;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        int cantidadPuestos = 30;
        double tarifaClasica = 10.0;
        double tarifaHibrida = 12.0;
        double tarifaCarro = 15.0;

        Parqueadero parqueadero = new Parqueadero("Parqueadero", cantidadPuestos, tarifaClasica, tarifaHibrida, tarifaCarro);

        // Crear Propietarios
        Propietario propietario1 = new Propietario("Byron", "Prieto");
        Propietario propietario2 = new Propietario("Esteban", "Mendez");
        Propietario propietario3 = new Propietario("Pablo", "Arango");

        // Crear vehículos con las tarifas actuales
        Clasica clasica = new Clasica("XTZ 150", "MCL123", "115 km/h", parqueadero.getTarifaClasica(), propietario1);
        Hibrida hibrida = new Hibrida("kwz", "MHB456", "80 km/h", parqueadero.getTarifaHibrida(), propietario2);
        Carro carro = new Carro("CAR789", "Mazda 3", parqueadero.getTarifaCarro(), propietario3);

        // Ocupar puestos
        parqueadero.ocuparPuesto(0, clasica);
        Thread.sleep(2000); // Simular tiempo de uso
        parqueadero.liberarPuesto(0);

        parqueadero.ocuparPuesto(1, hibrida);
        Thread.sleep(2000); // Simular tiempo de uso
        parqueadero.liberarPuesto(1);

        parqueadero.ocuparPuesto(2, carro);
        Thread.sleep(2000); // Simular tiempo de uso
        parqueadero.liberarPuesto(2);

        // Generar reporte diario
        LocalDate hoy = LocalDate.now();
        System.out.println(parqueadero.generarReporteDiario(hoy));

        parqueadero.setTarifaClasica(12.0);
        parqueadero.setTarifaHibrida(14.0);
        parqueadero.setTarifaCarro(18.0);

        // Crear Propietarios
        Propietario propietario4 = new Propietario("Carlos", "Gomez");
        Propietario propietario5 = new Propietario("Jorge", "Torres");
        Propietario propietario6 = new Propietario("Daniel", "Castillo");

        // Crear vehículos con las nuevas tarifas
        Clasica clasica2 = new Clasica("XTZ 125", "MCL124", "100 km/h", parqueadero.getTarifaClasica(), propietario4);
        Hibrida hibrida2 = new Hibrida("kwx", "MHB457", "80 km/h", parqueadero.getTarifaHibrida(), propietario5);
        Carro carro2 = new Carro("CAR790", "Mazda 6", parqueadero.getTarifaCarro(), propietario6);

        // Ocupar puestos con nuevas tarifas
        parqueadero.ocuparPuesto(3, clasica2);
        Thread.sleep(2000); // Simular tiempo de uso
        parqueadero.liberarPuesto(3);

        parqueadero.ocuparPuesto(4, hibrida2);
        Thread.sleep(2000); // Simular tiempo de uso
        parqueadero.liberarPuesto(4);

        parqueadero.ocuparPuesto(5, carro2);
        Thread.sleep(2000); // Simular tiempo de uso
        parqueadero.liberarPuesto(5);

        // Generar reporte diario con nuevas tarifas
        System.out.println(parqueadero.generarReporteDiario(hoy));
    }

        
}
