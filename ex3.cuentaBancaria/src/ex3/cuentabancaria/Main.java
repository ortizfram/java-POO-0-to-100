/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3.cuentabancaria;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();

//        declare cuenta
        cb.alias = "miCuenta";
        cb.CBU = "123123123";
        cb.saldo = 0;

//        llamando funcion
        cb.mostrarEstado();

        cb.depositar(200);
        System.out.println(cb.getSaldo());
        cb.depositar(-50);
        System.out.println(cb.getSaldo());

        cb.extraer(100);
        System.out.println(cb.getSaldo());
        cb.extraer(50);
        System.out.println(cb.getSaldo());
    }

}
