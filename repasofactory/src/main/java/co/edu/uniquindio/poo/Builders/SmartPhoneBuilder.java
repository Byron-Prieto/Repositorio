package co.edu.uniquindio.poo.Builders;
import co.edu.uniquindio.poo.Devices.AppleSmartPhone;
import co.edu.uniquindio.poo.Devices.SamsungSmartphone;

public class SmartPhoneBuilder{
    
    String color;
    int pantalla;
    int almacenamiento;
    int memoria;

    public SmartPhoneBuilder color(String color){

        this.color = color;
        return(this);
    }

    public SmartPhoneBuilder pantalla(int pantalla){

        this.pantalla = pantalla;
        return(this);
    }

    public SmartPhoneBuilder almacenamiento(int almacenamiento){

        this.almacenamiento = almacenamiento;
        return(this);
    }

    public SmartPhoneBuilder memoria(int memoria){

        this.memoria = memoria;
        return(this);
    }

    public SamsungSmartphone buildSamsungSmartPhone(){
        return new SamsungSmartphone(this.almacenamiento,this.memoria, this.pantalla, this.color);
    }

    public AppleSmartPhone buildAppleSmartPhone(){
        return new AppleSmartPhone(this.almacenamiento,this.memoria, this.pantalla, this.color);
    }
}
