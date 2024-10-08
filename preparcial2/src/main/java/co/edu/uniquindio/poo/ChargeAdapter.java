package co.edu.uniquindio.poo;

public class ChargeAdapter {
    
    Device device;

    public ChargeAdapter(Device device){

        this.device = device;
    }

    public void ChargeDevice() {
        
        device.charge();
    }


}
