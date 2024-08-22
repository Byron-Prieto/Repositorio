package co.edu.uniquindio.poo;

public class Car {
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private Boolean airConditioning;

    protected Car(Builder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.airConditioning = builder.airConditioning;
    }

    public static abstract class Builder {
        private String engine;
        private String transmission;
        private int wheels;
        private String color;
        private Boolean airConditioning;
    
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }
    
        public Builder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }
    
        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
    
        public Builder color(String color) {
            this.color = color;
            return this;
        }
    
        public Builder airConditioning(Boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }
    
        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return  "engine='" + engine + '\'' + ", transmission='" + transmission + '\'' + ", wheels='" + wheels + '\'' + 
        ", color='" + color + '\'' +", airConditioning=" + airConditioning;
    }
}