/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e17.buscarencoleccionobjetos;

/**
 *
 * @author User
 */
public class Auto {

    private String patente;
    private String color;
    private int kmsRecorridos;

    public Auto(String patente, String color, int kmsRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmsRecorridos = kmsRecorridos;
    }

    public int getKmsRecorridos() {
        return kmsRecorridos;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kmsRecorridos=" + kmsRecorridos + '}';
    }

}
