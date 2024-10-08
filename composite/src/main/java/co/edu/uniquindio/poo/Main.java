package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        
        Componente Empleado1 = new Empleado("Daniel", 1200000, 22);
        Componente Empleado2 = new Empleado("Tomás", 1500000, 26);
        Componente Empleado3 = new Empleado("Esteban", 1000000, 21);

        Manager Manager1 = new Manager("Byron", 20, 5000000);

        Manager1.agregarComponente(Empleado1);
        Manager1.agregarComponente(Empleado2);

        Manager subManager = new Manager("Jorge", 22, 3000000);

        subManager.agregarComponente(Empleado3);
        

        System.out.println(subManager.obtenerSalarioPersonasCargo());
        System.out.println(subManager.obtenerSalario());

        System.out.println(Manager1.obtenerSalarioPersonasCargo());
        System.out.println(Manager1.obtenerSalario());
    }
}
