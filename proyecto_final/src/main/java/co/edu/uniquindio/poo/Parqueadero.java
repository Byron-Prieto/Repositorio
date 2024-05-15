package co.edu.uniquindio.poo;

public class Parqueadero {

    private final String nombre;
    private Puesto[] puestos;
    
    public Parqueadero(String nombre, int cantidadPuestos){

        this.nombre = nombre;
        puestos = new Puesto[cantidadPuestos];
        for (int k = 0; k < cantidadPuestos; k++) {
            int i = k / 10; 
            int j = k % 10; 
            puestos[k] = new Puesto(new Posicion(i, j));
        }
    
    }

    public boolean verificarDisponibilidad(int numeroPuesto) {
        
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido.");
            return false;
        }
        return !puestos[numeroPuesto].estaOcupado();
    }

    public String getNombre() {
        return nombre;
    }

    public Puesto[] getPuestos() {
        return puestos;
    }

    public void ocuparPuesto(int numeroPuesto, Vehiculo vehiculo) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido");
            return;
        }
        puestos[numeroPuesto].ocuparPuesto(vehiculo);
    }

    public void liberarPuesto(int numeroPuesto) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido");
            return;
        }
        Puesto puesto = puestos[numeroPuesto];
        if (puesto.estaOcupado()) {
            double totalPagar = puesto.calcularTotalPagar();
            System.out.println("Total a pagar por el puesto número " + numeroPuesto + ": " + totalPagar);
            puesto.liberarPuesto();
        } else {
            System.out.println("El puesto ya está libre");
        }
    }

    public Vehiculo getVehiculoEnPuesto(int numeroPuesto) {
        if (numeroPuesto < 0 || numeroPuesto >= puestos.length) {
            System.out.println("El número de puesto no es válido");
            return null;
        }
        return puestos[numeroPuesto].getVehiculo();
    }

}
