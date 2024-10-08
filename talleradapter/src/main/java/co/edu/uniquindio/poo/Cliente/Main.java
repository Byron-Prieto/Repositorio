package co.edu.uniquindio.poo.Cliente;

import co.edu.uniquindio.poo.Factories.PayPalFactory;
import co.edu.uniquindio.poo.Factories.PaymentGatewayFactory;
import co.edu.uniquindio.poo.Factories.StripeFactory;
import co.edu.uniquindio.poo.GateWays.PaymentGateway;

public class Main {
    public static void main(String[] args) {
        
        PaymentGatewayFactory PayPalFactory = new PayPalFactory();
        PaymentGatewayFactory StripeFactory = new StripeFactory();
        
        PaymentGateway PayPal = PayPalFactory.creatPaymentGateway();
        PaymentGateway Stripe = StripeFactory.creatPaymentGateway();

        PayPal.ProcessPayment(120);
        Stripe.ProcessPayment(250);

    }
}
