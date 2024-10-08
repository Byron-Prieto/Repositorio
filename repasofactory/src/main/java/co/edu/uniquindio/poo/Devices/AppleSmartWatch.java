package co.edu.uniquindio.poo.Devices;
import co.edu.uniquindio.poo.Interfaces.ISmartWatch;

public class AppleSmartWatch extends SmartWatch implements ISmartWatch {

    int almacenamiento;
    int bateria;
    String color;
    int pantalla;

    public AppleSmartWatch(int pantalla, int almacenamiento, int bateria, String color){

        super(pantalla, almacenamiento, bateria, color);
    }

    public void GetHour(){

        System.out.println("La hora es:");
    }

    public AppleSmartWatch clonar(){

        return new AppleSmartWatch(this.pantalla, this.almacenamiento, this.bateria, this.color);
    }
}
