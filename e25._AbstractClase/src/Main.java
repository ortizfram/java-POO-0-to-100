/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ortiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria();
        
        c.agregarVehiculos(new Auto(true,"MarcaFalsa", "TYV", "555yyy"));
        c.agregarVehiculos(new Moto(22,"MarcaFalsa", "ttt", "asd111"));
        
        
    }
    
}
