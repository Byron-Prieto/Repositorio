package co.edu.uniquindio.poo;

public class File implements FileSystemComponent {
    
    double Size;

    public File(double Size){

        this.Size = Size;
    }

    @Override
    public void add() {
        
    }

    @Override
    public double getSize() {
        return Size;
    }


}
