package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone();
        Laptop myLaptop = new Laptop();
        ChargeAdapter chargeAdapter = new ChargeAdapter(myPhone);
        ChargeAdapter chargeAdapter2 = new ChargeAdapter(myLaptop);

        chargeAdapter.ChargeDevice();
        chargeAdapter2.ChargeDevice();
    }
}
