package co.edu.uniquindio.poo.Adapter;
import co.edu.uniquindio.poo.GateWays.PayPal;
import co.edu.uniquindio.poo.GateWays.PaymentGateway;

public class PayPalAdapter implements PaymentGateway {
    
    private PayPal PayPal;

    public PayPalAdapter(PayPal PayPal){
        this.PayPal = PayPal;
    }

    public void ProcessPayment(double Amount){

        PayPal.SendPayment(Amount);
    }
}
