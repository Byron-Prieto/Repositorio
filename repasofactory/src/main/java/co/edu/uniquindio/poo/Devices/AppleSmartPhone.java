package co.edu.uniquindio.poo.Devices;
import co.edu.uniquindio.poo.Interfaces.ISmartPhone;

public class AppleSmartPhone extends SmartPhone implements ISmartPhone {

    int almacenamiento;
    int memoria;
    int pantalla;
    String color;

    public AppleSmartPhone(int pantalla, int memoria, int almacenamiento, String color){

        super(pantalla, memoria, almacenamiento, color);
    }

    public void MakeCall(){

        System.out.println("Se está realizando la llamada");
    }

    public AppleSmartPhone clonar(){

        return new AppleSmartPhone(this.pantalla, this.memoria, this.almacenamiento, this.color);
    }
}
