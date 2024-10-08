package co.edu.uniquindio.poo.Builders;

import co.edu.uniquindio.poo.Devices.AppleSmartWatch;
import co.edu.uniquindio.poo.Devices.SamsungSmartWatch;

public class SmartWatchBuilder{

    String color;
    int pantalla;
    int almacenamiento;
    int bateria;

    public SmartWatchBuilder color(String color){

        this.color = color;
        return(this);
    }

    public SmartWatchBuilder pantalla(int pantalla){

        this.pantalla = pantalla;
        return(this);
    }

    public SmartWatchBuilder almacenamiento(int almacenamiento){

        this.almacenamiento = almacenamiento;
        return(this);
    }

    public SmartWatchBuilder bateria(int bateria){

        this.bateria = bateria;
        return(this);
    }

    public AppleSmartWatch buildAppleSmartWatch(){
        return new AppleSmartWatch(this.pantalla, this.almacenamiento, this.bateria, this.color);
    }

    public SamsungSmartWatch buildSamsungSmartWatch(){
        return new SamsungSmartWatch(this.pantalla, this.almacenamiento, this.bateria, this.color);
    }

}
