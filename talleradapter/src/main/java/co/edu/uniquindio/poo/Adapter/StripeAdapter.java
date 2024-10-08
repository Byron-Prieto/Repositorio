package co.edu.uniquindio.poo.Adapter;
import co.edu.uniquindio.poo.GateWays.PaymentGateway;
import co.edu.uniquindio.poo.GateWays.Stripe;

public class StripeAdapter implements PaymentGateway {
    
    private Stripe Stripe;

    public StripeAdapter (Stripe Stripe){

        this.Stripe = Stripe;
    }

    public void ProcessPayment (double Amount){

        Stripe.MakePayment(Amount);
    }
}
