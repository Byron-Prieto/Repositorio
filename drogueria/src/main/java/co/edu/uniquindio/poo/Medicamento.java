package co.edu.uniquindio.poo;

public class Medicamento extends Producto {

    private final double dosis;

    public Medicamento (String codigoProducto, String nombre, String descripcion, String proveedor, int stock, double precio, double dosis){

        super(codigoProducto, nombre, descripcion, proveedor,stock, precio);
        this.dosis = dosis;
    }

    public double getDosis(){

        return dosis;
    }
    
}
