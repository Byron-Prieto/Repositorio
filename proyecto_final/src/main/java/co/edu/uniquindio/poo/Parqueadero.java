package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;

public class Parqueadero {

    private final String nombre;
    private Puesto[] puestos;
    private ArrayList<Registro> historialVehiculos;
    
    public Parqueadero(String nombre, int cantidadPuestos){

        this.nombre = nombre;
        puestos = new Puesto[cantidadPuestos];
        historialVehiculos = new ArrayList<>();

        for (int k = 0; k < cantidadPuestos; k++) {
            int i = k / 10; 
            int j = k % 10; 
            puestos[k] = new Puesto(new Posicion(i, j));
        }
    
    }

    public boolean verificarDisponibilidad(int numeroPuesto) {
        
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido.");
            return false;
        }
        return !puestos[numeroPuesto].estaOcupado();
    }

    public ArrayList<Registro> getHistorialVehiculos() {
        return historialVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public Puesto[] getPuestos() {
        return puestos;
    }

    public void ocuparPuesto(int numeroPuesto, Vehiculo vehiculo) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido.");
            return;
        }
        if (puestos[numeroPuesto].estaOcupado()) {
            System.out.println("El puesto ya está ocupado.");
            return;
        }
        puestos[numeroPuesto].ocuparPuesto(vehiculo);
        historialVehiculos.add(new Registro(vehiculo, puestos[numeroPuesto].getHoraEntrada(), null, 0, numeroPuesto));
    }

    public void liberarPuesto(int numeroPuesto) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido");
            return;
        }
        Puesto puesto = puestos[numeroPuesto];
        if (puesto.estaOcupado()) {
            Registro registro = puesto.liberarPuesto(numeroPuesto);
            historialVehiculos.add(registro);
            System.out.println("Total a pagar por el puesto número " + numeroPuesto + ": " + registro.getTotalPagar());
        } else {
            System.out.println("El puesto ya está libre");
        }
    }

    public Vehiculo getVehiculoEnPuesto(int numeroPuesto) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido");
            return null;
        }
        return puestos[numeroPuesto].getVehiculo();
    }

    public Propietario getPropietarioVehiculoEnPuesto(int numeroPuesto) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido");
            return null;
        }
        return puestos[numeroPuesto].getVehiculo().getPropietario();
    }

    public double generarReporteMensual(YearMonth mes) {
        double totalMensual = 0;
        for (Registro registro : historialVehiculos) {
            if (registro.getHoraSalida() != null && YearMonth.from(registro.getHoraSalida()).equals(mes)) {
                totalMensual += registro.getTotalPagar();
            }
        }
        return totalMensual;
    }

    public String generarReporteDiario(LocalDate fecha) {
        double totalDiario = 0;
        double totalClasica = 0;
        double totalHibrida = 0;
        double totalCarro = 0;

        for (Registro registro : historialVehiculos) {
            if (registro.getHoraSalida() != null && registro.getHoraSalida().toLocalDate().equals(fecha)) {
                totalDiario += registro.getTotalPagar();

                if (registro.getVehiculo() instanceof Clasica) {
                    totalClasica += registro.getTotalPagar();
                } else if (registro.getVehiculo() instanceof Hibrida) {
                    totalHibrida += registro.getTotalPagar();
                } else if (registro.getVehiculo() instanceof Carro) {
                    totalCarro += registro.getTotalPagar();
                }
            }
        }

        return String.format("Reporte Diario (%s):\nTotal Clasica: $%.2f\nTotal Hibrida: $%.2f\nTotal Carro: $%.2f\nTotal Recaudado: $%.2f",
                             fecha, totalClasica, totalHibrida, totalCarro, totalDiario);
    }

}
