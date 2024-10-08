package co.edu.uniquindio.poo.Main;
import co.edu.uniquindio.poo.Factories.AppleFactory;
import co.edu.uniquindio.poo.Factories.IDevicesFactory;
import co.edu.uniquindio.poo.Factories.SamsungFactory;
import co.edu.uniquindio.poo.Interfaces.ISmartPhone;
import co.edu.uniquindio.poo.Interfaces.ISmartWatch;

public class Main {
    public static void main(String[] args) {
        
        IDevicesFactory SamsungFactory = new SamsungFactory();
        IDevicesFactory AppleFactory = new AppleFactory();
        ISmartWatch SamsungSmartWatch = SamsungFactory.CreateSmartWatch();
        ISmartPhone SamsungSmartphone = SamsungFactory.CreateSmartPhone();
        ISmartWatch AppleSmartWatch = AppleFactory.CreateSmartWatch();
        ISmartPhone AppleSmartPhone = AppleFactory.CreateSmartPhone();

        AppleSmartPhone.clonar();
        AppleSmartWatch.clonar();
        SamsungSmartWatch.clonar();
        SamsungSmartphone.clonar();

        SamsungSmartWatch.GetHour();
        SamsungSmartphone.MakeCall();
        AppleSmartWatch.GetHour();
        AppleSmartPhone.MakeCall();
    }
}
