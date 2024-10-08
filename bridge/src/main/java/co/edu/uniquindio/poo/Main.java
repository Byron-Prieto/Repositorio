package co.edu.uniquindio.poo;


public class Main {
    public static void main(String[] args) {
        
        PaymentMethod TerminalPayPal = new Terminal(new Paypal());
        PaymentMethod MobilePOSCreditCard = new MobilePOS(new Paypal());

        PaymentMethod TerminalCreditCard = new Terminal(new CreditCard());
        PaymentMethod MobilePOSPayPal = new MobilePOS(new CreditCard());

        TerminalPayPal.ProcessPayment();
        TerminalCreditCard.ProcessPayment();

        MobilePOSCreditCard.ProcessPayment();
        MobilePOSPayPal.ProcessPayment();
       




    }
}
