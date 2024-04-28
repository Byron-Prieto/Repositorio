package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Drogueria {

    private final String nombre;
    public Collection <Producto> listaProductos;
    private Collection <Cliente> listaClientes;
    private Collection <Empleado> listaEmpleados;
    private Collection <Pedido> listaPedidos;

    public Drogueria (String nombre){

        this.nombre = nombre;
        this.listaProductos = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
        this.listaEmpleados = new LinkedList<>();
        this.listaPedidos = new LinkedList<>();
    }
    
    public String getnombre(){

        return nombre;
    }

    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public Collection<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaPedidos(Collection<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void agregarProductoGerente(Producto producto){

        listaProductos.add(producto);
        System.out.println("Se agregó el producto" + producto.getNombre());

    }

    public void eliminarProductoGerente(String nombreProducto){

        for (Producto producto : listaProductos) {

            if (producto.getNombre().equals(nombreProducto)) {

                listaProductos.remove(producto);
                System.out.println("Se eliminó el producto" + producto.getNombre());
                
            }      
        }       
    }
  
}
