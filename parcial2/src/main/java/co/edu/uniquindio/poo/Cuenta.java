package co.edu.uniquindio.poo;

public abstract class Cuenta {

    private final String numeroCuenta;
    private double saldo;
    private boolean cuentaActiva;
    private double SALDO_INICIAL = 0.0;
    private Titular titular;

    public Cuenta (String numeroCuenta, double saldo, boolean cuentaActiva, Titular titular){

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cuentaActiva = cuentaActiva;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getCuentaActiva(){

        return cuentaActiva;
    }

    public double getSALDO_INICIAL() {
        return SALDO_INICIAL;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void Depositar(double deposito){

        assert deposito > 0.0;

        saldo += deposito;

        System.out.println("Se ha realizado el deposito");
        
        if(saldo > 0.0) {
            
            cuentaActiva = true;
        }
    }    

    public void consultarSaldo(Cuenta cuenta){

        if (cuentaActiva) {

            System.out.println("El saldo en su cuenta es:" + saldo); 
        }

        else
            System.out.println("No se puede consultar el saldo de una cuenta inactiva");
            
    }

    public abstract void Retirar(double retiro);
    public abstract void transferir(Cuenta destino, double cantidad);
}
