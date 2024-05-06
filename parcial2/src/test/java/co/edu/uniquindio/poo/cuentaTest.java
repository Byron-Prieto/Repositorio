package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class cuentaTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void consultarSaldoCorriente(){

        LOG.info("iniciando test");

        Titular titular = new Titular("Byron", "Prieto");

        Cuenta cuenta = new Corriente("86545039577", 0.0, false, titular, 20.0);

        cuenta.Depositar(50.0);
        cuenta.Retirar(30.0);
        cuenta.Retirar(0.0);
        cuenta.consultarSaldo(cuenta);
    }        
        
    @Test
    public void consultarSaldoAhorro(){

        LOG.info("iniciando test");

        Titular titular = new Titular("Byron", "Prieto");

        Cuenta cuenta = new Ahorro("86545039577", 0.0, false, titular, 0.0);

        cuenta.Depositar(50.0);
        cuenta.Retirar(10.0);
        cuenta.Retirar(20.0);
        cuenta.consultarSaldo(cuenta);
    }        
    @Test
    public void transferirCorriente(){

        LOG.info("iniciando test");

        Titular titular = new Titular("Byron", "Prieto");

        Cuenta origen = new Corriente("86545039577", 110.0, true, titular, 20.0);
        Cuenta destino = new Ahorro("56223465899", 0.0, false, titular, 0.0);

        origen.transferir(destino, 130.0);
        origen.consultarSaldo(origen);
        destino.consultarSaldo(destino);
    }   
    
    @Test
    public void transferirAhorro(){

        LOG.info("iniciando test");

        Titular titular = new Titular("Byron", "Prieto");

        Cuenta cuenta = new Corriente("86545039577", 0.0, false, titular, 20.0);
        Cuenta cuenta1 = new Ahorro("56223465899", 100.0, true, titular, 0.0);

        cuenta1.transferir(cuenta, 100.0);
        cuenta.consultarSaldo(cuenta);
        cuenta1.consultarSaldo(cuenta1);
    } 
}
