package co.edu.uniquindio.poo.Devices;
import co.edu.uniquindio.poo.Interfaces.ISmartWatch;

public class SamsungSmartWatch extends SmartWatch implements ISmartWatch {

    int pantalla;
    String color;
    int almacenamiento;
    int bateria;

    public SamsungSmartWatch(int pantalla, int almacenamiento, int bateria, String color){

        super(pantalla, almacenamiento, bateria, color);
    }

    public void GetHour(){

        System.out.println("La hora es:");
    }

    public SamsungSmartWatch clonar(){

        return new SamsungSmartWatch(this.pantalla, this.almacenamiento, this.bateria, this.color);
    }

    
     
    
}
