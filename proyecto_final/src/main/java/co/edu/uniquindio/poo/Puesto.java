/**
 * Clase para permitir la creación de puestos para el parqueadero
 * @author Juan Daniel Vera, Andres Felipe Herrera y Byron Prieto
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;
import java.time.LocalDateTime;
import java.time.Duration;

public class Puesto {

    private Posicion posicion;
    private Vehiculo vehiculo;
    private LocalDateTime horaEntrada;
    
    //Método constructor
    public Puesto(Posicion posicion){

        this.posicion = posicion;
        this.vehiculo = null;
        this.horaEntrada = null;
    }
    
    //Métodos get  
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    //Método para saber si un puesto está ocupado
    public boolean estaOcupado() {
        return vehiculo != null;
    }
    
    //Método para ocupar un puesto cuando un vehiculo vaya a usarlo
    public void ocuparPuesto(Vehiculo vehiculo) {
        if (this.vehiculo == null) {
            this.vehiculo = vehiculo;
            this.horaEntrada = LocalDateTime.now();
        } else {
            System.out.println("El puesto ya está ocupado");
        }
    }
    
    //Método para liberar un puesto cuando un vehiculo deje de usarlo,
    //calcular el total a pagar y generar un registro del vehículo
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
    
    //Método para calcular el costo total de estacionamiento de un vehículo basado  
    //en el tiempo de uso y la tarifa por hora correspondiente a su tipo
    /**
     * 
     * @param horaSalida
     * @return
     */
    public double calcularTotalPagar(LocalDateTime horaSalida) {
        if (vehiculo != null && horaEntrada != null) {
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            double horas = duracion.toMinutes() / 60.0;
            return horas * vehiculo.getTarifaHora();
        }
        return 0;
    }
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Puesto [posicion=" + posicion + ", vehiculo=" + (vehiculo != null ? vehiculo.getPlaca() : "vacío") + "]";
    }

}
