package co.edu.uniquindio.poo;

public class Empleado implements Componente {
    
    String nombre;
    int salario;
    int edad;

    public Empleado(String nombre, int salario, int edad){

        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    @Override
    public String obtenerNombre() {
        
        return nombre;
    }

    @Override
    public int obtenerSalario() {
        
        return salario;
    }

    @Override
    public int obtenerEdad() {
        
        return edad;
    }
}
