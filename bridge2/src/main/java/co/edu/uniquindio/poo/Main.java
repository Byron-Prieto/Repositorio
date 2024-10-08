package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        
        Ifactory DarkThemeFactory = new DarkThemeFactory();
        Ifactory LightThemeFactory = new LightThemeFactory();

        Theme DarkTheme = new DarkTheme(DarkThemeFactory.createButton(), DarkThemeFactory.creatCheckbox());
        Theme LightTheme = new LightTheme(LightThemeFactory.createButton(), LightThemeFactory.creatCheckbox());

        DarkTheme.applyTheme();
        LightTheme.applyTheme();
    }    
}

