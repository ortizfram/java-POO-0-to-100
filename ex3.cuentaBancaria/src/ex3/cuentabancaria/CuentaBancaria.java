/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3.cuentabancaria;

/**
 *
 * @author User
 */
public class CuentaBancaria {

    String CBU;
    String alias;
    double saldo;

    //       metodo:  mostrar estado
    void mostrarEstado() {
        System.out.println("\n");
        System.out.println("---Estado de Cuenta: ----------");
        System.out.println(alias + "\n" + CBU + "\n" + saldo);
        System.out.println("\n");
    }

    //       metodo:  mostrar saldo
    double getSaldo() {
        System.out.println("\n");
        System.out.println("---Saldo de Cuenta: ----------");
        return saldo;
    }

    //       metodo:  deopositar
    //    no retorna nada entonces void
    //    pasar por param el monto y categoria del dato
    void depositar(double monto) {
        if (monto > 0) {
            System.out.println("monto ingresado: $"+monto);
            saldo += monto;
        } else {
            System.out.println("voy a extraer : $"+monto);
            System.out.println("saldo introducido $"+monto+" menor a $0");
        }
    }
    
    boolean saldoDisponible(double monto){
        System.out.println("saldo disponible para retiro $"+monto+ " ? :");
        return saldo >= monto;
    }
    
    void extraer(double monto){
        if(saldoDisponible(monto)) {
            System.out.println("extrayendo monto: ...");
            saldo -= monto;
            System.out.println("saldo : $"+saldo);
        }
    }
}
