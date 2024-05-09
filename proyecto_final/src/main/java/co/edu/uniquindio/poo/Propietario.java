package co.edu.uniquindio.poo;

public class Propietario {
    
    private final String nombre;
    private final String apellido;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
