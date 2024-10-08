package co.edu.uniquindio.poo.Devices;

import co.edu.uniquindio.poo.Interfaces.ISmartPhone;

public class SamsungSmartphone extends SmartPhone implements ISmartPhone{

    int pantalla;
    int memoria;
    int almacenamiento;
    String color;

    public SamsungSmartphone(int pantalla, int memoria, int almacenamiento, String color){

        super(pantalla, memoria, almacenamiento, color);

    }

    public void MakeCall(){

        System.out.println("Se está realizando la llamada");
    }
    
    public SamsungSmartphone clonar(){

        return new SamsungSmartphone(this.pantalla, this.memoria, this.almacenamiento, this.color);
    }
}