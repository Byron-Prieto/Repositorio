package co.edu.uniquindio.poo;

public class Posicion {
    
    private final String fila;
    private final String columna;
    private Vehiculo vehiculo; 

    public Posicion(String fila, String columna){

        this.fila = fila;
        this.columna = columna;
    }

    public String getFila() {
        return fila;
    }

    public String getColumna() {
        return columna;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    } 
}
