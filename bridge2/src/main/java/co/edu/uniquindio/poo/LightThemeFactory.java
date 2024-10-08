package co.edu.uniquindio.poo;

public class LightThemeFactory implements Ifactory {

    @Override
    public Checkbox creatCheckbox() {
        
        return new LightCheckbox();

    }    

    @Override
    public Button createButton() {
        
        return new LightButton();
    }
    
}
