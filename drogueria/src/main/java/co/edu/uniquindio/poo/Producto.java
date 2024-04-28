package co.edu.uniquindio.poo;

public abstract class Producto {

    private final String codigoProducto;
    private final String nombre;
    private final String descripcion;
    private final String proveedor;
    private  int stock;
    private double precio;

    public Producto (String codigoProducto, String nombre, String descripcion, String proveedor, int stock, double precio){

        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }
  
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getStock() {
        return stock;
    }
    
    public double getPrecio() {
        return precio;
    }


    



    
}
