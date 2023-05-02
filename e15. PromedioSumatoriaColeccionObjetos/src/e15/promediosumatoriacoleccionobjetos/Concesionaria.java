/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e15.promediosumatoriacoleccionobjetos;

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

    public int sumatoriaKmsRecorridos() {
        int acu = 0;
        for (Auto a : autos) {
            acu += a.getKmsRecorridos();
        }
        return acu;
    }

    public int cantAutos() {
        return autos.size();
    }

    public double promedioKmsRecorridos() {
//        double promedio = 0;
//        if (cantAutos() > 0) {
//            promedio = (double) sumatoriaKmsRecorridos() / cantAutos();
//        }
//        return promedio;
        return (cantAutos() > 0 
                ?
                    (double) sumatoriaKmsRecorridos() / cantAutos() 
                : 0);
    }
}
