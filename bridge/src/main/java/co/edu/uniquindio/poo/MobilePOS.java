package co.edu.uniquindio.poo;

public class MobilePOS extends PaymentMethod {

    public MobilePOS(Metodo Metodo){
        super(Metodo);
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Processing " + Metodo + " payment using Mobile POS");
        
    }
}
