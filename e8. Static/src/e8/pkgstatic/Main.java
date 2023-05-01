/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e8.pkgstatic;

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
        Auto a1 = new Auto("ASD123", "FIAT",123345, "azul");
        Auto a2 = new Auto("ASD1asd23","Dorfg",333345, "Verde");
        Auto a3 = new Auto("ffD123","GaGh",777345, "Rojo");
    
        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
    }
    
}
