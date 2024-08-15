package co.edu.uniquindio.poo;

public class PizzaFactory {
    
    public Pizza createPizza(String type){

        switch (type.toLowerCase()) {

            case "Peperoni":
                return new PizzaPeperoni();
                    
            case "Carne":
                return new PizzaCarne();    
        
            default:
            throw new IllegalArgumentException("Tipo de pizza desconocido");
        }
    }
}
