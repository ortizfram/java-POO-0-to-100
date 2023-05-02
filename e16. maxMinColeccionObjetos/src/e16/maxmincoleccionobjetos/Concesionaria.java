/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e16.maxmincoleccionobjetos;

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

    public Auto autoMasKmsRecorridos() {
        Auto autoMax = null;
        int kmsMax = -1;
        for (Auto a : autos) {
            if (a.getKmsRecorridos() > kmsMax) {
                kmsMax = a.getKmsRecorridos();
                autoMax = a;
            }
        }
        return autoMax;
    }
    
        public Auto autoMenosKmsRecorridos() {
        Auto autoMin = null;
        int kmsMin = 1;
        for (Auto a : autos) {
            if (a.getKmsRecorridos() < kmsMin) {
                kmsMin = a.getKmsRecorridos();
                autoMin = a;
            }
        }
        return autoMin;
    }

}
