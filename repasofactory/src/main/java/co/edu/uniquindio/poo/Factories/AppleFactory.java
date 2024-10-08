package co.edu.uniquindio.poo.Factories;

import co.edu.uniquindio.poo.Builders.SmartPhoneBuilder;
import co.edu.uniquindio.poo.Builders.SmartWatchBuilder;
import co.edu.uniquindio.poo.Interfaces.ISmartPhone;
import co.edu.uniquindio.poo.Interfaces.ISmartWatch;

public class AppleFactory implements IDevicesFactory {
    
    public ISmartWatch CreateSmartWatch(){

        return new SmartWatchBuilder().color("Red").pantalla(2).almacenamiento(12)
        .bateria(1500).buildAppleSmartWatch();
    }

    public ISmartPhone CreateSmartPhone(){

        return new SmartPhoneBuilder().color("Black").almacenamiento(512).memoria(12)
        .pantalla(6).buildAppleSmartPhone();
    }

}
