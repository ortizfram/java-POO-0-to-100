/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e14.relaciones1an;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Concesionaria c =new Concesionaria("FakeCar");
        
        c.mostrarAutos();
        
        c.agregarAuto(new Auto("123", "Rojo"));
        c.agregarAuto(new Auto("563", "verde"));
        c.agregarAuto(new Auto("333", "Azul"));
        
        c.mostrarAutos();
    }
    
}
