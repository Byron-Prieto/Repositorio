package co.edu.uniquindio.poo.Factories;

import co.edu.uniquindio.poo.Interfaces.ISmartPhone;
import co.edu.uniquindio.poo.Interfaces.ISmartWatch;

public interface IDevicesFactory {

    ISmartPhone CreateSmartPhone();

    ISmartWatch CreateSmartWatch();
}

