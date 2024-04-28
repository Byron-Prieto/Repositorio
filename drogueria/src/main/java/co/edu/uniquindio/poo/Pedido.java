package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {

    private final int cantidad;
    private final LocalDate fecha;
    private final Cliente clientePedido;
    private final Producto productoPedido;

    public Pedido(int cantidad, LocalDate fecha,Cliente clientePedido, Producto productoPedido){

        this.cantidad = cantidad;
        this.fecha = fecha;
        this.clientePedido = clientePedido;
        this.productoPedido = productoPedido;
    }

    public int getCantidad(){

        return cantidad;
    }

    public LocalDate getFecha(){

        return fecha;
    }

    public Cliente getClientePedido(){

        return clientePedido;
    }

    public Producto getProductoPedido(){

        return productoPedido;
    }
    
}
