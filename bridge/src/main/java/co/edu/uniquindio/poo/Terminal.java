package co.edu.uniquindio.poo;

public class Terminal extends PaymentMethod {

    public Terminal(Metodo Metodo){
        super(Metodo);
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Processing "+ Metodo + " payment using terminal");
        
    }

    
}
