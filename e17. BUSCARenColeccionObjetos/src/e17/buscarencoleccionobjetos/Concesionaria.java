/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e17.buscarencoleccionobjetos;

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
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public int cantAutos() {
        return autos.size();
    }

    public Auto buscarAuto(String patente) {
        Auto autoEncontrado = null;
        int i = 0;
        while (i < cantAutos() && autoEncontrado == null) {
            Auto a = this.autos.get(i); 
            System.out.println("Checking auto: " + a.getPatente() + "...");
            if (a.getPatente().equalsIgnoreCase(patente)) {
                autoEncontrado = a;
                break;
            }
            i++;
        }
        return autoEncontrado;
    }

}
