package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.time.Duration;

public class Puesto {

    private Posicion posicion;
    private Vehiculo vehiculo;
    private LocalDateTime horaEntrada;

    public Puesto(Posicion posicion){

        this.posicion = posicion;
        this.vehiculo = null;
        this.horaEntrada = null;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
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

    public Registro liberarPuesto(int numeroPuesto) {
        if (this.vehiculo == null) {
            System.out.println("El puesto ya está libre.");
            return null;
        }
        LocalDateTime horaSalida = LocalDateTime.now();
        double totalPagar = calcularTotalPagar(horaSalida);
        Registro registro = new Registro(this.vehiculo, this.horaEntrada, horaSalida, totalPagar, numeroPuesto);
        this.vehiculo = null;
        this.horaEntrada = null;
        return registro;
    }

    public double calcularTotalPagar(LocalDateTime horaSalida) {
        if (vehiculo != null && horaEntrada != null) {
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            double horas = duracion.toMinutes() / 60.0;
            return horas * vehiculo.getTarifaHora();
        }
        return 0;
    }

    public String toString() {
        return "Puesto [posicion=" + posicion + ", vehiculo=" + (vehiculo != null ? vehiculo.getPlaca() : "vacío") + "]";
    }

}
