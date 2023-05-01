/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e12.integradordepoo;

/**
 *
 * @author User
 */
public class Postnet {

    private static final double RECARGO_POR_CUOTA = 0.3;
    private static final int MIN_CANT_CUOTAS = 1;
    private static final int MAX_CANT_CUOTAS = 6;
    
    public Ticket efectuarPago(TarjetadeCredito tarjeta, double montoAAbonar, int cantCuotas) {
        Ticket elTicket = null;
        
        if (datosValidos(tarjeta, montoAAbonar, cantCuotas)) {
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if (tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return elTicket;
    }
    
    private boolean datosValidos(TarjetadeCredito tarjeta,double monto,int cant) {
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >=  MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        
        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }
    
    private double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
}
