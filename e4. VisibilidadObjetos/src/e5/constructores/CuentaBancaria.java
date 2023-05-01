/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4.visibilidadObjetos;

/**
 *
 * @author ortiz
 */
public class CuentaBancaria {

    private double saldo;
    private String alias;
    private String CBU;
//---------------------------

    public void mostrarDatos() {
        System.out.println("\n");
        System.out.println("---Mostrar datos: ---------");
        System.out.println("CBU: " + CBU + " | alias: " + alias + " | saldo: $" + saldo);
    }

    public double getSaldo() {
        System.out.println("\n");
        System.out.println("---Saldo: ---------");
        return saldo;
    }


    public String getAlias() {
        System.out.println("\n");
        System.out.println("---Alias: ---------");
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public String getCBU() {
        System.out.println("\n");
        System.out.println("---CBU: ---------");
        return CBU;
    }


    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    private boolean saldoDisponible(double monto) {
        if (saldo <= monto) {
            System.out.println("ERROR: saldo menor a monto");

        }
        return saldo >= monto;
    }

    public void extraer(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
            System.out.println("---Extraer : ---------");
            System.out.println("**extrajo $" + monto);
        }
    }
}
