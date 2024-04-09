package co.edu.uniquindio.poo;

public abstract class Figura {
    
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public static double calcularAreaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
    
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
    
            return (base * altura) / 2;
        }
}
