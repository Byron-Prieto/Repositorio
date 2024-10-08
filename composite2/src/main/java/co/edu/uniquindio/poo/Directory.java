package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    List<FileSystemComponent> components = new ArrayList<>();

    public Directory(){}

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public double getSize() {
    
        return 0;
    }
    

}
