package co.edu.uniquindio.poo;

public class ZonaParque {

    private final String nombre;
    private Figura forma;
    private Material material;

    public ZonaParque(String nombre, Material material){

        assert nombre != null: "El nombre no puede ser nulo";
        this.nombre = nombre;
        this.material = material;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void establecerForma(Figura figura) {
        this.forma = figura;
    }
    
    public Figura getForma() {
        return forma;
    }
    
    public Material getMaterial() {
        return material;
    }
}
