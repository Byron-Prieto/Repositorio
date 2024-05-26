package co.edu.uniquindio.poo;
import java.time.LocalDateTime;

public class Registro {
    
    private  LocalDateTime horaEntrada;
    private  LocalDateTime horaSalida;
    private  Vehiculo vehiculo;
    private double totalPagar;
    private int numeroPuesto;
    
    //Método constructor
    public Registro(Vehiculo vehiculo, LocalDateTime horaEntrada, LocalDateTime horaSalida, double totalPagar, int numeroPuesto){

        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.totalPagar = totalPagar;
        this.numeroPuesto = numeroPuesto;
    }
    
    //Métodos get  
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Vehiculo: " + vehiculo.getPlaca() + vehiculo.getModelo() + vehiculo.getPropietario() + ", Hora Entrada: " + horaEntrada + ", Hora Salida: " + horaSalida + ", Total a Pagar: " + totalPagar + ", Puesto:" + numeroPuesto;
    }
}
