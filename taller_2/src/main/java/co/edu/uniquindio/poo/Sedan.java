package co.edu.uniquindio.poo;

public class Sedan extends Car {
    private Sedan(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder{

        @Override
        public Sedan build() {
            return new Sedan(this);
        }
    }

    @Override
    public String toString() {
        return "Sedan{" + super.toString() + "}";
    }
}
    

