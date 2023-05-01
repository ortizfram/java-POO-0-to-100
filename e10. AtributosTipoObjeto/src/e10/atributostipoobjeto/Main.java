/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e10.atributostipoobjeto;

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
        Motor m1 = new Motor("12345",1.6,"nafta");
        Auto a1 = new Auto("XYZ666","Tiaf", 170000, "rojo", m1);
        
        System.out.println(m1);
        System.out.println(a1);
        
        System.out.println("\n cambiando estado cilindrada");
        m1.setCilindrada(2.3);
        System.out.println(m1);
        System.out.println(a1);
    }
    
}
