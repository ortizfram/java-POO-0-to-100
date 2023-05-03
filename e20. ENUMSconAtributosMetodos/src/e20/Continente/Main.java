/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e20.Continente;


public class Main {

    public static void main(String[] args) {
        Continente[] continentes = Continente.values();
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i]);
        }
        
        System.out.println("******************* \n densidad poblacional :");
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].densidadPob());
        }
    }

}
