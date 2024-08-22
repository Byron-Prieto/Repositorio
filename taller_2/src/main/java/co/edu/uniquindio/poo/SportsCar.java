package co.edu.uniquindio.poo;

public class SportsCar extends Car {
    private SportsCar(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder{
    
        @Override
        public SportsCar build() {
            return new SportsCar(this);
        }
    }

    @Override
    public String toString() {
        return "SportsCar{" + super.toString() + "}";
    }
}