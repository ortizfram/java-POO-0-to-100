/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e14.relaciones1an;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Concesionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>(); // NO OLVIDAR INSTANCIAR ARRAY en constructor
    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
//            for (int i = 0; i < autos.size(); i++) {
//                Auto a = autos.get(i);
//                System.out.println(a);
//            }

// FOR EACH
              for (Auto a : autos) {
                  System.out.println(a);
            }
        }
    }
}
