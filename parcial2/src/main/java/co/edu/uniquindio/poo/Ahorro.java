package co.edu.uniquindio.poo;

public class Ahorro extends Cuenta {

    private double tasaInters;

    public Ahorro(String numeroCuenta, double saldo, boolean cuentaActiva, Titular titular, double tasaInters){

        super(numeroCuenta, saldo, cuentaActiva, titular);
        this.tasaInters = tasaInters;
    }

    public double getTasaInters() {
        return tasaInters;
    }

    public void setTasaInters(double tasaInters) {
        this.tasaInters = tasaInters;
    }

    @Override
    public void Retirar(double retiro){

        double saldo = super.getSaldo();
        boolean cuentaActiva = super.getCuentaActiva();

        if (retiro > saldo) {
    
            System.out.println("El monto del retiro no puede ser mayor a:" + saldo);
        }
    
        else { 
            
            saldo -= retiro;
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

        if (cantidad <= saldo) {

            Retirar(cantidad);
            destino.Depositar(cantidad);
            System.out.println("Transferencia por: "+ cantidad + " hacia cuenta número: "+ destino.getNumeroCuenta()+ " realizada con exito");
        
        }
        
        else System.out.println("No se puede realizar una transferencia mayor a: "+ saldo);

      }
    }
        
    
    




