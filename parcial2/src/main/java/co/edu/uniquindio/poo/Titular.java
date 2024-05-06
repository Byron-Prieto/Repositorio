package co.edu.uniquindio.poo;

public class Titular {

    private final String nombre;
    private final String apellido;
    private Cuenta cuenta;

    public Titular (String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){

        return nombre;
    }

    public String getApellido(){

        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
