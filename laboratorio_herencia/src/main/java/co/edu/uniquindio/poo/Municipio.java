package co.edu.uniquindio.poo;

public class Municipio {

    enum Municipios{
        Armenia(0),
        Calarca(10000),
        Montenegro(20000),
        Quimbaya(30000),
        Tebaida(15000),
        Circasia(18000),
        Filandia(22000),
        Genova(70000),
        Salento(50000),
        Pijao(40000),
        Cordoba(30000),
        Buenavista(35000);

        private final int valor;

        private Municipios (int valor){

            this.valor = valor;
        }

        public int getValor() {
            return valor;

    }
    
}
}
