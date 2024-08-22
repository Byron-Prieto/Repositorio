package co.edu.uniquindio.poo;

public class SUV extends Car {
    private SUV(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder{

        @Override
        public SUV build() {
            return new SUV(this);
        }
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() + "}";
    }
}
