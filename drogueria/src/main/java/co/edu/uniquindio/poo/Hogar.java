package co.edu.uniquindio.poo;

public class Hogar extends Producto {

    private final String indicaciones;

    public Hogar (String codigoProducto, String nombre, String descripcion, String proveedor, int stock, double precio, String indicaciones){

        super(codigoProducto, nombre, descripcion, proveedor,stock, precio);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones(){

        return indicaciones;
    }
    
    
}
