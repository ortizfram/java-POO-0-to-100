/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3.cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CuentaBancaria {
// declare variables

    String CBU;
    String alias;
    double saldo;
//----------------------------------------METHODS----

    void mostrarEstado() {
        System.out.println("\n");
        System.out.println("---Estado de Cuenta: ----------");
        System.out.println("alias: "+alias + "\n" + "CBU: "+CBU + "\n" + "saldo: $"+saldo);
        System.out.println("\n");
    }

    double getSaldo() {
        System.out.println("\n");
        System.out.println("---Saldo de Cuenta: ----------");
        return saldo;
    }

    boolean saldoDisponible (double monto) {
        return saldo >= monto;
    }
    
//    si monto menor 0 retorna 0, sino retorna monto
    double introducirMonto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el monto: ");
        double monto = scanner.nextDouble();
        if (monto >= 0) {
            return monto;
        } else {
            System.out.println("ERROR: monto introducido menor a 0");
            return 0.0; // valor de retorno predeterminado
        }
    }

    void depositar(double monto) {
        System.out.println("---Depositar: ---------");
        introducirMonto();
        saldo += monto;
        System.out.println("'se han depositado: $" + monto + "'");

    }

    void extraer(double monto) {
        System.out.println("---Extraer: ---------");
        introducirMonto();
        saldo -= monto;
        System.out.println("'se han extraido: $" + monto + "'");

    }

}
