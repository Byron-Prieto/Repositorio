package co.edu.uniquindio.poo;

public class Empleado extends Persona{

    private double salario;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario){

        super(nombre, apellidos, dni, direccion, telefono);
        this.salario = salario;
    }    

    public double getSalario(){

        return salario;
    }

    public void setSalario(double salario){

        this.salario = salario;
    }
    
}
