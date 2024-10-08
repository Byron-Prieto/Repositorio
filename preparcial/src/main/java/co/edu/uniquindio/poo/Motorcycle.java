package co.edu.uniquindio.poo;

public class Motorcycle implements IVehicle {

    static boolean VehicleStarted;
    GPS gps;

    public Motorcycle(){
        this.gps = new GPSProxy(new RealGps());
    }

    @Override
    public void Start() {
        VehicleStarted = true;
        System.out.println("Starting the motorcycle");
    }

    @Override
    public void Stop() {
        VehicleStarted = false;
        System.out.println("Stopping the motorcycle");
    }

    @Override
    public GPS getGps() {

        return gps;
    }

    public static boolean isRunning(){

        return VehicleStarted;
    }
    

}
