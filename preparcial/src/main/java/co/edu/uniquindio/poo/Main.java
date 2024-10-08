package co.edu.uniquindio.poo;

import co.edu.IVehicleFactory;

public class Main {
    public static void main(String[] args) {
        
        IVehicleFactory vehicleFactory = new CarFactory();
        IVehicle car = vehicleFactory.CreateVehicle();
        car.Start();
        

    }
}
