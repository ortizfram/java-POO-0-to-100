/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e13.arraylist;

import java.util.ArrayList;

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

//        Auto a1 = new Auto("jasdo12","Violeta");
//        Auto a2 = new Auto("XFG555","Azul");
//        Auto a3 = new Auto("GGH666","Roja");
        ArrayList<Auto> autos = new ArrayList<>();

        System.out.println(autos.size());
        System.out.println(autos);

        System.out.println("************************");

        autos.add(new Auto("jasdo12", "Violeta"));
        System.out.println(autos.size());
        System.out.println(autos);

        System.out.println("************************");

        autos.add(new Auto("XFG555", "Azul"));
        System.out.println(autos.size());
        System.out.println(autos);

        System.out.println("************************");

        autos.add(new Auto("GGH666", "Roja"));
        System.out.println(autos.size());
        System.out.println(autos);

        System.out.println("************************");
        
        System.out.println("el 2do auto es: " + autos.get(1));

        System.out.println("************************");
        
        System.out.println("mostrar todos los elementos de la lista:");
        for (int i = 0; i < autos.size(); i++) {
            System.out.println("El auto en posicion " + i + " es " + autos.get(i));
        }

        System.out.println("************************");

        System.out.println("borrar auto en posicion 0");
        autos.remove(0);
        System.out.println(autos.size());
        System.out.println(autos);
    }

}
