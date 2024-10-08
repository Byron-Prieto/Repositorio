package co.edu.uniquindio.poo;

public abstract class Theme {
    
    private Button button;
    private Checkbox checkbox;

    public Theme(Button button, Checkbox checkbox) {
        this.button = button;
        this.checkbox = checkbox;
    }

    public void Render() {
        button.paint();
        checkbox.paint();
    }

    public abstract void applyTheme();
}
