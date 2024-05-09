package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Registro {
    
    private final LocalDate fechaIngreso;
    private Vehiculo vehiculo;
    private Puesto puesto;

    public Registro(LocalDate fechaIngreso){

        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Puesto getPuesto() {
        return puesto;
    }
}
