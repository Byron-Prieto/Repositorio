package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        // Crear un Sedan usando el Factory Method
        Car sedan = CarFactory.createSedan();
        System.out.println(sedan);

        // Crear un SUV usando el Factory Method
        Car suv = CarFactory.createSUV();
        System.out.println(suv);

        // Crear un SportsCar usando el Factory Method
        Car sportsCar = CarFactory.createSportsCar();
        System.out.println(sportsCar);
    }
}

