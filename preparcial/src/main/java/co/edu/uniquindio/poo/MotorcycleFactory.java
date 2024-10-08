package co.edu.uniquindio.poo;

import co.edu.IVehicleFactory;

public class MotorcycleFactory implements IVehicleFactory {

    @Override
    public IVehicle CreateVehicle() {

        return new Motorcycle();
    }
    
}
