package co.edu.uniquindio.poo;

public class Corriente extends Cuenta {

    private double limiteSobregiro;

    public Corriente(String numeroCuenta, double saldo, boolean cuentaActiva, Titular titular, double limiteSobregiro){

        super(numeroCuenta, saldo, cuentaActiva, titular);
        this.limiteSobregiro = limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    @Override
    public void Retirar(double retiro){

    double saldo = super.getSaldo();
    boolean cuentaActiva = super.getCuentaActiva();

    if (retiro > saldo + limiteSobregiro) {

        System.out.println("El monto del retiro no puede ser mayor a:" + (saldo + limiteSobregiro));
    }

    else { 
        limiteSobregiro = limiteSobregiro - (saldo+limiteSobregiro-retiro);
        saldo = saldo - retiro;
        super.setSaldo(saldo);
        System.out.println("Se ha realizado el retiro");
    }

    if (saldo<= 0.0) {
        
        cuentaActiva = false;
        super.setCuentaActiva(cuentaActiva);
    }  
   }

   @Override
   public void transferir(Cuenta destino, double cantidad){
        double saldo = super.getSaldo();

        if (cantidad <= saldo + limiteSobregiro) {

            Retirar(cantidad);
            destino.Depositar(cantidad);
            System.out.println("Transferencia por: "+ cantidad + " hacia cuenta número: "+ destino.getNumeroCuenta()+ " realizada con exito");
        
        }
        
        else System.out.println("No se puede realizar una transferencia mayor a: "+ (saldo+limiteSobregiro));

   }


}
