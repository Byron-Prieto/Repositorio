package co.edu.uniquindio.poo;

public abstract class PaymentMethod {

    protected Metodo Metodo;

    public PaymentMethod(Metodo Metodo){
        this.Metodo = Metodo;
    }
    
    abstract void ProcessPayment();

}
