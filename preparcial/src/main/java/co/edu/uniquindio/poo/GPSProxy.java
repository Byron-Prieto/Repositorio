package co.edu.uniquindio.poo;

public class GPSProxy implements GPS{

    RealGps realGps;
    IVehicle vehicle;

    public GPSProxy(RealGps realGps){
        this.realGps = realGps;
    }

    public void setVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void getLocation() {
        
        if (vehicle != null && vehicle instanceof Car && Car.isRunning()) {
            realGps.getLocation();
        }
        else if (vehicle != null && vehicle instanceof Motorcycle && Motorcycle.isRunning()) {    
        }
        else{
            System.out.println("GPS acces denied. Vehicle is not running");
        }
    }


    
}
