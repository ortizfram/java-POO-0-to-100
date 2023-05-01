/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6.sobrecarga.de.constructores;

/**
 *
 * @author ortiz
 */
public class CuentaBancaria {

    private double saldo;
    private String alias;
    private String CBU;
    private String moneda;
    private String tipo;
//---------------------------
//    CONSTRUCTOR 3 strings

    public CuentaBancaria(String alias, String moneda, String tipo) {
        System.out.println("Nacimiento objeto: " + this);
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }

    //    CONSTRUCTOR 2 strings
//    llama al constructor mas grande
    public CuentaBancaria(String moneda, String tipo) {
        this( "ALIAS.POR.DEFAULT" ,moneda, tipo);
    }
    
        //    CONSTRUCTOR vacio
    public CuentaBancaria() {
     
    }

// __________________________________
    public void mostrarDatos() {
        System.out.println("\n");
        System.out.println("---Mostrar datos: ---------");
        System.out.println("CBU: " + CBU + " | alias: " + alias + " \nsaldo: $ " + saldo + " | moneda: " + moneda + " | tipo: " + tipo);
    }

    private String generarCBU() {
        return "12345678";//PENDIENTE
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

    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
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
