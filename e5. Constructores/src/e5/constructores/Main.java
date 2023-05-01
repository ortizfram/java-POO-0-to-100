/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e5.constructores;

/**
 *
 * @author ortiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cb = new CuentaBancaria("alias1","pesos","caja De Ahorro");
        CuentaBancaria cb2 = new CuentaBancaria("gorilla","dolar","caja De Ahorro");
        CuentaBancaria cb3 = new CuentaBancaria("xx222","euro","caja De Ahorro");

        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
  
    }

}
