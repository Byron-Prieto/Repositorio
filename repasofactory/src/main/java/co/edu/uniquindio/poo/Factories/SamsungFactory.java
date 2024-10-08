package co.edu.uniquindio.poo.Factories;

import co.edu.uniquindio.poo.Builders.SmartPhoneBuilder;
import co.edu.uniquindio.poo.Builders.SmartWatchBuilder;
import co.edu.uniquindio.poo.Interfaces.ISmartPhone;
import co.edu.uniquindio.poo.Interfaces.ISmartWatch;

public class SamsungFactory implements IDevicesFactory {
    
    public ISmartWatch CreateSmartWatch(){

        return new SmartWatchBuilder().color("Green").pantalla(1).almacenamiento(12)
        .bateria(2000).buildSamsungSmartWatch();
    }

    public ISmartPhone CreateSmartPhone(){

        return new SmartPhoneBuilder().color("White").almacenamiento(256).memoria(12)
        .pantalla(7).buildSamsungSmartPhone();
    }
}
