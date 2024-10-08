package co.edu.uniquindio.poo;

public class LightTheme extends Theme {

    Button button;
    Checkbox checkbox;

    public LightTheme(Button button, Checkbox checkbox){

        super(button, checkbox);
    }

    public void applyTheme(){

        System.out.println("Applying light theme");
    }
}
