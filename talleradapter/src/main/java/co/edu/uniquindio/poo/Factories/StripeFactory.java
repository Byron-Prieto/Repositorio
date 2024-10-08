package co.edu.uniquindio.poo.Factories;
import co.edu.uniquindio.poo.Adapter.StripeAdapter;
import co.edu.uniquindio.poo.GateWays.PaymentGateway;
import co.edu.uniquindio.poo.GateWays.Stripe;

public class StripeFactory implements PaymentGatewayFactory {
    
    @Override
    public PaymentGateway creatPaymentGateway() {
        return new StripeAdapter(new Stripe());
    }
}
