package co.edu.uniquindio.poo;

import co.edu.IVehicleFactory;

public class CarFactory implements IVehicleFactory {

    @Override
    public IVehicle CreateVehicle() {

        return new Car();
    }
    
}
