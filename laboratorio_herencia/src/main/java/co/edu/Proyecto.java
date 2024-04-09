package co.edu;

import java.util.Collection;
import java.util.LinkedList;

import co.edu.uniquindio.poo.Parque;

public class Proyecto {

    private final String nombre;
    private final Collection <Parque> parques;


    public Collection<Parque> getParques() {
        return parques;
    }


    public Proyecto (String nombre){
        assert nombre != null: "El nombre no puede ser nulo";
        this.nombre = nombre;
        parques = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }
    
}
