package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.time.Duration;

public class Puesto {

    private Posicion posicion;
    private Vehiculo vehiculo;
    private LocalDateTime horaEntrada;

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public Puesto(Posicion posicion){

        this.posicion = posicion;
        this.vehiculo = null;
        this.horaEntrada = null;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double calcularTotalPagar() {
        if (vehiculo != null && horaEntrada != null) {
            LocalDateTime horaSalida = LocalDateTime.now();
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            double horas = duracion.toMinutes() / 60.0;
            return horas * vehiculo.getTarifaHora();
        }
        return 0;
    }

    public boolean estaOcupado() {
        return vehiculo != null;
    }

    public void ocuparPuesto(Vehiculo vehiculo) {
        if (this.vehiculo == null) {
            this.vehiculo = vehiculo;
            this.horaEntrada = LocalDateTime.now();
        } else {
            System.out.println("El puesto ya está ocupado");
        }
    }

    public void liberarPuesto() {
        this.vehiculo = null;
        this.horaEntrada = null;
    }

}
