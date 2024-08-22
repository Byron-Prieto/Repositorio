package co.edu.uniquindio.poo;

public class WindowsFactory implements IFactory {
   
    public Button createButton() {
       
        return new WindowsButton();
    }

    public TextBox createTextBox() {
        
        return new WindowsTextBox();
    }
    
}
