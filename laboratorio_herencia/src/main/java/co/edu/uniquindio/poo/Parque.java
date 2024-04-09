package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Parque {

    private final String nombre;
    private final Collection <ZonaParque> zonaParques;
    private Municipio municipioUsado;


    public Collection<ZonaParque> getzZonaParques() {
        return zonaParques;
    }


    public Parque (String nombre){
        assert nombre != null: "El nombre no purde ser nulo";
        this.nombre = nombre;
        zonaParques = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }
    
    public void establecerMunicipioUsado(Municipio municipio) {
        this.municipioUsado = municipio;
    }
    
    public Municipio getMunicipioUsado() {
        return municipioUsado;
    }
}
