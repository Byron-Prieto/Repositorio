package co.edu.uniquindio.poo.Factories;
import co.edu.uniquindio.poo.Adapter.PayPalAdapter;
import co.edu.uniquindio.poo.GateWays.PayPal;
import co.edu.uniquindio.poo.GateWays.PaymentGateway;

public class PayPalFactory implements PaymentGatewayFactory {

    @Override
    public PaymentGateway creatPaymentGateway() {
        return new PayPalAdapter(new PayPal());
    }
}
