package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;

public class Veterinaria {
    private final String nombre;
    private final Collection <Mascota> listaMascotas;

    public Veterinaria(String nombre){
        assert nombre != null & !nombre.isBlank(): "El nombre no puede ser null ni vacio";
        this.nombre = nombre;
        this.listaMascotas = new LinkedList <Mascota> ();

    }

   public String getNombre(){

        return nombre;
   }

   public Collection <Mascota> getListaMascotas(){

        return Collections.unmodifiableCollection(listaMascotas);
   }

   public void registrarMascota (Mascota mascota){
        assert verificarNumeroIdentificacion(mascota.numeroIdentificacion())== false: "Ya existe una mascota con ese numero de identificacion "+mascota.numeroIdentificacion();
         listaMascotas.add(mascota);
   }

private boolean verificarNumeroIdentificacion(String numeroIdentificacion) {

    boolean existeMascota = false;

    for (Mascota mascota : listaMascotas) {
        if (mascota.numeroIdentificacion().equals(numeroIdentificacion)){
            existeMascota = true;

        }
        
    }

    return existeMascota;
}
}



