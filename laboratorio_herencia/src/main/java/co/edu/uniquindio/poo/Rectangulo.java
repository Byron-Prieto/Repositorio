package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {
    
    public Rectangulo (double ancho, double alto){

        assert ancho > 0: "La base debe ser mayor a cero";
        assert alto > 0: "La altura debe ser mayor a cero";
    }
}
