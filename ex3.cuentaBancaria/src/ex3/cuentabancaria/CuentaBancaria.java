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

    void mostrarEstado() {
        System.out.println("\n");
        System.out.println("---Estado de Cuenta: ----------");
        System.out.println(alias + "\n" + CBU + "\n" + saldo);
        System.out.println("\n");
    }

    double getSaldo() {
        System.out.println("\n");
        System.out.println("---Saldo de Cuenta: ----------");
        return saldo;
    }

    double introducirMonto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el monto: ");
        double monto = scanner.nextDouble();
        return monto;
    }

    double depositar(double saldo) {
        System.out.println("---Depositar: ---------");
        introducirMonto();
        System.out.println("");
        if (monto >=) {
            saldo += monto;
        }
        return saldo;
    }

    double saldoDisponible(double monto) {
        if (saldo >= monto) {
            return saldo;
        }

    }

}
