package co.edu.uniquindio.poo;

public class Banco {

    private final String nombre;
    private Cuenta cuenta;

    public Banco(String nombre, Cuenta cuenta){

        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre(){
        return nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
