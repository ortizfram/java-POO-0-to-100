package e3.cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {

    String CBU;
    String alias;
    double saldo;

    public void mostrarEstado() {
        System.out.println("\n---Estado de Cuenta: ----------");
        System.out.println("alias: " + alias + "\n" + "CBU: " + CBU + "\n" + "saldo: $" + saldo + "\n");
    }

    public double getSaldo() {
        System.out.println("\n---Saldo de Cuenta: ----------");
        System.out.println("saldo: $" + saldo + "\n");
        return saldo;
    }

    public boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    public double introducirMonto() {
        Scanner scan = new Scanner(System.in);
        double monto = -1;
        int intentos = 3;

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Introduce el monto: ");
            monto = scan.nextDouble();

            if (monto <= 0) {
                System.out.println("ERROR: monto introducido debe ser mayor a 0");
                if (i == intentos) {
                    System.out.println("Ya no tienes intentos restantes.");
                    break;
                }
                System.out.println("Tienes " + (intentos - i) + " intentos restantes.");
            } else {
                break;
            }
        }
        return monto;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("\nERROR: monto a depositar debe ser mayor a 0");
            return;
        }
        saldo += monto;
        System.out.println("\n---Depositar: ---------");
        System.out.println("se han depositado: $" + monto + "\n");
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("\nERROR: monto a extraer debe ser mayor a 0");
            return;
        }
        if (saldoDisponible(monto)) {
            saldo -= monto;
            System.out.println("\n---Extraer: ---------");
            System.out.println("se han extraido: $" + monto + "\n");
        } else {
            System.out.println("\nERROR: no posee ese dinero en la cuenta");
            System.out.println("***su saldo actual : $" + saldo + "\n");
        }
    }

}
