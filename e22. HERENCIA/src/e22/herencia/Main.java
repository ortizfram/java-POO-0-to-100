/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e22.herencia;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a = new Auto();
        Moto m = new Moto();
        
        
        a.acelerar();
        a.prenderAire();
        m.hacerWheelie();
        m.acelerar();
    }

}
