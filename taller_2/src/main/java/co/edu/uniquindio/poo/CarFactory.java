package co.edu.uniquindio.poo;

public class CarFactory {
    
    public static Car createSedan() {
        return new Sedan.Builder().engine("V6").transmission("Automatic").wheels(4)
        .color("Black").airConditioning(true).build();
    }

    public static Car createSUV() {
        return new SUV.Builder().engine("V8").transmission("Automatic").wheels(4)
        .color("White").airConditioning(false).build();
    }

    public static Car createSportsCar() {
        return new SportsCar.Builder().engine("V12").transmission("Manual").wheels(4)
        .color("Red").airConditioning(true).build();
    }
}
