package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {
         PizzaFactory pizzaFactory = new PizzaFactory();
         Pizza pizza1 = pizzaFactory.createPizza("Carne");
         Pizza pizza2 = pizzaFactory.createPizza("Peperoni");
         pizza1.prepare();
         pizza2.prepare();
    }
}
