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

    public Auto autoMasKmsRecorridos() {
        Auto autoMax = null;
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                autoMax = auto;
            }
        }
        return autoMax;
    }

    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            } else if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                listaDeMaximos.clear();
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }

    public Auto buscarAuto(String patente) {
        Auto autoencontrado = null;
        for (Auto a : autos) {
            if (a.getPatente().equalsIgnoreCase(patente)) {
                autoencontrado = a;
            }
        }
        return autoencontrado;
    }

    public Auto autoMenosKmsRecorridos() {
        Auto autoMin = null;
        int kmsMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() < kmsMin) {
                kmsMin = auto.getKmsRecorridos();
                autoMin = auto;
            }
        }
        return autoMin;
    }

}
