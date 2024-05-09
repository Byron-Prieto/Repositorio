package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Parqueadero {

    private final String nombre;
    private final Collection <Puesto> listaPuestos;

    public Collection<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public Parqueadero(String nombre){

        this.nombre = nombre;
        listaPuestos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }
}
