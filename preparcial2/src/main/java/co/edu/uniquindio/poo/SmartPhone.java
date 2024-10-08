package co.edu.uniquindio.poo;

public class SmartPhone implements Device {

    public void ChargeWithLightning(){

        System.out.println("Charging with lightning");
    }

    @Override
    public void charge() {

        ChargeWithLightning();
    }
    
}
