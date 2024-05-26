package co.edu.uniquindio.poo;

public class Posicion {
    
    private final int i;
    private final int j;
    
    //Método constructor
    public Posicion(int i, int j){

        this.i = i;
        this.j = j;
    }
    
    //Métodos get
    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
    
    //Método toString para retornar una representación de cadena del objeto
    @Override
    public String toString() {
        return "Posicion [i=" + i + ", j=" + j + "]";
    }
}
