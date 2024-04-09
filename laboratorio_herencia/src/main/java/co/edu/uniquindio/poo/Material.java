package co.edu.uniquindio.poo;

public class Material {

    enum Materiales{

        Arena(10000),
        GramaSintetica(35000),
        GarmaNatural(20000),
        Asfalto(40000);

        private final int valor;

        private Materiales(int valor) {

        this.valor = valor;

        }

        public int getValor() {
        return valor;

    }
    
}
}
