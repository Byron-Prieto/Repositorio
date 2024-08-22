package co.edu.uniquindio.poo;

public class MacFactory implements IFactory {

    public Button createButton() {
        
        return new MacButton();
    }

    public TextBox createTextBox() {
        
        return new MacTextBox();
    }
    
}
