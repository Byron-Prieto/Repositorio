package co.edu.uniquindio.poo;

public class Car implements IVehicle {

    static boolean VehicleStarted = false;
    GPS gps;

    public Car(){
        gps = new GPSProxy(new RealGps());
    }

    @Override
    public void Start() {
        VehicleStarted = true;
        System.out.println("Starting the car");
    }

    @Override
    public void Stop() {
        VehicleStarted = false;
        System.out.println("Stopping the car");
    }

    @Override
    public GPS getGps() {
         
        return gps;
    }

    public static boolean isRunning(){

        return VehicleStarted;
    }
    
}
