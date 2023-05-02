/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e16.maxmincoleccionobjetos;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("FakeCar");

        c.agregarAuto(new Auto("123", "Rojo", 1000));
        c.agregarAuto(new Auto("563", "verde", 2000));
        c.agregarAuto(new Auto("333", "Azul", 3000));
        
        System.out.println("auto mayor cant Kms recorridos "+ c.autoMasKmsRecorridos());
        System.out.println("\n");
        System.out.println("auto menor cant Kms recorridos "+ c.autoMenosKmsRecorridos());
    }
    
}
