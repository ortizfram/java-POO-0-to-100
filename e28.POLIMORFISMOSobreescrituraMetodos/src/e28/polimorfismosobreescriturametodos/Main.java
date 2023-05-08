/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e28.polimorfismosobreescriturametodos;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        probar(new Vehiculo());
        probar(new Avion());
        System.out.println("////");
        probar(new BicicletaElectrica());

        
    }
    public static void probar(Vehiculo v) {
        v.encender();
    }
    
}
