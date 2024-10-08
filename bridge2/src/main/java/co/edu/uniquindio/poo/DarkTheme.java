package co.edu.uniquindio.poo;

public class DarkTheme extends Theme {

    Button button;
    Checkbox checkbox;

    public DarkTheme(Button button, Checkbox checkbox){

        super(button, checkbox);
    }

    public void applyTheme(){

        System.out.println("Applying dark theme");
    }
}
