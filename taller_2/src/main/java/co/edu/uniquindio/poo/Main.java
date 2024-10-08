package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {

        Car sedan = CarFactory.createSedan();
        System.out.println(sedan);

        Car suv = CarFactory.createSUV();
        System.out.println(suv);

        Car sportsCar = CarFactory.createSportsCar();
        System.out.println(sportsCar);
    }
}

