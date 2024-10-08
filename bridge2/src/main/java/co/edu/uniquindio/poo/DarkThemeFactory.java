package co.edu.uniquindio.poo;

public class DarkThemeFactory implements Ifactory {

    @Override
    public Checkbox creatCheckbox() {
       
        return new DarkCheckbox();
    }

    @Override
    public Button createButton() {
        
        return new DarkButton();
    }
    
   
}
