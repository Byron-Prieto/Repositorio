package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Componente {
    
    private String nombre;
    private int edad;
    private int salario;
    private List<Componente> componentes = new ArrayList<>();
    
    public Manager(String nombre, int edad, int salario) {

        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void agregarComponente(Componente componente){

        componentes.add(componente);
    }

    @Override
    public String obtenerNombre() {
        
        return nombre;
    }

    
    public int obtenerSalarioPersonasCargo() {
       
        int salarioTotal = 0;
        for(Componente componente : componentes){
            salarioTotal += componente.obtenerSalario();
        }

        return salarioTotal + salario;
    }

    @Override
    public int obtenerEdad() {
        
        return edad;
    }

    @Override
    public int obtenerSalario() {
        
        return salario;
    }
}
