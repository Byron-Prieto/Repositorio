package co.edu.uniquindio.poo;

public class Pizza {
     private String dough;
     private String cheese;
     private String souce;
     private String toppings;

    public Pizza(String dough, String cheese, String souce, String toppings) {
        this.dough = dough;
        this.cheese = cheese;
        this.souce = souce;
        this.toppings = toppings;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    

     
}
