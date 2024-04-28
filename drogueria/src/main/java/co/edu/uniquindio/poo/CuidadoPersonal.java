package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {

    private final String ingredientes;

    public CuidadoPersonal(String codigoProducto, String nombre, String descripcion, String proveedor, int stock, double precio, String ingredientes){

        super(codigoProducto, nombre, descripcion, proveedor,stock, precio);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes(){

        return ingredientes;
    }
    
}
