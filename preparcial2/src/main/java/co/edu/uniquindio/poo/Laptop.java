package co.edu.uniquindio.poo;

public class Laptop implements Device {

    public void ChargeWithUSBC(){

        System.out.println("Charging laptop with usb c");
    }

    @Override
    public void charge() {
        ChargeWithUSBC();
    }
    

}
